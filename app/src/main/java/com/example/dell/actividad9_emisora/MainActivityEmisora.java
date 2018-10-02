package com.example.dell.actividad9_emisora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityEmisora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_emisora);

    }

    public void Emision(View view)
    {
        Intent intent = new Intent(); //Generar el objeto tipo intent
        //Añadir la accion del paquete de nuestra app creado
        intent.setAction("com.example.dell_actividad9_emisora");
        //Añadir la bandera de emision necesaria.
        intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        //Se enviará la emision realizada.
        sendBroadcast(intent);
    }


}
