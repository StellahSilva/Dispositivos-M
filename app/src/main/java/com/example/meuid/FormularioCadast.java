package com.example.meuid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormularioCadast extends AppCompatActivity {

    private Button bt_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cadast);

        getSupportActionBar().hide();

    }

    public void abrirDialogo(View view){
        //instancia para o alerta do dialogo
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        //titulo e mensagem
        dialogo.setTitle("Atenção");
        dialogo.setMessage("Aguarde o ADMINISTRADOR aceitar seu cadastro!");

        //voltar ao inicio po meio de cancelamento

        dialogo.setCancelable(false);

        //configurar icone
        dialogo.setIcon(android.R.drawable.ic_dialog_alert);

        //botoes
        dialogo.setPositiveButton("Voltar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Informações salvas com sucesso!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(FormularioCadast.this,Login.class);
                startActivity(intent) ;
            }
        });

        //criar e exibir dialogo
        dialogo.create();
        dialogo.show();

    }

}