package com.example.seminarionoviembrepmtema2

open class PNJ(
    val nombre: String,
    var puntosVida: Double,
    var puntosMagicos: Double,
    var nivel: Int
) {
    open fun levelUp() {
        nivel++
    }
}

class Guerrero(
    nombre: String,
    puntosVida: Double,
    puntosMagicos: Double,
    nivel: Int
) : PNJ(nombre, puntosVida, puntosMagicos, nivel) {

    override fun levelUp() {
        super.levelUp()
        val aumentoPV = puntosVida * 0.08
        val aumentoPM = puntosMagicos * 0.01
        puntosVida += aumentoPV
        puntosMagicos += aumentoPM
    }
}

class Mago(
    nombre: String,
    puntosVida: Double,
    puntosMagicos: Double,
    nivel: Int
) : PNJ(nombre, puntosVida, puntosMagicos, nivel) {

    override fun levelUp() {
        super.levelUp()
        val aumentoPV = puntosVida * 0.04
        val aumentoPM = puntosMagicos * 0.03
        puntosVida += aumentoPV
        puntosMagicos += aumentoPM
    }
}

fun main() {
    val guerrero = Guerrero("Guerrero", 400.0, 50.0, 1)
    val mago = Mago("Mago", 1600.0, 150.0, 1)

    var nivel = 1

    while (guerrero.puntosVida >= mago.puntosVida) {
        guerrero.levelUp()
        mago.levelUp()
        nivel++
    }

    println("El guerrero superará al mago en el nivel $nivel")
}
