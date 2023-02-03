package com.example.ejercicio11

class Jugador {
    var nombre: String = ""
    var defensa: Int = 0
    var fuerza: Int = 0
    var vida: Int = 0
    var monedero: HashMap<String, Int> = HashMap()
    var tamanyoMochila: Int = 0
    var mochila: ArrayList<objeto> = ArrayList()
    lateinit var raza: String
    lateinit var clase: String


    init {

        vida = 200
        defensa = (1..5).random()
        fuerza = (10..15).random()
        tamanyoMochila = 100


    }
}


class objeto {
    var nombre: String = ""
    var peso: Int = 0
    var valor: Int = 0
    var vida: Int = 0


    init {
        vida = 20
        peso = 5
        valor = 10
    }

}
