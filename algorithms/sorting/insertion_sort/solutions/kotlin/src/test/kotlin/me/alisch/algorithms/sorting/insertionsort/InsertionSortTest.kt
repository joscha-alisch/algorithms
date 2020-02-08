package me.alisch.algorithms.sorting.insertionsort

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test


class InsertionSortTest {
    @Test
    fun `sorts array`() {
        val array = arrayOf(4, 2, 6, 1, 7, 5, 8, 3)

        assertThat(sort(array).toList(), equalTo(arrayOf(1, 2, 3, 4, 5, 6, 7, 8).toList()))
    }
}
