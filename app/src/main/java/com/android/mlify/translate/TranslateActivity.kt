package com.android.mlify.translate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.android.mlify.R
import com.google.mlkit.samples.nl.translate.kotlin.TranslateFragment

class TranslateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Offline Language Translator"


        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.translate_container,
                    TranslateFragment.newInstance()
                )
                .commitNow()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}