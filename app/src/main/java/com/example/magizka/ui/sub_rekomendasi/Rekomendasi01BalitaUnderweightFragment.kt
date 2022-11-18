package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.RekomendasiUnderweightBinding

class Rekomendasi01BalitaUnderweightFragment : Fragment() {
    private var _binding: RekomendasiUnderweightBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiUnderweightBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUnderweight1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaUnderweightFragment_to_detailProgramFragment
            )
        }
        binding.btnUnderweight2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaUnderweightFragment_to_detailProgramUnderweight_PMBAFragment
            )
        }
        binding.btnUnderweight3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaUnderweightFragment_to_detailProgramUnderweight_EdukasiFragment
            )
        }

    }
}

