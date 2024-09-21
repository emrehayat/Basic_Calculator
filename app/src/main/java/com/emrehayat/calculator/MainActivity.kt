package com.emrehayat.calculator

import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.emrehayat.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun toplama(view: View) {
        val ilkDeger = binding.editTextNumber.text.toString().toDoubleOrNull()
        val ikinciDeger = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (ilkDeger != null && ikinciDeger != null) {
            val toplam = ilkDeger + ikinciDeger
            binding.textView.text = "Sonuç: ${toplam}"
        } else {
            binding.textView.text = "Geçerli sayılar giriniz!"
            Toast.makeText(this@MainActivity, "Eksik Veri Girişi", Toast.LENGTH_LONG).show()
        }
    }

    fun cikarma(view: View) {
        val ilkDeger = binding.editTextNumber.text.toString().toDoubleOrNull()
        val ikinciDeger = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (ilkDeger != null && ikinciDeger != null) {
            val cikar = ilkDeger - ikinciDeger
            binding.textView.text = "Sonuç: ${cikar}"
        } else {
            binding.textView.text = "Geçerli sayılar giriniz!"
            Toast.makeText(this@MainActivity, "Eksik Veri Girişi", Toast.LENGTH_LONG).show()
        }
    }

    fun carpma(view: View) {
        val ilkDeger = binding.editTextNumber.text.toString().toDoubleOrNull()
        val ikinciDeger = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (ilkDeger != null && ikinciDeger != null) {
            val carp = ilkDeger * ikinciDeger
            binding.textView.text = "Sonuç: ${carp}"
        } else {
            binding.textView.text = "Geçerli sayılar giriniz!"
            Toast.makeText(this@MainActivity, "Eksik Veri Girişi", Toast.LENGTH_LONG).show()
        }
    }

    fun bolme(view: View) {
        val ilkDeger = binding.editTextNumber.text.toString().toDoubleOrNull()
        val ikinciDeger = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (ilkDeger != null && ikinciDeger != null) {
            val bol = ilkDeger / ikinciDeger
            binding.textView.text = "Sonuç: ${bol}"
        } else {
            binding.textView.text = "Geçerli sayılar giriniz!"
            Toast.makeText(this@MainActivity, "Eksik Veri Girişi", Toast.LENGTH_LONG).show()
        }
    }

    fun sifirla(view: View) {
        binding.editTextNumber.setText("")
        binding.editTextNumber2.setText("")
        binding.textView.setText("")
    }

}