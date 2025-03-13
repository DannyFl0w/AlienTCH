package com.utch.alientch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EspecialistaAdapter extends RecyclerView.Adapter<EspecialistaAdapter.ViewHolder> {

    private final List<Especialistas> listaEspecialistas;

    public EspecialistaAdapter(List<Especialistas> listaEspecialistas) {
        this.listaEspecialistas = listaEspecialistas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_especialista, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Especialistas especialista = listaEspecialistas.get(position);
        holder.tvNombre.setText(especialista.getNombre());
        holder.tvEspecialidad.setText(especialista.getEspecialidad());
        holder.tvTelefono.setText(especialista.getTelefono());
    }

    @Override
    public int getItemCount() {
        return listaEspecialistas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvEspecialidad, tvTelefono;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvEspecialidad = itemView.findViewById(R.id.tvEspecialidad);
            tvTelefono = itemView.findViewById(R.id.tvTelefono);
        }
    }
}

