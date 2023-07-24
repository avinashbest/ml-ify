package com.android.mlify.navigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.android.mlify.R
import com.android.mlify.autodraw.DigitalInkMainActivity
import com.android.mlify.barcode.BarcodeActivity
import com.android.mlify.databinding.FragmentHomeBinding
import com.android.mlify.extracter.EntityExtractionActivity
import com.android.mlify.translate.TranslateActivity
import com.google.mlkit.samples.nl.translate.kotlin.TranslateFragment


class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)
        setupListener()
    }


    private fun setupListener() {
        binding.apply {
            btnTranslate.setOnClickListener {
                val intent = Intent(activity, TranslateActivity::class.java)
                startActivity(intent)
            }

            btnBarcodeScanner.setOnClickListener {
                val intent = Intent(activity, BarcodeActivity::class.java)
                startActivity(intent)
            }

            btnAutodraw.setOnClickListener {
                val intent = Intent(activity, DigitalInkMainActivity::class.java)
                startActivity(intent)
            }

            btnEntityExtraction.setOnClickListener {
                val intent = Intent(activity, EntityExtractionActivity::class.java)
                startActivity(intent)
            }
        }

    }

}