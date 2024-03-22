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

       // Intent i = new(this,IMC.class);

      //  Bundle mbundle = new Bundle();

      //  mbundle.putFloat("peso",float.parseFloat(edPeso.getText().toString()));
       // mbundle.putFloat("peso",float.parseFloat(edPeso.getText().toString()));

        //i.putExtras(mbundle);

        //startActivity(i);

        // aqui em cima está como passar dados pelo bundle, no caso de uma outra tela para outra

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
        bundle.putString("",altura);

        intent.putExtras(bundle);
        startActivity(intent);



        

    }
}