package com.example.condisoesifcase;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNumero;
    private TextView botaoOK;
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        campoNumero = (EditText)findViewById(R.id.campoNumero);

        botaoOK = (TextView)findViewById(R.id.botaoOK);


    }
    public void clicaNumero( View w){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String valor = campoNumero.getText().toString();
        int numero = Integer.parseInt(valor);


        if(numero %2 == 0){
            builder.setMessage("É PAR");

        } else{
            builder.setMessage("É IMPAR");

        }
        alerta = builder.create();
        alerta.show();

    }
}
