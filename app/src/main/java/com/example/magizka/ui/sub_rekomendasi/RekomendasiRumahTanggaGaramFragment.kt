package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiRumahTanggaGaramFragment : Fragment() {
    private var _binding: RekomendasiRumahTanggaMengonsumsiGaramBeriodiumBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiRumahTanggaMengonsumsiGaramBeriodiumBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRumahTanggaGaram1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRumahTanggaGaramFragment_to_detailProgramRumahTanggaGaram_EdukasiFragment
            )
        }
        binding.btnRumahTanggaGaram2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRumahTanggaGaramFragment_to_detailProgramRumahTanggaGaram_PeningkatanFragment
            )
        }
        binding.btnRumahTanggaGaram3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRumahTanggaGaramFragment_to_detailProgramRumahTanggaGaram_SurveyFragment
            )
        }

    }
}

