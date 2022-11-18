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

class InformationFragment : Fragment() {

    private var _binding: FragmentInformationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInformationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnInformasi1.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_1_fragment)
        }
        binding.btnInformasi2.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_2_fragment)
        }
        binding.btnInformasi3.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_3_fragment)
        }
        binding.btnInformasi4.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_4_fragment)
        }
        binding.btnInformasi5.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_5_fragment)
        }
        binding.btnInformasi6.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_6_fragment)
        }
        binding.btnInformasi7.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_7_fragment)
        }
        binding.btnInformasi8.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_8_fragment)
        }
        binding.btnInformasi9.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_9_fragment)
        }
        binding.btnInformasi10.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_10_fragment)
        }
        binding.btnInformasi11.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_11_fragment)
        }
        binding.btnInformasi12.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_12_fragment)
        }
        binding.btnInformasi13.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_13_fragment)
        }
        binding.btnInformasi14.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_information_to_information_14_fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

