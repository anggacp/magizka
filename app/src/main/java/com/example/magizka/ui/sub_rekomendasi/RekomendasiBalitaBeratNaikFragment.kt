package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.RekomendasiBalitaDitimbangNaikBeratnyaBinding
import com.example.magizka.databinding.RekomendasiUnderweightBinding
import com.example.magizka.databinding.RekomendasiWastingBinding

class RekomendasiBalitaBeratNaikFragment : Fragment() {
    private var _binding: RekomendasiBalitaDitimbangNaikBeratnyaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBalitaDitimbangNaikBeratnyaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBalitaDitimbangNaikBeratnya1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaBeratNaikFragment_to_detailProgramBalitaNaikBeratnya_PMTFragment
            )
        }
        binding.btnBalitaDitimbangNaikBeratnya2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBalitaBeratNaikFragment_to_detailProgramBalitaNaikBeratnya_EdukasiFragment
            )
        }

    }
}

