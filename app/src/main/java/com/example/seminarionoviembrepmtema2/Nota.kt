package com.example.ejercicioclase

open class Nota(id:Int, text:String) {
    var id=id
    var text=text

    override fun toString():String{
        return "Id: $id \n$text"
    }
}