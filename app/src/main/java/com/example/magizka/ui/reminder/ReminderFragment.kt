package com.example.magizka.ui.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.FragmentInformationBinding
import com.example.magizka.databinding.FragmentReminderBinding

class ReminderFragment : Fragment() {

    private var _binding: FragmentReminderBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReminderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAksi1.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi1Fragment)
        }
        binding.btnAksi2.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi2Fragment)
        }
        binding.btnAksi3.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi3Fragment)
        }
        binding.btnAksi4.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi4Fragment)
        }
        binding.btnAksi5.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi5Fragment)
        }
        binding.btnAksi6.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi6Fragment)
        }
        binding.btnAksi7.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi7Fragment)
        }
        binding.btnAksi8.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_reminderFragment_to_aksi8Fragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}








