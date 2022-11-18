package com.example.magizka.ui.input_data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.magizka.R
import com.example.magizka.databinding.FragmentInputDataBinding
import com.example.magizka.ui.program_recommend.RekomendasiProgramFragment

class InputDataFragment: Fragment() {

    private var _binding: FragmentInputDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInputDataBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOlahData.setOnClickListener() {

            val mRekomendasiProgramFragment = RekomendasiProgramFragment()

            val etUnderweight = binding.etBalitaUnderweight
            val etStunting = binding.etBalitaStunting
            val etWasting = binding.etBalitaWasting
            val etRemajaAnemia = binding.etRemajaPutriAnemia
            val etBumilAnemia = binding.etIbuHamilAnemia
            val etBumilKEK = binding.etIbuHamilRisikoKEK
            val etBeratBayiRendah = binding.etBayiDenganBeratBadanLahirRendah
            val etBayiBawahASI = binding.etCakupanBayiUsiaKurangDari6BulanMendapatkanASIEksklusif
            val etBayiAtasASI = binding.etCakupanBayiUsia6BulanMendapatkanASIEksklusif
            val etBumilTTD = binding.etIbuHamilMendapatkanTTDMinimal90
            val etBumilMakanan = binding.etIbuHamilKEKMendapatMakananTambahan
            val etBayiMakanan = binding.etBalitaKurusMendapatkanMakananTambahan
            val etRemajaTTD = binding.etRemajaPutriMendapatTTD
            val etBayiIMD = binding.etBayiBaruLahirMendapatInisiasiMenyusuiDini
            val etBalitaDitimbang = binding.etBalitaYangDitimbangBeratBadannya
            val etBalitaKIA = binding.etBalitaMempunyaiBukuKIA
            val etBalitaNaik = binding.etBalitaDitimbangNaikBeratBadannya
            val etBalitaVitamin = binding.etBalita6Sampai59BulanMendapatKapsulVitaminA
            val etRumahTanggaGaram = binding.etRumahTanggaMengonsumsiGaramBeriodium
            val etBalitaGiziBuruk = binding.etKasusBalitaGiziBurukYangMendapatPerawatan

            var data_bundle = Bundle()
            mRekomendasiProgramFragment.arguments = data_bundle

            if (etUnderweight.text.toString().length > 2) {
                etUnderweight.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etUnderweight.text.toString().length > 0 && etUnderweight.text.toString().length<= 2){
                val data_underweight = etUnderweight.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_UNDERWEIGHT, data_underweight)
            } else {
                var data_underweight: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_UNDERWEIGHT, data_underweight)
            };
            if (etStunting.text.toString().length > 2) {
                etStunting.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etStunting.text.toString().length > 0 && etStunting.text.toString().length<= 2){
                val data_stunting = etStunting.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_STUNTING, data_stunting)
            } else {
                var data_stunting: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_STUNTING, data_stunting)
            };
            if (etWasting.text.toString().length > 2) {
                etWasting.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etWasting.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_wasting = etWasting.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_WASTING, data_wasting)
            } else {
                var data_wasting: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_WASTING, data_wasting)
            };
            if (etRemajaAnemia.text.toString().length > 2) {
                etRemajaAnemia.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etRemajaAnemia.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_remajaAnemia = etRemajaAnemia.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_REMAJA_ANEMIA, data_remajaAnemia)
            } else {
                var data_remajaAnemia: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_REMAJA_ANEMIA, data_remajaAnemia)
            };
            if (etBumilAnemia.text.toString().length > 2) {
                etBumilAnemia.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBumilAnemia.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bumilAnemia = etBumilAnemia.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_ANEMIA, data_bumilAnemia)
            } else {
                var data_bumilAnemia: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_ANEMIA, data_bumilAnemia)
            };
            if (etBumilKEK.text.toString().length > 2) {
                etBumilKEK.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBumilKEK.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bumilKEK = etBumilKEK.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_KEK, data_bumilKEK)
            } else {
                var data_bumilKEK: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_KEK, data_bumilKEK)
            };
            if (etBeratBayiRendah.text.toString().length > 2) {
                etBeratBayiRendah.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBeratBayiRendah.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_beratBayiRendah = etBeratBayiRendah.getText().toString()
                data_bundle.putString(
                        RekomendasiProgramFragment.DATA_BERAT_BAYI_RENDAH,
                data_beratBayiRendah
                )
            } else {
                var data_beratBayiRendah: String = "101";
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BERAT_BAYI_RENDAH,
                    data_beratBayiRendah
                )
            };
            if (etBayiBawahASI.text.toString().length > 2) {
                etBayiBawahASI.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBayiBawahASI.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bayiBawahASI = etBayiBawahASI.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_BAWAH_ASI, data_bayiBawahASI)
            } else {
                var data_bayiBawahASI: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_BAWAH_ASI, data_bayiBawahASI)
            };
            if (etBayiAtasASI.text.toString().length > 2) {
                etBayiAtasASI.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBayiAtasASI.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bayiAtasASI = etBayiAtasASI.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_ATAS_ASI, data_bayiAtasASI)
            } else {
                var data_bayiAtasASI: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_ATAS_ASI, data_bayiAtasASI)
            };
            if (etBumilTTD.text.toString().length > 2) {
                etBumilTTD.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBumilTTD.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bumilTTD = etBumilTTD.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_TTD, data_bumilTTD)
            } else {
                var data_bumilTTD: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_TTD, data_bumilTTD)
            };
            if (etBumilMakanan.text.toString().length > 2) {
                etBumilMakanan.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBumilMakanan.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bumilMakanan = etBumilMakanan.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_MAKANAN, data_bumilMakanan)
            } else {
                var data_bumilMakanan: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BUMIL_MAKANAN, data_bumilMakanan)
            };
            if (etBayiMakanan.text.toString().length > 2) {
                etBayiMakanan.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBayiMakanan.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bayiMakanan = etBayiMakanan.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_MAKANAN, data_bayiMakanan)
            } else {
                var data_bayiMakanan: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_MAKANAN, data_bayiMakanan)
            };
            if (etRemajaTTD.text.toString().length > 2) {
                etRemajaTTD.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etRemajaTTD.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_remajaTTD = etRemajaTTD.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_REMAJA_TTD, data_remajaTTD)
            } else {
                var data_remajaTTD: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_REMAJA_TTD, data_remajaTTD)
            };
            if (etBayiIMD.text.toString().length > 2) {
                etBayiIMD.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBayiIMD.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_bayiIMD = etBayiIMD.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_IMD, data_bayiIMD)
            } else {
                var data_bayiIMD: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BAYI_IMD, data_bayiIMD)
            };
            if (etBalitaDitimbang.text.toString().length > 2) {
                etBalitaDitimbang.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBalitaDitimbang.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_balitaDitimbang = etBalitaDitimbang.getText().toString()
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BALITA_DITIMBANG,
                    data_balitaDitimbang
                )
            } else {
                var data_balitaDitimbang: String = "101";
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BALITA_DITIMBANG,
                    data_balitaDitimbang
                )
            };
            if (etBalitaKIA.text.toString().length > 2) {
                etBalitaKIA.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBalitaKIA.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_balitaKIA = etBalitaKIA.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BALITA_KIA, data_balitaKIA)
            } else {
                var data_balitaKIA: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BALITA_KIA, data_balitaKIA)
            };
            if (etBalitaNaik.text.toString().length > 2) {
                etBalitaNaik.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBalitaNaik.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_balitaNaik = etBalitaNaik.getText().toString()
                data_bundle.putString(RekomendasiProgramFragment.DATA_BALITA_NAIK, data_balitaNaik)
            } else {
                var data_balitaNaik: String = "101";
                data_bundle.putString(RekomendasiProgramFragment.DATA_BALITA_NAIK, data_balitaNaik)
            };
            if (etBalitaVitamin.text.toString().length > 2) {
                etBalitaVitamin.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBalitaVitamin.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_balitaVitamin = etBalitaVitamin.getText().toString()
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BALITA_VITAMIN,
                    data_balitaVitamin
                )
            } else {
                var data_balitaVitamin: String = "101";
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BALITA_VITAMIN,
                    data_balitaVitamin
                )
            };
            if (etRumahTanggaGaram.text.toString().length > 2) {
                etRumahTanggaGaram.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etRumahTanggaGaram.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_rumahTanggaGaram = etRumahTanggaGaram.getText().toString()
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_RUMAH_TANGGA_GARAM,
                    data_rumahTanggaGaram
                )
            } else {
                var data_rumahTanggaGaram: String = "101";
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_RUMAH_TANGGA_GARAM,
                    data_rumahTanggaGaram
                )
            };
            if (etBalitaGiziBuruk.text.toString().length > 2) {
                etBalitaGiziBuruk.setError("Masukkan data dalam skala 1 - 100")
            }
            if (etBalitaGiziBuruk.text.toString().length > 0 && etWasting.text.toString().length<= 2){
                val data_balitaGiziBuruk = etBalitaGiziBuruk.getText().toString()
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BALITA_GIZI_BURUK,
                    data_balitaGiziBuruk
                )
            } else {
                var data_balitaGiziBuruk: String = "101";
                data_bundle.putString(
                    RekomendasiProgramFragment.DATA_BALITA_GIZI_BURUK,
                    data_balitaGiziBuruk
                )
            };

            Navigation.findNavController(view).navigate(
                R.id.action_inputDataFragment_to_rekomendasiProgramFragment,
                data_bundle)
        }
    }
}