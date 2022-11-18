package com.example.magizka.ui.sub_rekomendasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.*

class RekomendasiRemajaPutriAnemiaFragment : Fragment() {
    private var _binding: RekomendasiPutriAnemiaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RekomendasiPutriAnemiaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPutriAnemia1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaPutriAnemiaFragment_to_detailProgramRemajaAnemia_EdukasiFragment
            )
        }
        binding.btnPutriAnemia2.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaPutriAnemiaFragment_to_detailProgramRemajaAnemia_KonselorFragment
            )
        }
        binding.btnPutriAnemia3.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaPutriAnemiaFragment_to_detailProgramRemajaAnemia_TabletFragment
            )
        }
        binding.btnPutriAnemia4.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaPutriAnemiaFragment_to_detailProgramRemajaAnemia_PemantauanFragment
            )
        }
        binding.btnPutriAnemia5.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiRemajaPutriAnemiaFragment_to_detailProgramRemajaAnemia_PenyediaanFragment
            )
        }

    }
}

