package com.vinayshenoy.rxexercise

import com.vinaysshenoy.rxexercise.RxExercise01
import org.junit.Test

class RxExercise01Test {

    private val rxExercise01 = RxExercise01()

    @Test
    fun findOddNumbers_ActuallyFindsOddNumbersInList() {
        rxExercise01
                .findOddNumbers(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValues(1, 3, 5)
                .assertComplete()
    }

    @Test
    fun findOddNumbers_CompletesWithoutValues_OnNoOddNumbersPresent() {
        rxExercise01
                .findOddNumbers(listOf(2, 4))
                .test()
                .await()
                .assertNoValues()
                .assertComplete()
    }

    @Test
    fun findOddNumbers_CompletesWithoutValues_OnEmptyInput() {
        rxExercise01
                .findOddNumbers(emptyList())
                .test()
                .await()
                .assertNoValues()
                .assertComplete()
    }

    @Test
    fun findEvenNumbers_ActuallyFindsEvenNumbersInList() {
        rxExercise01
                .findEvenNumbers(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValue(listOf(2, 4))
    }

    @Test
    fun findEvenNumbers_CompletesWithEmptyList_OnNoEvenNumbersPresent() {
        rxExercise01
                .findEvenNumbers(listOf(1, 3, 5))
                .test()
                .await()
                .assertValue(emptyList())
                .assertComplete()
    }

    @Test
    fun findEvenNumbers_CompletesWithEmptyList_OnEmptyInput() {
        rxExercise01
                .findEvenNumbers(emptyList())
                .test()
                .await()
                .assertValue(emptyList())
                .assertComplete()
    }

    @Test
    fun double_ActuallyDoublesEveryNumberInTheList() {
        rxExercise01
                .double(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValue(mapOf(1 to 2, 2 to 4, 3 to 6, 4 to 8, 5 to 10))
                .assertComplete()
    }

    @Test
    fun sum_ActuallySumsUpEveryNumberInTheList() {
        rxExercise01
                .sum(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValue(15)
                .assertComplete()
    }

    @Test
    fun sum_EmitsZero_OnEmptyInput() {
        rxExercise01
                .sum(emptyList())
                .test()
                .await()
                .assertValue(0)
                .assertComplete()
    }

    @Test
    fun sum_HandlesNegativeNumbers() {
        rxExercise01
                .sum(listOf(-10, 5))
                .test()
                .await()
                .assertValue(-5)
                .assertComplete()
    }

    @Test
    fun lengthOfLines_ActuallyCountsTheLengthOfEachLine() {
        rxExercise01
                .lengthOfLines("Hello!\nHow are you?")
                .test()
                .await()
                .assertValue(listOf(6, 12))
                .assertComplete()
    }

    @Test
    fun lengthOfLines_ReturnsLength0_OnBlankString() {
        rxExercise01
                .lengthOfLines("")
                .test()
                .await()
                .assertValue(listOf(0))
                .assertComplete()
    }

    @Test
    fun lengthOfLines_WorksOnStringWithoutSeparator() {
        rxExercise01
                .lengthOfLines("Hello! How are you?")
                .test()
                .await()
                .assertValue(listOf(19))
                .assertComplete()
    }

    @Test
    fun sumOfEveryThree_Works() {
        rxExercise01
                .sumOfEveryThree(listOf(1, 2, 3, 4, 5, 6))
                .test()
                .await()
                .assertValue(listOf(6, 15))
                .assertComplete()
    }

    @Test
    fun sumOfEveryThree_AddsRemainingValues_WhenCountIsNotExactMultipleOf3() {
        rxExercise01
                .sumOfEveryThree(listOf(1, 2, 3, 4, 5))
                .test()
                .await()
                .assertValue(listOf(6, 9))
                .assertComplete()
    }

}