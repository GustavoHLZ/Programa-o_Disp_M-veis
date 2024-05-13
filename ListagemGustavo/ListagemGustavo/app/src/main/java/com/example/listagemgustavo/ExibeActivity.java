package com.example.listagemgustavo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExibeActivity extends AppCompatActivity {

    ImageView img;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe);
        int position = getIntent().getExtras().getInt("posicao");
        tv = findViewById(R.id.textViewExibe);
        img = findViewById(R.id.imageView2);

        Bundle imagens = getIntent().getExtras();
        if (imagens != null) {

            String animais = imagens.getString("positon");

            tv.setText(animais);

            switch (animais) {
                case "Pato":
                    img.setImageResource(R.drawable.pato);
                    break;
                case "Cachorro":
                    img.setImageResource(R.drawable.cachorro);
                    break;
                case "Morcego":
                    img.setImageResource(R.drawable.morcego);
                    break;
                case "Camelo":
                    img.setImageResource(R.drawable.camelo);
                    break;
                case "Preguiça":
                    img.setImageResource(R.drawable.preguica);
                    break;
                default:
                    // Defina uma imagem padrão ou trate outros casos, se necessário
                    break;

            }


        }

    }
}
