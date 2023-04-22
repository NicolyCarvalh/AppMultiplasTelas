package com.example.appmultiplastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btVoltar, btEntrar;
    TextView tiUsuario, tiSenha;
    String usuario, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btVoltar = (Button) findViewById(R.id.btVoltar);
        btEntrar = (Button) findViewById(R.id.btEntrar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = tiUsuario.getText().toString().trim();
                senha = tiSenha.getText().toString().trim();
                if (usuario.isEmpty() || senha.isEmpty()){
                    Toast.makeText(this(), "login inválido. Preencha todos os campos")
                }else{
                    Toast.makeText(this(), "Login Efetuado!")
                }
            }
        });

    }

}