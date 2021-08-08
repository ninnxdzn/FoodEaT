package com.example.hell.onboard

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.hell.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_third_screen.*
import kotlinx.android.synthetic.main.fragment_third_screen.view.*

class ThirdScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // SOMETHING CRASHING AFTER (i dont no know what is)
        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)

        // setonclicklistener to open next screen
        view.finish.setOnClickListener() {
            findNavController().navigate(R.id.action_viewPagerFragment_to_home2)
        }  // put navigation correctly 'viewpager to home'

        return view
    }

}