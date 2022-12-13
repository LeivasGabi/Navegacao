package com.example.navegacao

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SegundoFragmento : Fragment(R.layout.fragmento_segundo) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        view.findViewById<Button>(R.id.segundo).setOnClickListener {
            findNavController().navigate(R.id.segundoParaTerceiro)
        }
    }
}