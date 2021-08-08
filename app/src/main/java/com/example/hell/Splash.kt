package com.example.hell

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class Splash : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 3secs delay for the next screen
        // Add new screens to Navigation

        Handler().postDelayed({
            findNavController().navigate(R.id.action_splash_to_viewPagerFragment)
        },3000)

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

}