package com.example.kavyaloginkotlin

import android.os.Bundle
import android.service.autofill.Validators.and
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment(R.layout.fragment_main){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        welcome_button.setOnClickListener {
            val action = MainFragmentDirections.navigateToLoginFragment()
            findNavController().navigate(action)
        }
    }
}