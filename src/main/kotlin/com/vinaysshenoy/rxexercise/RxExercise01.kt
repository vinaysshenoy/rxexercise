package com.vinaysshenoy.rxexercise

import io.reactivex.Observable
import io.reactivex.Single

class RxExercise01 {

    /*
    * Find odd numbers in the input list
    *
    * Ex: If input is [1, 2, 3, 4, 5], output should be an Observable that when subscribed to, emits 1, 3, 5
    * */
    fun findOddNumbers(numbers: List<Int>): Observable<Int> {
        TODO("Implement this")
        //Hint: take a look at 'Observable#filter'
    }

    /*
    * Find even numbers in the input list
    *
    * Ex: If input is [1, 2, 3, 4, 5], output should be a Single that when subscribed to, emits [2, 4]
    * */
    fun findEvenNumbers(numbers: List<Int>): Single<List<Int>> {
        TODO("Implement this")
        //Hint: take a look at 'Observable#toList'
    }

    /*
    * Multiply each number by 2
    *
    * Ex: If input is [1, 2, 3, 4, 5], output should be a Single that when subscribed to, emits a map
    * { 1: 2, 2: 4, 3: 6, 4: 8, 5: 10 }
    * */
    fun double(numbers: List<Int>): Single<Map<Int, Int>> {
        TODO("Implement this")
        //Hint: take a look at 'Observable#map' and 'Observable#toMap'
    }

    /*
    * Add all the numbers
    *
    * Ex: If input is [1, 2, 3, 4, 5], output should be a Single that when subscribed to, emits a single value: 15
    * */
    fun sum(numbers: List<Int>): Single<Int> {
        TODO("Implement this")
        //Hint: take a look at 'Observable#reduce'
    }

    /*
    * Find the length of each line in text, where the line separator is '\n'
    *
    * Ex: if input is "Hello!\nHow are you?", output should be a Single that when subscribed to, emits [6, 12]
    * */
    fun lengthOfLines(text: String): Single<List<Int>> {
        TODO("Implement this")
    }

    /*
    * Find the sum of every three numbers in the input. If the input is indivisible by 3, sum up the remaining items in the list
    *
    * Ex: if input is [1, 2, 3, 4, 5, 6, 7, 8], output should be a Single that when subscribed to, emits [6, 15, 15]
    * */
    fun sumOfEveryThree(numbers: List<Int>): Single<List<Int>> {
        TODO("Implement this")
        //Hint: take a look at 'Observable#buffer'
    }
}