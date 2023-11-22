package com.example.seminarionoviembrepmtema2

open class CuerpoCeleste(val nombre: String, val masa: Double, val diametroMedio: Double, val periodoRotacion: Double, val periodoTraslacion: Double, val distanciaMediaAlOrigen: Double, val excentricidadOrbita: Double) {
    fun imprimirInformacion() {
            println("Nombre: $nombre")
            println("Masa: $masa kg")
            println("Diámetro Medio: $diametroMedio km")
            println("Período de Rotación: $periodoRotacion horas")
            println("Período de Traslación: $periodoTraslacion días")
            println("Distancia Media al Origen: $distanciaMediaAlOrigen km")
            println("Excentricidad de la Órbita: $excentricidadOrbita")
    }
}

    class Planeta(
        nombre: String,
        masa: Double,
        diametroMedio: Double,
        periodoRotacion: Double,
        periodoTraslacion: Double,
        distanciaMediaAlOrigen: Double,
        excentricidadOrbita: Double
    ) : CuerpoCeleste(
        nombre,
        masa,
        diametroMedio,
        periodoRotacion,
        periodoTraslacion,
        distanciaMediaAlOrigen,
        excentricidadOrbita
    )

    class Satelite(
        nombre: String,
        masa: Double,
        diametroMedio: Double,
        periodoRotacion: Double,
        periodoTraslacion: Double,
        distanciaMediaAlOrigen: Double,
        excentricidadOrbita: Double,
        val planetaOrbitado: Planeta
    ) : CuerpoCeleste(
        nombre,
        masa,
        diametroMedio,
        periodoRotacion,
        periodoTraslacion,
        distanciaMediaAlOrigen,
        excentricidadOrbita
    )

    fun main() {
        val tierra = Planeta(
            "Tierra",
            5.972e24,
            12742.0,
            24.0,
            365.25,
            149.6e6,
            0.0167
        )

        val luna = Satelite(
            "Luna",
            7.342e22,
            3474.0,
            27.3,
            27.3,
            384400.0,
            0.0549,
            tierra
        )

        tierra.imprimirInformacion()
        println()
        luna.imprimirInformacion()
    }

