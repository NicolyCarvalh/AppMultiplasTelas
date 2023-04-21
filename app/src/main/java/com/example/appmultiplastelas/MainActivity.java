package com.example.appmultiplastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btLogin, btCadastro, btSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btLogin = (Button) findViewById(R.id.btLogin);
        btCadastro = (Button) findViewById(R.id.btCadastro);
        btSobre = (Button) findViewById(R.id.btSobre);
    }

    public void telaLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void telaCadastro(View view){
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    public void telaSobre(View view){
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

}