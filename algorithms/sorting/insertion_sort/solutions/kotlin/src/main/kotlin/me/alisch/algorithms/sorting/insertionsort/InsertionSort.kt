package me.alisch.algorithms.sorting.insertionsort

fun <T: Comparable<T>> sort(array: Array<T>): Array<T> {

    (array.indices).forEach { index ->
        var j = index
        while (j > 0  && array[j] < array[j-1] ) {
            array.swap(j, j-1)
            j--
        }
    }

    return array
}

private fun <T: Comparable<T>> Array<T>.swap(first: Int, with: Int) {
    val temp = this[first]
    this[first] = this[with]
    this[with] = temp
}
