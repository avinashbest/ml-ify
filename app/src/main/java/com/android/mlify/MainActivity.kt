package com.android.mlify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.android.mlify.databinding.ActivityMainBinding
import com.android.mlify.navigation.AboutFragment
import com.android.mlify.navigation.FaqsFragment
import com.android.mlify.navigation.HomeFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.mlkit.samples.nl.translate.kotlin.TranslateFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "MLify: Image/Text Recognition"

        setFragment(HomeFragment())

        binding.navigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    setFragment(HomeFragment())
                }

                R.id.nav_faqs -> {
                    setFragment(FaqsFragment())
                }

                R.id.nav_about -> {
                    setFragment(AboutFragment())
                }
            }
            true
        }

    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onBackPressed() {
        MaterialAlertDialogBuilder(this).apply {
            setTitle("Do you want to exit?")
            setPositiveButton("Yes") { _, _ ->
                finish()
            }
            setNegativeButton("No") { _, _ -> }
        }.create().show()
    }
}