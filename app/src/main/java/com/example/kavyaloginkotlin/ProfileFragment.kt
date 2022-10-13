package com.example.kavyaloginkotlin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_profile.*
import java.util.Observer

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = UserInfo.user!!.useremail
        Toast.makeText(requireContext(), "Hi, $username", Toast.LENGTH_SHORT).show()

        val text = getString(R.string.welcome, username)
        welcome_profile.text = text
    }
}