package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBalitaKurusMakananFragment : Fragment() {
    private var _binding: RekomendasiBalitaKurusMakananTambahanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBalitaKurusMakananTambahanBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBalitaKurusMakananTambahan1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaKurusMakananFragment_to_detailProgramBalitaKurusMakanan_PeningkatanFragment
            )
        }
        binding.btnBalitaKurusMakananTambahan2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaKurusMakananFragment_to_detailProgramBalitaKurusMakanan_KunjunganFragment
            )
        }
        binding.btnBalitaKurusMakananTambahan3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaKurusMakananFragment_to_detailProgramBalitaKurusMakanan_PosyanduFragment
            )
        }

    }
}

