package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;
    TextView btnAdicao, btnSubtracao, btnDivisao, btnMultiplicacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
    }
    public void btnAdicao(View v){
        numero1 + numero2;
    }
}