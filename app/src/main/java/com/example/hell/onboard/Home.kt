package com.example.hell.onboard

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hell.R

class Home : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //NÃO MEXER NESSA LINHA PQ DA ULTIMA VEZ NÃO COMPILOU

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}