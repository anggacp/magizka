package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBayiKurangASIFragment : Fragment() {
    private var _binding: RekomendasiBayiKurang6DapatAsiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBayiKurang6DapatAsiBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBayiKurang6ASI1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiKurangASIFragment_to_detailProgramBayiKurangAsi_KelasFragment
            )
        }
        binding.btnBayiKurang6ASI2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiKurangASIFragment_to_detailProgramBayiKurangAsi_EdukasiASIFragment
            )
        }
        binding.btnBayiKurang6ASI3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiKurangASIFragment_to_detailProgramBayiKurangAsi_EdukasiKeluargaFragment
            )
        }

    }
}

