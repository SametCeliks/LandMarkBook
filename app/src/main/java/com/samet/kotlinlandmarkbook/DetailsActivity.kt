package com.samet.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.samet.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.samet.kotlinlandmarkbook.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

       val selectedLandmark = intent.getSerializableExtra("landmark") as LandMark

        binding.nameText.text=selectedLandmark.name
        binding.countryText.text=selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)

    }
}