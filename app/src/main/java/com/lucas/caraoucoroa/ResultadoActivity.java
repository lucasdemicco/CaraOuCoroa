package com.lucas.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgVoltar, imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgVoltar = findViewById(R.id.imgVoltar);
        imgResultado = findViewById(R.id.imgResultado);

        //Recuperar Dados tela Main
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){ //Cara
            imgResultado.setImageResource(R.drawable.moeda_cara);
        }else{ //Coroa
            imgResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}