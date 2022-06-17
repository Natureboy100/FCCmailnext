package com.example.fccmailclientnext

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fccmailclientnext.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //btn_login binding
binding.loginBtn.setOnClickListener {
            val email = binding.loginUsername.text.toString()
            val password = binding.loginPassword.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                binding.error_view.setText("Please enter email and password")
            } else {
                binding.error_view.setText("")
                binding.loginBtn.isEnabled = false
                binding.loginBtn.text = "Logging in..."
                binding.loginBtn.setBackgroundResource(R.drawable.btn_login_disabled)
                binding.loginBtn.setTextColor(resources.getColor(R.color.colorPrimary))
            }
        }

    }
}