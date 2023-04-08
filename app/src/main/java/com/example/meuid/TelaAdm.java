package com.example.meuid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaAdm extends AppCompatActivity {

    private TextView aprovados_adm;
    private TextView pendente_adm;
    private TextView expirados_adm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_adm);

        getSupportActionBar().hide();


        aprovados_adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaAdm.this,Aprovados.class);
                startActivity(intent);
            }

        });

        pendente_adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaAdm.this,Pendentes.class);
                startActivity(intent);
            }

        });

        expirados_adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TelaAdm.this,Expirados.class);
                startActivity(intent);
            }

        });
    }
}