package com.example.magizka.ui.program_recommend

import android.app.ProgressDialog.show
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.FragmentRekomendasiProgramBinding

class RekomendasiProgramFragment: Fragment() {

    private var _binding: FragmentRekomendasiProgramBinding? = null
    private val binding get() = _binding!!

    companion object {
        var DATA_UNDERWEIGHT = "data_underweight"
        var DATA_STUNTING = "data_stunting"
        var DATA_WASTING = "data_wasting"
        var DATA_REMAJA_ANEMIA = "data_remajaAnemia"
        var DATA_BUMIL_ANEMIA = "data_bumilAnemia"
        var DATA_BUMIL_KEK = "data_bumilKEK"
        var DATA_BERAT_BAYI_RENDAH = "data_beratBayiRendah"
        var DATA_BAYI_BAWAH_ASI = "data_bayiBawahASI"
        var DATA_BAYI_ATAS_ASI = "data_bayiAtasASI"
        var DATA_BUMIL_TTD = "data_bumilTTD"
        var DATA_BUMIL_MAKANAN = "data_bumilMakanan"
        var DATA_BAYI_MAKANAN = "data_bayiMakanan"
        var DATA_REMAJA_TTD = "data_remajaTTD"
        var DATA_BAYI_IMD = "data_bayiIMD"
        var DATA_BALITA_DITIMBANG = "data_balitaDitimbang"
        var DATA_BALITA_KIA = "data_balitaKIA"
        var DATA_BALITA_NAIK = "data_balitaNaik"
        var DATA_BALITA_VITAMIN = "data_balitaVitamin"
        var DATA_RUMAH_TANGGA_GARAM = "data_rumahTanggaGaram"
        var DATA_BALITA_GIZI_BURUK = "data_balitaGiziBuruk"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRekomendasiProgramBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBalitaUnderweight1 = binding.btnBalitaUnderweight1
        val btnBalitaStunting1 = binding.btnBalitaStunting1
        val btnBalitaWasting1 = binding.btnBalitaWasting1
        val btnRemajaAnemia = binding.btnRemajaPutriAnemia
        val btnBumilAnemia = binding.btnIbuHamilAnemia
        val btnBumilKEK = binding.btnIbuHamilResikoKEK
        val btnBayiBeratRendah = binding.btnBayiDenganBeratBadanLahirRendah
        val btnBayiKurang6ASI = binding.btnBayiUsiaKurang6BulanDapatASI
        val btnBayi6ASI = binding.btnBayiUsia6BulanDapatASI
        val btnBumilTTD = binding.btnIbuHamilMendapatTTD
        val btnBumilKEKMakanan = binding.btnIbuHamilKEKDapatMakananTambahan
        val btnBalitaKurusMakanan = binding.btnBalitaKurusDapatMakananTambahan
        val btnRemajaTTD = binding.btnRemajaPutriDapatTTD
        val btnBayiIMD = binding.btnBayiMendapatIMD
        val btnBalitaDitimbangBeratnya = binding.btnBalitaYangDitimbangBeratnya
        val btnBalitaKIA = binding.btnBalitaPunyaKIAAtauKMS
        val btnBalitaNaikBeratnya = binding.btnBalitaDitimbangYangNaikBeratBadannya
        val btnBalitaVitamin = binding.btnBalitaMendapatKapsulVitaminA
        val btnRumahTanggaIodium = binding.btnRumahTanggaMengonsumsiGaramBeriodium
        val btnBalitaGiziBurukPerawatan = binding.btnBalitaGiziBurukMendapatPerawatan


//        if (arguments!= null) {
        var balitaUnderweight = arguments?.getString(DATA_UNDERWEIGHT)?.toInt()
        var balitaStunting = arguments?.getString(DATA_STUNTING)?.toInt()
        var balitaWasting = arguments?.getString(DATA_WASTING)?.toInt()
        var remajaAnemia = arguments?.getString(DATA_REMAJA_ANEMIA)?.toInt()
        var bumilAnemia = arguments?.getString(DATA_BUMIL_ANEMIA)?.toInt()
        var bumilKEK = arguments?.getString(DATA_BUMIL_KEK)?.toInt()
        var beratBayiRendah = arguments?.getString(DATA_BERAT_BAYI_RENDAH)?.toInt()
        var bayiBawahASI = arguments?.getString(DATA_BAYI_BAWAH_ASI)?.toInt()
        var bayiAtasASI = arguments?.getString(DATA_BAYI_ATAS_ASI)?.toInt()
        var bumilTTD = arguments?.getString(DATA_BUMIL_TTD)?.toInt()
        var bumilMakanan = arguments?.getString(DATA_BUMIL_MAKANAN)?.toInt()
        var bayiMakanan = arguments?.getString(DATA_BAYI_MAKANAN)?.toInt()
        var remajaTTD = arguments?.getString(DATA_REMAJA_TTD)?.toInt()
        var bayiIMD = arguments?.getString(DATA_BAYI_IMD)?.toInt()
        var balitaDitimbang = arguments?.getString(DATA_BALITA_DITIMBANG)?.toInt()
        var balitaKIA = arguments?.getString(DATA_BALITA_KIA)?.toInt()
        var balitaNaik = arguments?.getString(DATA_BALITA_NAIK)?.toInt()
        var balitaVitamin = arguments?.getString(DATA_BALITA_VITAMIN)?.toInt()
        var rumahTanggaGaram = arguments?.getString(DATA_RUMAH_TANGGA_GARAM)?.toInt()
        var balitaGiziBuruk = arguments?.getString(DATA_BALITA_GIZI_BURUK)?.toInt()

        if (balitaUnderweight != null) {
            if (balitaUnderweight >= 10 && balitaUnderweight <= 100) {
                btnBalitaUnderweight1.setVisibility(View.VISIBLE)
            } else {
                btnBalitaUnderweight1.setVisibility(View.GONE)
            }
        }
        if (balitaStunting != null) {
            if (balitaStunting >= 20 && balitaStunting <= 100) {
                btnBalitaStunting1.setVisibility(View.VISIBLE)
            } else {
                btnBalitaStunting1.setVisibility(View.GONE)
            }
        }
        if (balitaWasting != null) {
            if (balitaWasting >= 5 && balitaWasting <=100) {
                btnBalitaWasting1.setVisibility(View.VISIBLE)
            } else {
                btnBalitaWasting1.setVisibility(View.GONE)
            }
        }
        if (remajaAnemia != null) {
            if (remajaAnemia >= 5 && remajaAnemia <=100) {
                btnRemajaAnemia.setVisibility(View.VISIBLE)
            } else {
                btnRemajaAnemia.setVisibility(View.GONE)
            }
        }
        if (bumilAnemia != null) {
            if (bumilAnemia >= 5 && bumilAnemia <=100) {
                btnBumilAnemia.setVisibility(View.VISIBLE)
            } else {
                btnBumilAnemia.setVisibility(View.GONE)
            }
        }
        if (bumilKEK != null) {
            if (bumilKEK >= 10 && bumilKEK <=100) {
                btnBumilKEK.setVisibility(View.VISIBLE)
            } else {
                btnBumilKEK.setVisibility(View.GONE)
            }
        }
        if (beratBayiRendah != null) {
            if (beratBayiRendah >= 8 && beratBayiRendah<=100) {
                btnBayiBeratRendah.setVisibility(View.VISIBLE)
            } else {
                btnBayiBeratRendah.setVisibility(View.GONE)
            }
        }
        if (bayiBawahASI != null) {
            if (bayiBawahASI <= 60 && bayiBawahASI >0) {
                btnBayiKurang6ASI.setVisibility(View.VISIBLE)
            } else {
                btnBayiKurang6ASI.setVisibility(View.GONE)
            }
        }
        if (bayiAtasASI != null) {
            if (bayiAtasASI <= 80 && bayiAtasASI >0) {
                btnBayi6ASI.setVisibility(View.VISIBLE)
            } else {
                btnBayi6ASI.setVisibility(View.GONE)
            }
        }
        if (bumilTTD != null) {
            if (bumilTTD <= 98 && bumilTTD >0) {
                btnBumilTTD.setVisibility(View.VISIBLE)
            } else {
                btnBumilTTD.setVisibility(View.GONE)
            }
        }
        if (bumilMakanan != null) {
            if (bumilMakanan <= 95 && bumilMakanan>0) {
                btnBumilKEKMakanan.setVisibility(View.VISIBLE)
            } else {
                btnBumilKEKMakanan.setVisibility(View.GONE)
            }
        }
        if (bayiMakanan != null) {
            if (bayiMakanan <= 90 && bayiMakanan >0) {
                btnBalitaKurusMakanan.setVisibility(View.VISIBLE)
            } else {
                btnBalitaKurusMakanan.setVisibility(View.GONE)
            }
        }
        if (remajaTTD != null) {
            if (remajaTTD <= 30 && remajaTTD >0) {
                btnRemajaTTD.setVisibility(View.VISIBLE)
            } else {
                btnRemajaTTD.setVisibility(View.GONE)
            }
        }
        if (bayiIMD != null) {
            if (bayiIMD <= 50 && bayiIMD >0) {
                btnBayiIMD.setVisibility(View.VISIBLE)
            } else {
                btnBayiIMD.setVisibility(View.GONE)
            }
        }
        if (balitaDitimbang != null) {
            if (balitaDitimbang <= 85 && balitaDitimbang >0) {
                btnBalitaDitimbangBeratnya.setVisibility(View.VISIBLE)
            } else {
                btnBalitaDitimbangBeratnya.setVisibility(View.GONE)
            }
        }
        if (balitaKIA != null) {
            if (balitaKIA < 100 && balitaKIA >0) {
                btnBalitaKIA.setVisibility(View.VISIBLE)
            } else {
                btnBalitaKIA.setVisibility(View.GONE)
            }
        }
        if (balitaNaik != null) {
            if (balitaNaik < 40 && balitaNaik >0) {
                btnBalitaNaikBeratnya.setVisibility(View.VISIBLE)
            } else {
                btnBalitaNaikBeratnya.setVisibility(View.GONE)
            }
        }
        if (balitaVitamin != null) {
            if (balitaVitamin < 90 && balitaVitamin >0) {
                btnBalitaVitamin.setVisibility(View.VISIBLE)
            } else {
                btnBalitaVitamin.setVisibility(View.GONE)
            }
        }
        if (rumahTanggaGaram != null) {
            if (rumahTanggaGaram < 90 && rumahTanggaGaram >0) {
                btnRumahTanggaIodium.setVisibility(View.VISIBLE)
            } else {
                btnRumahTanggaIodium.setVisibility(View.GONE)
            }
        }
        if (balitaGiziBuruk != null) {
            if (balitaGiziBuruk < 100 && balitaGiziBuruk >0) {
                btnBalitaGiziBurukPerawatan.setVisibility(View.VISIBLE)
            } else if (balitaGiziBuruk >= 100) {
                btnBalitaGiziBurukPerawatan.setVisibility(View.GONE)
            }
        }

        btnBalitaUnderweight1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasi01BalitaUnderweightFragment
            )
        }
        btnBalitaStunting1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasi01BalitaStuntingFragment
            )
        }
        btnBalitaWasting1.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasi01BalitaWastingFragment
            )
        }
        btnBalitaDitimbangBeratnya.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBalitaDitimbangFragment
            )
        }
        btnBalitaNaikBeratnya.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBalitaBeratNaikFragment
            )
        }
        btnBalitaGiziBurukPerawatan.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBalitaGiziBurukFragment
            )
        }
        btnBalitaKIA.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBalitaKIAFragment
            )
        }
        btnBalitaKurusMakanan.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBalitaKurusMakananFragment
            )
        }
        btnBalitaVitamin.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBalitaVitaminFragment
            )
        }
        btnBayiBeratRendah.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBayiBeratRendahFragment
            )
        }
        btnBayi6ASI.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBayiDapatASIFragment
            )
        }
        btnBayiIMD.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBayiIMDFragment
            )
        }
        btnBayiKurang6ASI.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBayiKurangASIFragment
            )
        }
        btnBumilAnemia.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBumilAnemiaFragment
            )
        }
        btnBumilKEK.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBumilKEKFragment
            )
        }
        btnBumilKEKMakanan.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBumilKEKMakananFragment
            )
        }
        btnRumahTanggaIodium.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiRumahTanggaGaramFragment
            )
        }
        btnRemajaTTD.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiRemajaTTDFragment
            )
        }
        btnRemajaAnemia.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiRemajaPutriAnemiaFragment
            )
        }
        btnBumilTTD.setOnClickListener() {
            Navigation.findNavController(view).navigate(
                R.id.action_rekomendasiProgramFragment_to_rekomendasiBumilTTDFragment
            )
        }
    }
}