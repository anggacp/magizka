package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBayiIMDFragment : Fragment() {
    private var _binding: RekomendasiBayiBaruLahirDapatImdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiBayiBaruLahirDapatImdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBayiBaruLahirDapatImd1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiIMDFragment_to_detailProgramBayiIMD_EdukasiFragment
            )
        }
        binding.btnBayiBaruLahirDapatImd2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiIMDFragment_to_detailProgramBayiIMD_KelasFragment
            )
        }
        binding.btnBayiBaruLahirDapatImd3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiIMDFragment_to_detailProgramBayiIMD_ANCFragment
            )
        }
        binding.btnBayiBaruLahirDapatImd4.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBayiIMDFragment_to_detailProgramBayiIMD_PersalinanFragment
            )
        }

    }
}

