package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBumilTTDFragment : Fragment() {
    private var _binding: RekomendasiIbuHamilTtdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiIbuHamilTtdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnIbuHamilTtd1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilTTDFragment_to_detailProgramBumilTTD_PeningkatanFragment
            )
        }
        binding.btnIbuHamilTtd2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilTTDFragment_to_detailProgramBumilTTD_DistribusiFragment
            )
        }
        binding.btnIbuHamilTtd3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilTTDFragment_to_detailProgramBumilTTD_PemantauanFragment
            )
        }

    }
}

