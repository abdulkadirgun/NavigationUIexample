package com.example.navigationuiexample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationuiexample.databinding.ActivityMainBinding
import com.example.navigationuiexample.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPremiumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPremiumBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}