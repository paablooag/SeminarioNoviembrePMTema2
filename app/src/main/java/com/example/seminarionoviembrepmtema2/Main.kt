package com.example.ejercicioclase

fun main(){
    /*
    println("Cuantos planetas vas a querer")
    var respuesta= readLine()
    var cantidad= respuesta?.toInt() ?: 0
    var planetas = mutableListOf<Planeta>()
    var nombre=""
    var masa=0.0
    var tipo=""
    for (i in 1..cantidad) {
        println("Nombre del planeta")
        nombre= readLine()!!
        println("Peso del planeta")
        masa= readLine()?.toDouble() ?: 0.0
        println("Tipo del planeta")
        tipo= readLine()!!
        var nuevo=Planeta(nombre,tipo,masa)
        planetas.add(nuevo)
    }
    var sistema=SistemaSolar(planetas)

    for (i in sistema.lista.indices) {
        println(sistema.lista[i].toString())
    }


     */

    //println(sistema.mayorPeso().toString())
    //println(sistema.menorPeso().toString())

    /*
    println("Cuantos contactos vas a querer")
    var respuesta= readLine()
    var cantidad= respuesta?.toInt() ?: 0
    var contactos = mutableListOf<Contactos>()
    var nombre=""
    var numero=0
    var correo=""
    for (i in 1..cantidad) {
        println("Nombre del contacto")
        nombre= readLine()!!
        println("Numero del contacto")
        numero= readLine()?.toInt() ?: 0
        println("Correo del contacto")
        correo= readLine()!!
        var nuevo=Contactos(nombre,numero,correo)
        contactos.add(nuevo)
    }



    for (i in contactos.indices) {
        println(contactos[i].toString())
    }
*/

/*
    println("Cuantos alumnos vas a querer")
    var respuesta= readLine()
    var cantidad= respuesta?.toInt() ?: 0
    var alumnos = mutableListOf<Estudiantes>()
    var nombre=""
    var edad=0
    var nota=0.0
    for (i in 1..cantidad) {
        println("Nombre del planeta")
        nombre= readLine()!!
        println("Peso del planeta")
        edad= readLine()?.toInt() ?: 0
        println("Tipo del planeta")
        nota= readLine()?.toDouble() ?: 0.0
        var nuevo=Estudiantes(nombre,edad,nota)
        alumnos.add(nuevo)
    }

    for (i in alumnos.indices) {
        println(alumnos[i].toString())
    }

    println(Estudiantes.media(alumnos))



 */

    /*println("Cuantos productos vas a querer")
    var respuesta= readLine()
    var cantidad= respuesta?.toInt() ?: 0
    var inventario = mutableListOf<Producto>()
    var nombre=""
    var precio=0.0
    var stock=0
    for (i in 1..cantidad) {
        println("Nombre del producto")
        nombre= readLine()!!
        println("Precio del producto")
        precio= readLine()?.toDouble() ?: 0.0
        println("Stock del producto")
        stock= readLine()?.toInt() ?: 0
        var nuevo=Producto(nombre,precio,stock)
        inventario.add(nuevo)
    }

    inventario[0].actualizarStock(-5)
    for (i in inventario.indices) {
        println(inventario[i].toString())
    }

     */

    //Ejercicio6
//    var lista= mutableListOf<Planeta>(
//        Planeta("Ano","Gaseoso",20.5),
//        Planeta("Tierra","Rocoso",2.5),
//        Planeta("Jupiter","Gaseoso",0.5),
//        Planeta("Marte","rocoso",0.5)
//    )
//    //Ejercicio7
//    for (i in lista.indices){
//        println(lista[i].toString())
//    }
//
//    //Ejercicio8
//    for (i in lista.indices){
//        if(lista[i].nombre[0].equals('m',true)){
//            println(lista[i].toString())
//        }
//    }

    //Ejercicio9
//    for (i in lista.indices){
//        if (lista[i].tipo.equals("gaseoso",true)&&lista[i].masa>20){
//            println(lista[i].toString())
//        }
//    }
//
//    //Ejercicio10
//    var media=0.0
//    var suma=0.0
//    for (i in lista.indices){
//        suma+=lista[i].masa
//    }
//    media=suma/lista.size
//    println(media)

    //Ejercicio12
    var futbol= mutableListOf<Equipo>(

        Equipo("Madri","España"),
        Equipo("Barca","España"),
        Equipo("Betis","España"),
        Equipo("Bayern","Alemania"),
        Equipo("Porto","Portugal"),
        Equipo("City","Inglaterra"),
        Equipo("Chealse","Inglaterra"),
        Equipo("Dormunt","Alemania"),
        Equipo("Lyon","Francia"),
        Equipo("Galatasaray","Turquia"),
        Equipo("Benfica","Portugal"),
        Equipo("Napoles","Italia"),
        Equipo("Milan","Italia"),
        Equipo("Juventus","Italia"),
        Equipo("Pito","whaaat"),
        Equipo("Pitito","whaaat2")
    )
    println(championsLeague(futbol))
}