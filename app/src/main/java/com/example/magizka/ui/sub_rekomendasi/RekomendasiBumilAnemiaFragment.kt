package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBumilAnemiaFragment : Fragment() {
    private var _binding: RekomendasiHamilAnemiaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiHamilAnemiaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnHamilAnemia1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilAnemiaFragment_to_detailProgramBumilAnemia_TabletFragment
            )
        }
        binding.btnHamilAnemia2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilAnemiaFragment_to_detailProgramBumilAnemia_KepatuhanFragment
            )
        }
        binding.btnHamilAnemia3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilAnemiaFragment_to_detailProgramBumilAnemia_ANCFragment
            )
        }
        binding.btnHamilAnemia4.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilAnemiaFragment_to_detailProgramBumilAnemia_EdukasiFragment
            )
        }
        binding.btnHamilAnemia5.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilAnemiaFragment_to_detailProgramBumilAnemia_KelasFragment
            )
        }

    }
}

