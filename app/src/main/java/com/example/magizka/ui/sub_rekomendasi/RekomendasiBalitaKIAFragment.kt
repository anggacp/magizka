package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBalitaKIAFragment : Fragment() {
    private var _binding: RekomendasiBalitaPunyaBukuKiaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBalitaPunyaBukuKiaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBalitaPunyaBukuKia1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaKIAFragment_to_detailProgramBalitaKIA_PosyanduFragment
            )
        }
        binding.btnBalitaPunyaBukuKia2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaKIAFragment_to_detailProgramBalitaKIA_PendataanFragment
            )
        }
        binding.btnBalitaPunyaBukuKia3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaKIAFragment_to_detailProgramBalitaKIA_KunjunganFragment
            )
        }

    }
}

