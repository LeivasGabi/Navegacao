package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navegacao.databinding.ActivityMainBinding

class TerceiroFrangmento: Fragment(R.layout.fragmento_terceiro) {

    private lateinit var binding: ActivityMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root

        view.findViewById<Button>(R.id.terceiro).setOnClickListener {
            findNavController().navigate(R.id.terceiroParaQuarto)






        }


    }



}