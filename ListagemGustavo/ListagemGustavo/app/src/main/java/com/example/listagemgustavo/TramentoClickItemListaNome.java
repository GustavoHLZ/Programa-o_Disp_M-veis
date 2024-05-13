package com.example.listagemgustavo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TramentoClickItemListaNome extends ArrayAdapter<String> {

    private Context mContext;
    private int mResource;

    public TramentoClickItemListaNome(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Inflar o layout do item da lista
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);


        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewNome = convertView.findViewById(R.id.textViewNome);


        String animal = getItem(position);


        textViewNome.setText(animal);


        switch (animal) {
            case "Pato":
                imageView.setImageResource(R.drawable.pato);
                break;
            case "Cachorro":
                imageView.setImageResource(R.drawable.cachorro);
                break;
            case "Morcego":
                imageView.setImageResource(R.drawable.morcego);
                break;
            case "Camelo":
                imageView.setImageResource(R.drawable.camelo);
                break;
            case "Preguiça":
                imageView.setImageResource(R.drawable.preguica);
                break;
            default:
                imageView.setImageResource(android.R.color.transparent);
                break;
        }

        return convertView;
    }
}