package com.dio.simulador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dio.simulador.databinding.ActivityDetail2Binding
import com.dio.simulador.databinding.ActivityMainBinding

class DetailActivity2 : AppCompatActivity() {

    private lateinit var binding:ActivityDetail2Binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetail2Binding.inflate(layoutInflater);
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar);
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }
}