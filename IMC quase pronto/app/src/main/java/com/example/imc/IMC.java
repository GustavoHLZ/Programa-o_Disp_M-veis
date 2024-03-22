package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IMC extends AppCompatActivity {

    TextView tvAltura,tvPeso,tvIMC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        //Associação objeto View da Interface a variável local

        tvAltura=findViewById(R.id.tvresultadoaltura);
        tvPeso=findViewById(R.id.tvresultadopeso);
        tvIMC=findViewById(R.id.tvresultadoimc);


        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        Float peso,altura,imc;
        peso=bundle.getFloat("peso");
        altura=bundle.getFloat("altura");
        imc=bundle.getFloat("imc");
        imc=peso/(altura*altura);

        tvAltura.setText(altura.toString());
        tvPeso.setText(peso.toString());
        tvIMC.setText(imc.toString());

        //bundle.getString("valorimc");

        if (imc<18.5) {
          Toast.makeText(this, "Abaixo do peso", Toast.LENGTH_SHORT).show();
        } else if (imc>18.5 && imc<24.9){
           Toast.makeText(this, "Peso normal", Toast.LENGTH_SHORT).show();
        }else if (imc>24.9 && imc<29.9){
         Toast.makeText(this, "Sobrepeso", Toast.LENGTH_SHORT).show();
        }else if (imc>30 && imc<34.9){
         Toast.makeText(this, "Obesidade grau 1", Toast.LENGTH_SHORT).show();
        } else if (imc>35 && imc<39.9){
          Toast.makeText(this, "Obesidade grau 2", Toast.LENGTH_SHORT).show();
        }else if (imc>40) {
            Toast.makeText(this, "Obesidade grau 3", Toast.LENGTH_SHORT).show();
        }

    }
}