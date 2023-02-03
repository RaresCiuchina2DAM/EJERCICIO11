package com.example.ejercicio11

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio11.databinding.ActivityResumenBinding
import com.google.gson.Gson


class ResumenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResumenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val gson = Gson()
        val json = intent.getStringExtra("personaje")
        val personaje = gson.fromJson(json, Jugador::class.java)

        //Cuando la clase pasada por el intent sea humano, asignar al Imageview la imagen de persona

        when (personaje.clase) {
            "ladron" -> {
                binding.ImagenClase.setImageResource(R.drawable.descarga)
            }
            "mago" -> {
                binding.ImagenClase.setImageResource(R.drawable.mago)
            }
            "guerrero" -> {
                binding.ImagenClase.setImageResource(R.drawable.guerrero)
            }
            "berserker" -> {
                binding.ImagenClase.setImageResource(R.drawable.berserker)
            }
        }


        val raza = intent.getStringExtra("raza")
        //Cuando la raza pasada por el intent sea humano, asignar al Imageview la imagen de persona
        when (personaje.raza) {
            "humano" -> {
                binding.ImagenRaza.setImageResource(R.drawable.persona)
            }
            "elfo" -> {
                binding.ImagenRaza.setImageResource(R.drawable.elfo)
            }
            "enano" -> {
                binding.ImagenRaza.setImageResource(R.drawable.enano)
            }
            "goblin" -> {
                binding.ImagenRaza.setImageResource(R.drawable.goblin)
            }
        }


        //Cada vez que se pulsa el boton asignar, se asigna el nombre que se ha introducido en el edittext
        binding.btnAsignar.setOnClickListener {
            binding.MostrarNombreAsignado.text = binding.EtNombre.text

        }

        binding.tvfuerza.text = personaje.fuerza.toString()
        binding.tvdefensa.text = personaje.defensa.toString()
        binding.tvtamanyoMochila.text = personaje.tamanyoMochila.toString()
        binding.tvvida.text = personaje.vida.toString()
        binding.tvmonedero.text = personaje.monedero.toString()

        binding.button.setOnClickListener {
            val intent = Intent(this, DadoActivity::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}