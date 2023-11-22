package com.example.ejercicioclase

import kotlin.math.PI
import kotlin.math.pow

class Circulo(radio:Double = 0.0, var color:String ="") : Circunferencia(radio) {
    var area=0.0
     constructor(centro:ArrayList<Int>,punto:ArrayList<Int>,color:String):this(){
         this.centro = centro
         this.radio = ((punto[0]-centro[0])*(punto[0]-centro[0]) + (punto[1] - centro[1]) * (punto[1] - centro[1])).toDouble()
         this.color=color
     }
    fun area(){
        area= PI*radio.pow(2)
    }
    override fun toString(): String {
        return super.toString()+"\n"+this.area
    }
}