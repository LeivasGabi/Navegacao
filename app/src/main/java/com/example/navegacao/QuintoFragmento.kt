package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class QuintoFragmento : Fragment(R.layout.fragmento_quinto) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.confirmaDados).setOnClickListener {
            findNavController().navigate(R.id.quintoParaPrimeiro)
        }
    }
}