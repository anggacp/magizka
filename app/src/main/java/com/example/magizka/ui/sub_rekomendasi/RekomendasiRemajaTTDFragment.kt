package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiRemajaTTDFragment : Fragment() {
    private var _binding: RekomendasiRemajaPutriTtdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiRemajaPutriTtdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRemajaPutriTtd1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaTTDFragment_to_detailProgramRemajaTTD_PeningkatanFragment
            )
        }
        binding.btnRemajaPutriTtd2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaTTDFragment_to_detailProgramRemajaTTD_PembentukanFragment
            )
        }
        binding.btnRemajaPutriTtd3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaTTDFragment_to_detailProgramRemajaTTD_PenyediaanFragment
            )
        }

    }
}

