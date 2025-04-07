package com.example.questo3_pdm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FormularioActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutNome;
    private TextInputEditText editTextNome;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        inputLayoutNome = findViewById(R.id.inputLayoutNome);
        editTextNome = findViewById(R.id.editTextNome);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString().trim();

                if (TextUtils.isEmpty(nome)) {
                    inputLayoutNome.setError("Por favor, informe seu nome");
                    return;
                }

                inputLayoutNome.setError(null);

                Intent intent = new Intent(FormularioActivity.this, ConfirmacaoActivity.class);
                intent.putExtra("NOME_CLIENTE", nome);
                startActivity(intent);
            }
        });
    }
}
