package com.example.examen2doparcial;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

public class MenuPuntitos extends AppCompatActivity implements View.OnClickListener {

    FragmentTransaction transicion;
    Button regresar;

    Saludo saludo;
    Inicio oinicio = new Inicio();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_puntitos);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        regresar = findViewById(R.id.regresar);
        regresar.setOnClickListener(this);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.contenedorfragmentos, oinicio)
                .commit();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.regresar) {
            finish();
        } else {
            Toast.makeText(this, "Opción desconocida", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        String opcion = item.getTitle().toString();

        if (opcion != null) {
            saludo = new Saludo(); // ¡Este paso es crucial!

            transicion = getSupportFragmentManager().beginTransaction();
            transicion.replace(R.id.contenedorfragmentos, saludo);
            transicion.commit();

            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
