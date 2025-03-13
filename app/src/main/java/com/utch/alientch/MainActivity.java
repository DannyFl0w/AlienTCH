package com.utch.alientch;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar la lista de especialistas
        List<Especialistas> especialistas = new ArrayList<>();
        EspecialistaAdapter adapter = new EspecialistaAdapter(this, especialistas);

        // Configurar el ListView y el adaptador
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);

        // Configurar el TextView para el estado vacío
        listView.setEmptyView(findViewById(android.R.id.empty));

        // Agregar algunos especialistas de ejemplo
        especialistas.add(new Especialistas("Eduardo", "Programación", "666-666-666"));
        especialistas.add(new Especialistas("Alan", "Química", "987-654-3210"));
        adapter.notifyDataSetChanged();
    }
}