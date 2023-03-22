package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;
    Button btnAdicao, btnSubtracao, btnDivisao, btnMultiplicacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        btnAdicao = findViewById(R.id.btnAdicao);
        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnDivisao = findViewById(R.id.btnDivisao);
        btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
    }
    public void btnAdicao(View v){
        int intNumero1 = Integer.parseInt(numero1.getText().toString());
        int intNumero2 = Integer.parseInt(numero2.getText().toString());
        int soma = intNumero1 + intNumero2;
        String resultadoSoma = String.valueOf(soma);
        resultado.setText(resultadoSoma);
    }
    public void btnSubtracao(View v){
        numero1 - numero2;
    }
    public void btnDivisao(View v){
        numero1 / numero2;
    }
    public void btnMultiplicacao(View v){
        numero1 * numero2;
    }
}