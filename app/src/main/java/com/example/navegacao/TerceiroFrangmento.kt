package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class TerceiroFrangmento: Fragment(R.layout.fragmento_terceiro) {

    private val args : TerceiroFrangmentoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //recebe dados
        view.findViewById<TextView>(R.id.email).text = args.email

        view.findViewById<Button>(R.id.voltar).setOnClickListener {
            findNavController().navigate(R.id.actionThrirdToFirst)
        }
    }
}