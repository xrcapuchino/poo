package com.example.examen2doparcial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Saludo extends Fragment implements View.OnClickListener {

    Button botoncito;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vistita = inflater.inflate(R.layout.fragment_saludo, container, false);

        botoncito = vistita.findViewById(R.id.saludo);
        botoncito.setOnClickListener(this);

        return vistita;


    }


    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(), "Hola kikin un 10 no? ", Toast.LENGTH_SHORT).show();
    }
}