package com.example.ejercicioclase

class SistemaSolar(){

    lateinit var lista:MutableList<Planeta>

    constructor(lista:MutableList<Planeta>):this(){
        this.lista=lista
    }

    fun mayorPeso():Planeta{
        var liston=this.lista
        liston.sortByDescending { it.masa }

        return liston.get(0)
    }
    fun menorPeso():Planeta{
        var liston=this.lista
        liston.sortBy { it.masa }

        return liston.get(0)
    }
}