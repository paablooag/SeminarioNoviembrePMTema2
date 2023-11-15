package com.example.ejercicioclase

import java.lang.RuntimeException

class Contactos {
    var nombre=""
    var numero=0
    var correo=""

    constructor(nombre:String,numero:Int,correo:String){
        this.nombre=nombre
        if(numero>99999999&&numero<9999999999) {
            this.numero = numero
        }else{
            throw RuntimeException("Numero no permitido")
        }
        this.correo=correo

    }

    override fun toString(): String {
        return "Nombre: "+nombre+"|Numero: "+numero+"|Correo: "+correo
    }

}