package com.vinayshenoy.rxexercise

import com.vinaysshenoy.rxexercise.RxExercise01
import org.junit.Test

class RxExercise01Test {

    private val rxExercise01 = RxExercise01()

    @Test
    fun findOddNumbersActuallyFindsOddNumbersInList() {
        rxExercise01
                .findOddNumbers(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValues(1, 3, 5)
                .assertComplete()
    }

    @Test
    fun findOddNumbersCompletesWithoutValuesOnNoOddNumbersPresent() {
        rxExercise01
                .findOddNumbers(listOf(2, 4))
                .test()
                .await()
                .assertNoValues()
                .assertComplete()
    }

    @Test
    fun findOddNumbersCompletesWithoutValuesOnEmptyInput() {
        rxExercise01
                .findOddNumbers(emptyList())
                .test()
                .await()
                .assertNoValues()
                .assertComplete()
    }

    @Test
    fun findEvenNumbersActuallyFindsEvenNumbersInList() {
        rxExercise01
                .findEvenNumbers(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValue(listOf(2, 4))
    }

    @Test
    fun findEvenNumbersCompletesWithEmptyListOnNoEvenNumbersPresent() {
        rxExercise01
                .findEvenNumbers(listOf(1, 3, 5))
                .test()
                .await()
                .assertValue(emptyList())
                .assertComplete()
    }

    @Test
    fun findEvenNumbersCompletesWithEmptyListOnEmptyInput() {
        rxExercise01
                .findEvenNumbers(emptyList())
                .test()
                .await()
                .assertValue(emptyList())
                .assertComplete()
    }

}