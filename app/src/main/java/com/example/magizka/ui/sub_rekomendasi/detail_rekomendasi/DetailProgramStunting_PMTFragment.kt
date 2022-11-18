package com.example.magizka.ui.program_recommend

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.DetailProgramStuntingPmtBinding
import com.example.magizka.databinding.DetailProgramUnderweightEdukasiBinding
import com.example.magizka.databinding.DetailProgramUnderweightPmbaBinding
import com.example.magizka.databinding.FragmentRekomendasiProgramBinding

class DetailProgramStunting_PMTFragment: Fragment() {

    private var _binding: DetailProgramStuntingPmtBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DetailProgramStuntingPmtBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}

