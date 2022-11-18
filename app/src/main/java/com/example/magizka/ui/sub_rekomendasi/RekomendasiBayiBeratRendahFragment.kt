package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBayiBeratRendahFragment : Fragment() {
    private var _binding: RekomendasiBayiBeratRendahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBayiBeratRendahBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBayiBeratRendah1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiBeratRendahFragment_to_detailProgramBayiBeratRendah_PMTFragment
            )
        }
        binding.btnBayiBeratRendah2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiBeratRendahFragment_to_detailProgramBayiBeratRendah_ANCFragment
            )
        }
        binding.btnBayiBeratRendah3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiBeratRendahFragment_to_detailProgramBayiBeratRendah_EdukasiFragment
            )
        }
        binding.btnBayiBeratRendah4.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiBeratRendahFragment_to_detailProgramBayiBeratRendah_KelasFragment
            )
        }

    }
}

