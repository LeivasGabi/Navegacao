package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PrimeiroFragmento : Fragment(R.layout.fragmento_primeiro) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nome = view.findViewById<EditText>(R.id.nome)

        view.findViewById<Button>(R.id.primeiro).setOnClickListener{
            val action = PrimeiroFragmentoDirections.actionFirstToSecond(
                "${nome.text}"
            )
            findNavController().navigate(action)
        }
    }
}
