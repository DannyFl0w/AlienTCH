package com.utch.alientch;

import androidx.annotation.NonNull;

public class Especialistas {
    private final String nombre;
    private final String especialidad;
    private final String telefono;

    public Especialistas(String nombre, String especialidad, String telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    @NonNull
    @Override
    public String toString() {
        return nombre + " - " + especialidad + " - " + telefono;
    }
}