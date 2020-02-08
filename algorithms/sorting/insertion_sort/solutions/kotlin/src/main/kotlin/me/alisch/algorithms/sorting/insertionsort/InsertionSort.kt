package me.alisch.algorithms.sorting.insertionsort

fun <T: Comparable<T>> sort(array: Array<T>): Array<T> {

    (array.indices).forEach { index ->
        var j = index
        while (j > 0  && array[j] < array[j-1] ) {
            val temp = array[j-1]
            array[j-1] = array[j]
            array[j] = temp
            j--
        }
    }

    return array
}
