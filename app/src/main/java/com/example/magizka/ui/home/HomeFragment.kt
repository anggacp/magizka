package com.example.magizka.ui.home

import android.content.Intent
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
import com.example.magizka.databinding.FragmentHomeBinding
import com.example.magizka.ui.input_data.InputDataFragment

class HomeFragment : Fragment() {

    private val binding get() = _binding!!
    private var _binding: FragmentHomeBinding? = null


    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMasukkanData.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_inputDataFragment)
            }

        binding.btnReminder.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_reminderFragment)
        }
        }

        }
