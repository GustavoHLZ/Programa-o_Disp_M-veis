package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class IMC extends AppCompatActivity {

    TextView tvResultado;
    ImageView imageViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        tvResultado=findViewById(R.id.TextViewResultadoIMC);
        imageViewResultado=findViewById(R.id.imageViewResultado);
        imageViewResultado.setImageResource(R.drawable.abaixopeso);

        Intent i=getIntent();
        Bundle bundle=i.getExtras();
        bundle.getString("valorimc");

        tvResultado.setText(bundle.getString("valorimc"));
    }
}