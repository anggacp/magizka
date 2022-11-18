package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBalitaGiziBurukFragment : Fragment() {
    private var _binding: RekomendasiBalitaGiziBurukMendapatPerawatanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBalitaGiziBurukMendapatPerawatanBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBalitaGiziBurukMendapatPerawatan1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaGiziBurukFragment_to_detailProgramBalitaGiziBuruk_PosyanduFragment
            )
        }
        binding.btnBalitaGiziBurukMendapatPerawatan2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaGiziBurukFragment_to_detailProgramBalitaGiziBuruk_PendataanFragment
            )
        }
        binding.btnBalitaGiziBurukMendapatPerawatan3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaGiziBurukFragment_to_detailProgramBalitaGiziBuruk_KunjunganFragment
            )
        }

    }
}

