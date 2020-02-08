package me.alisch.algorithms.sorting.selectionsort

fun <T: Comparable<T>> sort(array: Array<T>): Array<T> {

    (array.indices).forEach { index ->
        var min = index
        (index until array.size).forEach { current ->
            if(array[current] < array[min]) {
                min = current
            }
        }

        val temp = array[index]
        array[index] = array[min]
        array[min] = temp
    }

    return array
}
