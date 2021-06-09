package com.lucas.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgJogar = findViewById(R.id.imgJogar);

        imgJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Passar dados para próxima tela
                int numero = new Random().nextInt(2); //0 e 1
                intent.putExtra("numero", numero);

                startActivity(intent);
            }
        });

    }
}