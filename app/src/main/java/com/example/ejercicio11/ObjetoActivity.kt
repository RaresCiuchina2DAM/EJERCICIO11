package com.example.ejercicio11

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio11.databinding.ActivityObjetoBinding

class ObjetoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //si pulsas el botón Recoger se continua a la actividad blanca
        //si pulsas el botón Continuar se vuelve a la actividad dado

        binding.BtnRecoger.setOnClickListener {
            val intent = Intent(this, BlancaActivity::class.java)
            startActivity(intent)
        }


        binding.BtnContinuar.setOnClickListener {
            val intent = Intent(this, DadoActivity::class.java)
            startActivity(intent)
        }
    }
}