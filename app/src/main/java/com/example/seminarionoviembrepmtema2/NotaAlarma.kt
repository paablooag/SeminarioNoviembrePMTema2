package com.example.ejercicioclase

open class NotaAlarma(id:Int, text:String, hora:Double):Nota(id, text) {
    var hora=hora
    override fun toString(): String {
        return super.toString()+"\n$hora"
    }
}