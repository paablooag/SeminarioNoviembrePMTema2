package com.example.seminarionoviembrepmtema2
/*
data class Videojuego(val nombre: String, val año: Int, val plataforma: String)

fun filtrarJuegos(
    lista: List<Videojuego>,
    año: Int? = null,
    plataforma: String? = null
): List<Videojuego> {
    return lista.filter { juego ->
        (año == null || juego.año == año) && (plataforma == null || juego.plataforma == plataforma)
    }
}

fun main() {
    val listaVideojuegos = listOf(
        Videojuego("Juego1", 2020, "PC"),
        Videojuego("Juego2", 2021, "PS4"),
        Videojuego("Juego3", 2020, "Xbox"),
        Videojuego("Juego4", 2022, "PC"),
        Videojuego("Juego5", 2021, "Switch"),
        Videojuego("Juego6", 2020, "PS4"),
        Videojuego("Juego7", 2021, "Xbox"),
        Videojuego("Juego8", 2021, "PC")
    )

    val juegos2020 = filtrarJuegos(listaVideojuegos, año = 2020)
    println("Juegos del año 2020: $juegos2020")

    val juegosPS4 = filtrarJuegos(listaVideojuegos, plataforma = "PS4")
    println("Juegos de la plataforma PS4: $juegosPS4")

    val juegos2021Xbox = filtrarJuegos(listaVideojuegos, año = 2021, plataforma = "Xbox")
    println("Juegos del año 2021 y plataforma Xbox: $juegos2021Xbox")
}

 */

/*
data class Videojuego(val nombre: String, val año: Int, val plataforma: String)

fun filtrarJuegos(
    lista: List<Videojuego>,
    años: List<Int>? = null,
    plataformas: List<String>? = null
): List<Videojuego> {
    return lista.filter { juego ->
        (años == null || juego.año in años) && (plataformas == null || juego.plataforma in plataformas)
    }
}

fun main() {
    val listaVideojuegos = listOf(
        Videojuego("Juego1", 2020, "PC"),
        Videojuego("Juego2", 2021, "PS4"),
        Videojuego("Juego3", 2020, "Xbox"),
        Videojuego("Juego4", 2022, "PC"),
        Videojuego("Juego5", 2021, "Switch"),
        Videojuego("Juego6", 2020, "PS4"),
        Videojuego("Juego7", 2021, "Xbox"),
        Videojuego("Juego8", 2021, "PC")
    )

    val juegos2020y2021 = filtrarJuegos(listaVideojuegos, años = listOf(2020, 2021))
    println("Juegos de los años 2020 y 2021: $juegos2020y2021")

    val juegosPS4yPC = filtrarJuegos(listaVideojuegos, plataformas = listOf("PS4", "PC"))
    println("Juegos de las plataformas PS4 y PC: $juegosPS4yPC")

    val juegos2021Switch = filtrarJuegos(listaVideojuegos, años = listOf(2021), plataformas = listOf("Switch"))
    println("Juegos del año 2021 y plataforma Switch: $juegos2021Switch")
}

 */
data class Videojuego(val nombre: String, val plataforma: String)

fun contarJuegosPorPlataforma(lista: List<Videojuego>): Map<String, Int> {
    return lista.groupBy { it.plataforma }.mapValues { it.value.size }
}

fun main() {
    val listaVideojuegos = listOf(
        Videojuego("Juego1", "PC"),
        Videojuego("Juego2", "PS4"),
        Videojuego("Juego3", "Xbox"),
        Videojuego("Juego4", "PC"),
        Videojuego("Juego5", "Switch"),
        Videojuego("Juego6", "PS4"),
        Videojuego("Juego7", "Xbox"),
        Videojuego("Juego8", "PC")
    )

    val juegosPorPlataforma = contarJuegosPorPlataforma(listaVideojuegos)
    println("Número de juegos por plataforma: $juegosPorPlataforma")
}

