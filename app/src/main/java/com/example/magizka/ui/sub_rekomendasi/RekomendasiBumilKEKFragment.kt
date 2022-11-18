package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBumilKEKFragment : Fragment() {
    private var _binding: RekomendasiHamilKekBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiHamilKekBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnHamilKek1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKFragment_to_detailProgramBumilKEK_PMTFragment
            )
        }
        binding.btnHamilKek2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKFragment_to_detailProgramBumilKEK_ANCFragment
            )
        }
        binding.btnHamilKek3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKFragment_to_detailProgramBumilKEK_EdukasiFragment
            )
        }
        binding.btnHamilKek4.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKFragment_to_detailProgramBumilKEK_KelasFragment
            )
        }

    }
}

