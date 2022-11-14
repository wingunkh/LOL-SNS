package com.example.go

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.go.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textSignup.setOnClickListener{
            val intent= Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}