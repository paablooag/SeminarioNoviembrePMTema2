package com.example.ejercicioclase

import kotlin.math.PI

open class Circunferencia(var radio:Double = 0.0) {
    var centro = arrayListOf(0,0)
    constructor( centro:ArrayList<Int>, punto:ArrayList<Int>):this(){
        this.centro = centro
        this.radio = ((punto[0]-centro[0])*(punto[0]-centro[0]) + (punto[1] - centro[1]) * (punto[1] - centro[1])).toDouble()

    }
    fun longitud():Double{
        return 2 * PI * radio
    }
    @Override
    override fun toString(): String {
        return "Su radio es de "+longitud()+"\nSu centro es "+centro.toString()
    }


}