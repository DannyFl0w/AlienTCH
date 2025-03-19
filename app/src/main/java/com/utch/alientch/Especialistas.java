package com.utch.alientch;

import androidx.annotation.NonNull;

public class Especialistas {
    private final String nombre;
    private final String especialidad;
    private final String telefono;

    private int imagenResId;

    private String HoraAtencion;

    public Especialistas(String nombre, String especialidad, String telefono, int imagenResId, String HoraAtencion) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.imagenResId = imagenResId;
        this.HoraAtencion = HoraAtencion;
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

    public int getImagenResId() {
        return imagenResId;
    }

    public String getHoraAtencion() {
        return HoraAtencion;
    }

    @NonNull
    @Override
    public String toString() {
        return nombre + " - " + especialidad + " - " + telefono;
    }
}