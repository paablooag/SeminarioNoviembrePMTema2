package com.example.ejercicioclase

class BlocNotas(notas:ArrayList<Nota>) {
    var notas=notas
    fun addNote(coca:Nota){
        notas.add(coca)
    }
    override fun toString(): String {
        return notas.toString()
    }
    fun eliminar(posicion:Int){
        notas.removeAt(posicion)
    }
    fun toal():Int{
        return notas.size
    }
}