package me.alisch.algorithms.sorting.selectionsort

fun <T: Comparable<T>> sort(array: Array<T>): Array<T> {
    (array.indices).forEach { index ->
        val minIndex = array.indexOfMin(startingPoint = index)
        array.swap(minIndex, index)
    }

    return array
}

private fun <T: Comparable<T>> Array<T>.indexOfMin(startingPoint: Int = 0): Int {
    var minIndex = startingPoint
    (startingPoint until size).forEach { current ->
        if(this[current] < this[minIndex]) {
            minIndex = current
        }
    }
    return minIndex
}

private fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}
