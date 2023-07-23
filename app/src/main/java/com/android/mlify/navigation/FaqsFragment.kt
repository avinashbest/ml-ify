package com.android.mlify.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.android.mlify.R
import com.android.mlify.databinding.FragmentFaqsBinding


class FaqsFragment : Fragment(R.layout.fragment_faqs) {

    private var _binding: FragmentFaqsBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFaqsBinding.bind(view)
        setupListener()
        inflateViews()
    }

    private fun inflateViews() {
//        TODO("Not yet implemented")
    }

    private fun setupListener() {
//        TODO("Not yet implemented")
    }
}