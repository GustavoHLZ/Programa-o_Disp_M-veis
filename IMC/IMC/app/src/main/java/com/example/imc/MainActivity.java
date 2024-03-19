package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaDrm;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    EditText edPeso,edAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularIMC(view);
            }
        });
        edPeso=findViewById(R.id.edpeso);
        edAltura=findViewById(R.id.edaltura);
    }
    public void calcularIMC (View view) {

        double peso = Double.parseDouble(edPeso.getText().toString());
        double altura = Double.parseDouble(edAltura.getText().toString());
        DecimalFormat df = new DecimalFormat("##.##");
        double resultado = peso/(altura*altura);
        String imc = df.format(resultado);

        Toast.makeText(this,"Resultado:" + imc,Toast.LENGTH_LONG).show();
        Log.d("IMC", imc);
        Intent intent = new Intent( getApplicationContext(), IMC.class);


        Bundle bundle= new Bundle( );
        bundle.putString("valorimc",imc);

        intent.putExtras(bundle);
        startActivity(intent);

        //if (resultado<18.5) {
          //  Toast.makeText(this, "Abaixo do peso", Toast.LENGTH_SHORT).show();
        //} else if (resultado>18.5 && resultado<24.9){
         //   Toast.makeText(this, "Peso normal", Toast.LENGTH_SHORT).show();
        //}else if (resultado>24.9 && resultado<29.9){
           // Toast.makeText(this, "Sobrepeso", Toast.LENGTH_SHORT).show();
        //}else if (resultado>30 && resultado<34.9){
           // Toast.makeText(this, "Obesidade grau 1", Toast.LENGTH_SHORT).show();
        //} else if (resultado>35 && resultado<39.9){
          //  Toast.makeText(this, "Obesidade grau 2", Toast.LENGTH_SHORT).show();
        //}else if (resultado>40){
          //  Toast.makeText(this, "Obesidade grau 3", Toast.LENGTH_SHORT).show();
       // }
        

    }
}