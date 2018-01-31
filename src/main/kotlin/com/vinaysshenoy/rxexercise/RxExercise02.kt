package com.vinaysshenoy.rxexercise

import io.reactivex.Observable

class RxExercise02 {

	/*
	* Return an Observable that when subscribed to emits every item in the list
	* */
	fun streamOfItems(items: List<Int>): Observable<Int> {
		TODO("Implement")
		//Hint: Look at Observable#fromIterable
	}

	/*
	* Return an Observable that when subscribed to emits the list of items as a single event
	* */
	fun streamOfList(items: List<Int>): Observable<List<Int>> {
		TODO("Implement")
		//Hint: Look at Observable#just
	}

	/*
	* Return an observable that when subscribed to emits an array of the characters in the string
	* */
	fun characters(string: String): Observable<Array<Char>> {
		TODO("Implement")
		//Use Observable#fromCallable with string.toCharArray
	}

	/*
	* Return an observable that when subscribed to emits a stream of the characters in the string
	* */
	fun characterStream(string: String): Observable<Char> {
		TODO("Implement")
		//Use String#iterable and forEach along with Observable#create
	}

}