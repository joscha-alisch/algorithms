package me.alisch.algorithms.sorting.selectionsort

fun <T: Comparable<T>> sort(array: Array<T>): Array<T> {
    (array.indices).forEach { index ->
        var minIndex = index
        (index until array.size).forEach { current ->
            if(array[current] < array[minIndex]) {
                minIndex = current
            }
        }

        array.swap(minIndex, index)
    }

    return array
}

private fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}
