package com.utch.alientch;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user == null) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        setContentView(R.layout.activity_main);

        // Inicializar RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializar lista de especialistas
        List<Especialistas> listaEspecialistas = new ArrayList<>();
        listaEspecialistas.add(new Especialistas("Eduardo", "Programación", "666-666-666"));
        listaEspecialistas.add(new Especialistas("Alan", "Química", "987-654-3210"));
        listaEspecialistas.add(new Especialistas("Sofía", "Matemáticas", "123-456-7890"));

        // Configurar adaptador y RecyclerView
        EspecialistaAdapter adapter = new EspecialistaAdapter(listaEspecialistas);
        recyclerView.setAdapter(adapter);
    }
}
}
