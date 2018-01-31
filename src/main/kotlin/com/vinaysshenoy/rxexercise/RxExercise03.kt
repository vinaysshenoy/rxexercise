package com.vinaysshenoy.rxexercise

import io.reactivex.Observable
import io.reactivex.Single

data class Pricing(val name: String, val price: Long)

data class Module(val name: String, val pricings: List<Pricing>)

class RxExercise03 {

    fun moduleNames(modules: List<Module>): Single<List<String>> {
        TODO("Implement")
    }

    fun pricingsForModule(module: Module): Single<List<Pricing>> {
        TODO("Implement")
    }

    fun pricingsForModules(modules: List<Module>): Observable<List<Pricing>> {
        TODO("Implement")
    }

    fun totalPricingsForModule(module: Module): Single<Long> {
        TODO("Implement")
    }

    fun pricingsPerModule(modules: List<Module>): Map<Module, Long> {
        TODO("Implement")
    }

    fun totalPricingsForModules(modules: List<Module>): Single<Long> {
        TODO("Implement")
    }

}