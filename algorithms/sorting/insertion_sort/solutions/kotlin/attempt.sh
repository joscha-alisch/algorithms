#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

readonly BASE_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd "$BASE_DIR"

"$(git rev-parse --show-toplevel)"/helper/attempt.sh insertionsortt kotlin
