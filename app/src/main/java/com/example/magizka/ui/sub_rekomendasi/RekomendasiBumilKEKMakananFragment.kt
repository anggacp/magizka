package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiBumilKEKMakananFragment : Fragment() {
    private var _binding: RekomendasiIbuHamilKekMakananBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiIbuHamilKekMakananBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnIbuHamilKekMakanan1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKMakananFragment_to_detailProgramBumilKEKMakanan_DistribusiFragment
            )
        }
        binding.btnIbuHamilKekMakanan2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKMakananFragment_to_detailProgramBumilKEKMakanan_KunjunganFragment
            )
        }
        binding.btnIbuHamilKekMakanan3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiBumilKEKMakananFragment_to_detailProgramBumilKEKMakanan_ANCFragment
            )
        }

    }
}

