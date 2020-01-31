#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

git diff --quiet || (echo "You have uncommitted changes, please try again after cleaning up." && exit 1)

PROJECT=$1
LANGUAGE=$2

git checkout -b "$(date +%Y-%m-%dT%H-%M)-$PROJECT-$LANGUAGE"

case "$LANGUAGE" in
  kotlin)
    SOURCE_CODE_DIRECTORY=$(find ./src  -type d -name selectionsort)
    ;;
esac

rm -rf "${SOURCE_CODE_DIRECTORY:?}/*"

git commit -a -m "Remove previous solution"
