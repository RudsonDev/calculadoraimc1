package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // RECUPERAR OS COMPONENTES EDITTEXT
        // CRIAR UMA VARIAVEL E ASSOCIAR(=) O COMPONENTE DE UI <TextInputEditText>
        // RECUPERAR O BOTAO DA TELA


        // O SINAL <> REFERESE A TIPO ESPERADO DE VIEW EX: val peso = findViewById<TextInputEditText>()
        // O SINAL () REFERESE AO VALOR DO ID EX: findViewById<TextInputEditText>(R.id.edt_peso)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCALCULAR = findViewById<Button>(R.id.btn_CALCULAR)

        btnCALCULAR.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtAltura.text


        }




    }
}