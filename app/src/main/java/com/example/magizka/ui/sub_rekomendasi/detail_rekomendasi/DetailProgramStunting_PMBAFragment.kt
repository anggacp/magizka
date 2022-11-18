package com.example.magizka.ui.program_recommend

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.magizka.databinding.DetailProgramStuntingEdukasiBinding
import com.example.magizka.databinding.DetailProgramStuntingPmbaBinding

class DetailProgramStunting_PMBAFragment: Fragment() {

    private var _binding: DetailProgramStuntingPmbaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DetailProgramStuntingPmbaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}

