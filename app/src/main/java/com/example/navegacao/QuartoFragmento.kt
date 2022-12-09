package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class QuartoFragmento : Fragment(R.layout.fragmento_quarto) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.quarto).setOnClickListener {
            findNavController().navigate(R.id.quartoParaQuinto)
        }
    }
}