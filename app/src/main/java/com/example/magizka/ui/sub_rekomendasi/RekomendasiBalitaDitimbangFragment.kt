package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.RekomendasiBalitaDitimbangBeratnyaBinding
import com.example.magizka.databinding.RekomendasiBalitaDitimbangNaikBeratnyaBinding
import com.example.magizka.databinding.RekomendasiUnderweightBinding
import com.example.magizka.databinding.RekomendasiWastingBinding

class RekomendasiBalitaDitimbangFragment : Fragment() {
    private var _binding: RekomendasiBalitaDitimbangBeratnyaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBalitaDitimbangBeratnyaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBalitaDitimbangBeratnya1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaDitimbangFragment_to_detailProgramBalitaDitimbang_PosyanduFragment
            )
        }
        binding.btnBalitaDitimbangBeratnya2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaDitimbangFragment_to_detailProgramBalitaDitimbang_PendataanFragment
            )
        }
        binding.btnBalitaDitimbangBeratnya3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaDitimbangFragment_to_detailProgramBalitaDitimbang_KunjunganFragment
            )
        }

    }
}

