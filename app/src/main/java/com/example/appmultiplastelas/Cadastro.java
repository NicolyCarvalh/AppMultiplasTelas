package com.example.appmultiplastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity  {

    Button btVoltar, btSalvar;

    TextView etNome, etUsuario, etSenha, etDataNascimento, cbMasculino, cbFeminino, etTelefone;

    String nome, usuario, senha, nascimento, masc, fem, tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        btVoltar = (Button) findViewById(R.id.btVoltar);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = etUsuario.getText().toString().trim();
                senha = etSenha.getText().toString().trim();
                nome = etNome.getText().toString().trim();
                nascimento = etDataNascimento.getText().toString().trim();
                masc = cbMasculino.getText().toString().trim();
                fem = cbFeminino.getText().toString().trim();
                tel = etTelefone.getText().toString().trim();
                if (usuario.isEmpty() || senha.isEmpty() || nome.isEmpty() || nascimento.isEmpty() || masc.isEmpty() || fem.isEmpty() || tel.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Cadastro Inválido. Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Cadastro Efetuado!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    }
