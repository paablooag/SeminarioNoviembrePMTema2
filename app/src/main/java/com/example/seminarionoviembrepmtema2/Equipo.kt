package com.example.ejercicioclase

import kotlin.random.Random

class Equipo {
    var nombre=""
    var equipo = ""
    constructor(nombre:String,equipo:String){
        this.nombre=nombre
        this.equipo=equipo
    }

}

fun  championsLeague(lista:MutableList<Equipo>):String{

   var equipos=lista
    var local:Equipo
    var visitante:Equipo
    var res=""
    for (i in 1..equipos.size/2){
        local=equipos.random()
        equipos.remove(local)
        visitante=equipos.random()
        equipos.remove(visitante)
        res+="${local.nombre} vs ${visitante.nombre}\n"
    }
    return res
}


