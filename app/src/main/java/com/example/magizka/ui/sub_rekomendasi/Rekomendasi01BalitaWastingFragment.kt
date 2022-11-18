package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.RekomendasiUnderweightBinding
import com.example.magizka.databinding.RekomendasiWastingBinding

class Rekomendasi01BalitaWastingFragment : Fragment() {
    private var _binding: RekomendasiWastingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiWastingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnWasting1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaWastingFragment_to_detailProgramWasting_PMTFragment
            )
        }
        binding.btnWasting2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaWastingFragment_to_detailProgramWasting_PMBAFragment
            )
        }
        binding.btnWasting3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaWastingFragment_to_detailProgramWasting_EdukasiFragment
            )
        }

    }
}

