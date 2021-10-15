package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tambah(view: View){
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua   = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil        = findViewById<TextView>(R.id.tv_hasil)

        if(angkaPertama.equals("")){
            R.id.et_angka_pertama.setError("Masukan angka")
        }else if (angkaKedua.equals("")){
            R.id.et_angka_kedua.setError("Masukan angka")
        }else{
            val jumlah       = angkaPertama.toDouble() + angkaKedua.toDouble()
            hasil.text       = jumlah.toString()
        }
    }

    fun kali(view: View){
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua   = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil        = findViewById<TextView>(R.id.tv_hasil)

        if(angkaPertama.equals("")){
            R.id.et_angka_pertama.setError("Masukan angka")
        }else if (angkaKedua.equals("")){
            R.id.et_angka_kedua.setError("Masukan angka")
        }else{
            val jumlah       = angkaPertama.toDouble() * angkaKedua.toDouble()
            hasil.text       = jumlah.toString()
        }
    }

    fun bagi(view: View){
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua   = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil        = findViewById<TextView>(R.id.tv_hasil)

        if(angkaPertama.equals("")){
            R.id.et_angka_pertama.setError("Masukan angka")
        }else if (angkaKedua.equals("")){
            R.id.et_angka_kedua.setError("Masukan angka")
        }else{
            val jumlah       = angkaPertama.toDouble() / angkaKedua.toDouble()
            hasil.text       = jumlah.toString()
        }
    }

    fun kurang(view: View){
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua   = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil        = findViewById<TextView>(R.id.tv_hasil)

        if(angkaPertama.equals("")){
            R.id.et_angka_pertama.setError("Masukan angka")
        }else if (angkaKedua.equals("")){
            R.id.et_angka_kedua.setError("Masukan angka")
        }else{
            val jumlah       = angkaPertama.toDouble() - angkaKedua.toDouble()
            hasil.text       = jumlah.toString()
        }
    }

    fun clear(view: View){
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.clear()
        val angkaKedua   = findViewById<EditText>(R.id.et_angka_kedua).text.clear()
        val hasil        = findViewById<TextView>(R.id.tv_hasil)

        hasil.text       = "0"
    }



}

private fun Any.setError(s: String) {

}
