package com.example.questo3_pdm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView txtMensagemBoasVindas;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        txtMensagemBoasVindas = findViewById(R.id.txtMensagemBoasVindas);
        btnVoltar = findViewById(R.id.btnVoltar);

        String nomeCliente = getIntent().getStringExtra("NOME_CLIENTE");

        txtMensagemBoasVindas.setText("Bem-vindo(a), " + nomeCliente + "!");

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConfirmacaoActivity.this, MainActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}
