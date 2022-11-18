package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBayiDapatASIFragment : Fragment() {
    private var _binding: RekomendasiBayi6DapatAsiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBayi6DapatAsiBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBayi6ASI1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiDapatASIFragment_to_detailProgramBayiDapatASI_EdukasiASIFragment
            )
        }
        binding.btnBayi6ASI2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiDapatASIFragment_to_detailProgramBayiDapatASI_KelasFragment
            )
        }
        binding.btnBayi6ASI3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiDapatASIFragment_to_detailProgramBayiDapatASI_EdukasiKeluargaFragment
            )
        }

    }
}

