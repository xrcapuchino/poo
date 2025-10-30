package com.example.examen2doparcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    String deportescomenta[] = {
            "uno", "dos", "tres"
    };

    String deporteslistita[] = {
            "esfera del dragon", "Red Bull", "Ferrari"
    };

    int deportesimagenes[] = {
            R.drawable.esfera, R.drawable.carrito, R.drawable.carrito2
    };

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // el ListView
        listview = findViewById(R.id.listita);

        //asignar adaptador
        Adaptador adaptadorcito = new Adaptador(
                getApplicationContext(),
                deportescomenta,
                deporteslistita,
                deportesimagenes
        );

        listview.setAdapter(adaptadorcito);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(this, "Seleccionaste " + String.valueOf(i), Toast.LENGTH_SHORT).show();


        if (i == 0) {
            Intent intento = new Intent(this, MenuPuntitos.class);
            startActivity(intento);
        }

    }


}