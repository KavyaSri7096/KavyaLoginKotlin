package com.example.kavyaloginkotlin

import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.login_fragment.*


class LoginFragment : Fragment(R.layout.login_fragment) {

    private lateinit var email: String
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login.setOnClickListener {
            check(view)
        }
    }
    fun check(view: View) {
        var username = user_email.text.toString().trim()
        if (username.isEmpty()) {
            Toast.makeText(activity, "Enter your email id", Toast.LENGTH_LONG).show()
        } else {
            if (Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
                val username = user_email.text.toString()
                val password = password.text.toString()
                UserInfo.user = User(username)
                val action = LoginFragmentDirections.navigateToProfileFragment()
                findNavController().navigate(action)
                Toast.makeText(activity, "Validate Email Address", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(activity, "Invalid Email Address", Toast.LENGTH_LONG).show()
            }
        }
    }

}