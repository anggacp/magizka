package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.RekomendasiStuntingBinding
import com.example.magizka.databinding.RekomendasiUnderweightBinding

class Rekomendasi01BalitaStuntingFragment : Fragment() {
    private var _binding: RekomendasiStuntingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiStuntingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStunting1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaStuntingFragment_to_detailProgramStunting_PMTFragment
            )
        }
        binding.btnStunting2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaStuntingFragment_to_detailProgramStunting_PMBAFragment
            )
        }
        binding.btnStunting3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasi01BalitaStuntingFragment_to_detailProgramStunting_EdukasiFragment
            )
        }

    }
}

