package com.william.flowers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.william.flowers.databinding.ActivityChooseBinding
import com.william.flowers.databinding.ActivityMainBinding
import com.william.flowers.info.LiliesActivity
import com.william.flowers.info.RoseActivity
import com.william.flowers.info.TulipsActivity

class ChooseActivity : AppCompatActivity() {
    lateinit var binding: ActivityChooseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.roseImageView.setOnClickListener {
            startActivity(Intent(this, RoseActivity::class.java))
        }

        binding.tulpaniImageView.setOnClickListener {
            startActivity(Intent(this, TulipsActivity::class.java))
        }
        binding.liliiImageView.setOnClickListener {
            startActivity(Intent(this, LiliesActivity::class.java))
        }


    }
}