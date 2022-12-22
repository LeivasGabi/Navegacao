package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SegundoFragmento : Fragment(R.layout.fragmento_segundo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = view.findViewById<EditText>(R.id.email)

        view.findViewById<Button>(R.id.segundo).setOnClickListener{
            val action = SegundoFragmentoDirections.actionSecondToThrird(
                "${email.text}"
            //envia dados
            )
            findNavController().navigate(action)
        }
    }
}