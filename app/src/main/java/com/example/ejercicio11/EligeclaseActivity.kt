package com.example.ejercicio11

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio11.databinding.EligeclaseActividad2Binding
import com.google.gson.Gson


class EligeclaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = EligeclaseActividad2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent = Intent(this, ResumenActivity::class.java)


        val mPrefs = getPreferences(MODE_PRIVATE)
        val jugador = Jugador()
        val prefsEditor = mPrefs.edit()

        binding.imageView.setImageResource(R.drawable.inicio)

        binding.BtnGuerrero.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.guerrero)
            jugador.clase = "guerrero"
        }

        binding.btnMago.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.mago)
            jugador.clase = "mago"

        }

        binding.berserker.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.berserker)
            jugador.clase = "berserker"
        }

        binding.btnLadron.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.descarga)
            jugador.clase = "ladron"
        }




        binding.btnAceptar.setOnClickListener {
            val gson = Gson()
            val json = gson.toJson(jugador)
            prefsEditor.putString("jugador", json)
            prefsEditor.apply()

            startActivity(intent)
        }


    }


}

