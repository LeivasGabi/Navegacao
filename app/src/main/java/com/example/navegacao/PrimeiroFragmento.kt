package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PrimeiroFragmento : Fragment(R.layout.fragmento_primeiro) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.primeiro).setOnClickListener {
            findNavController().navigate(R.id.primeiroParaSegundo)
        }
    }
}