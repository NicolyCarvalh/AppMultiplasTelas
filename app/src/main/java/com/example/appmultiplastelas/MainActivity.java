package com.example.appmultiplastelas;

import static android.provider.Telephony.Mms.Part.TEXT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btLogin, btCadastro, btSobre;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btLogin = (Button) findViewById(R.id.btLogin);
        btCadastro = (Button) findViewById(R.id.btCadastro);
        btSobre = (Button) findViewById(R.id.btSobre);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cadastro.class);
                startActivity(intent);
            }
        });
        btSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sobre.class);
                startActivity(intent);
            }
        });

        if (savedInstanceState != null) {
            String text = savedInstanceState.getString(TEXT);
            t.setText(text);
        }
    }

    private static final String TEXT = "texto";
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String text = t.getText().toString();
        outState.putString(TEXT, text);
    }

    protected void onStart(){
        super.onStart();
        Log.i("INFORMATION","ON START");
    }

    protected void onStop(){
        super.onStop();
        Log.i("INFORMATION","ON STOP");
    }
}

