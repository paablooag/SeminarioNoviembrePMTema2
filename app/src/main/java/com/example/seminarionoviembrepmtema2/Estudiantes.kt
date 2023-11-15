package com.example.ejercicioclase

import android.provider.MediaStore.Audio.Media
import java.lang.RuntimeException

class Estudiantes {
    var nombre=""
    var edad=0
    var calificacion=0.0
    constructor(nombre:String,edad:Int,calificaciones:Double){
        this.nombre=nombre
        if(edad>0) {
            this.edad = edad
        }else{
            throw RuntimeException("Tu eres gilipollas va a tener la edad negativa")
        }
        if(calificaciones>0) {
            this.calificacion = calificaciones
        }else{
            throw RuntimeException("La puntuación no puede ser negativa")
        }
    }

    override fun toString(): String {
        return "Nombre: $nombre|Edad: $edad|Nota: $calificacion"
    }


    companion object {
        fun media(lista: MutableList<Estudiantes>): Double {
            var media = 0.0
            for (i in lista.indices) {
                media += lista[i].calificacion
            }
            media /= lista.size
            return media
        }
    }
}