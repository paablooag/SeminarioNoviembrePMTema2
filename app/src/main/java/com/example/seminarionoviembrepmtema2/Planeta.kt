package com.example.ejercicioclase

class Planeta (){

    var nombre:String =""
    var tipo:String = ""
    var masa:Double = 0.0


    constructor(nombre:String, tipo:String, masa:Double): this(){
        if (tipo.equals("rocoso",true) || tipo.equals("gaseoso",true)) {
            this.tipo = tipo
        }else{
            this.tipo="Rocoso"
        }
        this.masa = masa
        this.nombre = nombre
    }
    override fun toString(): String {
        return nombre+"|"+tipo+"|"+masa
    }
    fun cambiarTipo( tipoNuevo:String){
        this.tipo=tipoNuevo
    }
    fun bombardearPlaneta(){
        tipo= "Destruido"
        masa=0.0
    }
}