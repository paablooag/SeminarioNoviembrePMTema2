package com.example.ejercicioclase

import kotlin.math.pow

class Triangulo(var lado1:Double,var lado2:Double,var lado3:Double, var perimetro:Double=lado1+lado2+lado3,var tipo:String) {
    fun rectangulo():Boolean{
        var res=0.0
        if(lado1>=lado2 && lado1>=lado3){
            res=lado2.pow(2)+lado3.pow(2)
            if(lado1==res){
                return true
            }
        }else if(lado2>=lado1 && lado2>=lado3){
            res=lado1.pow(2)+lado3.pow(2)
            if(lado2==res){
                return true
            }
        }else{
            res=lado2.pow(2)+lado1.pow(2)
            if(lado3==res){
                return true
            }
        }
        return false
    }
    override fun toString():String{
        return "lado1: "+lado1+"| lado2: "+lado2+"| lado3: "+lado3+ "| perimetro: "+perimetro+"| tipo"+tipo
    }


}