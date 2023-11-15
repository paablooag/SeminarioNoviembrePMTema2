package com.example.ejercicioclase

import java.lang.RuntimeException

class Producto {
    var nombre=""
    var precio=0.0
    var stock=0
    constructor(nombre:String,precio:Double,stock:Int){
        this.nombre=nombre
        if(precio<0) {
            println("Precio no posible introduce valor positivo")
            this.precio = readLine()?.toDouble() ?: 0.0
        }else {
            this.precio = precio
        }
        if(stock<0) {
            println("Stock no posible introduce valor positivo")
            this.stock = readLine()?.toInt() ?: 0
        }else {
            this.stock = stock
        }
    }

    override fun toString(): String {
        return "Nombre: $nombre|Precio: $precio|Stock: $stock"
    }

    fun actualizarStock(cantidad:Int){
        if(cantidad<0) {
            println("Stock no posible introduce valor positivo")
            this.stock = readLine()?.toInt() ?: 0
        }else {
            this.stock = cantidad
        }
    }
}