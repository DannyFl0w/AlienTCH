package com.utch.alientch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EspecialistaAdapter extends RecyclerView.Adapter<EspecialistaAdapter.ViewHolder> {

    private List<Especialistas> listaEspecialistas;

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
        holder.txtNombre.setText(especialista.getNombre());
        holder.txtEspecialidad.setText(especialista.getEspecialidad());
        holder.txtTelefono.setText(especialista.getTelefono());
        holder.imgEspecialista.setImageResource(especialista.getImagenResId());
        holder.HoraAtencion.setText(especialista.getHoraAtencion());
    }

    @Override
    public int getItemCount() {
        return listaEspecialistas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtEspecialidad, txtTelefono , HoraAtencion;
        ImageView imgEspecialista;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.tvNombre);
            txtEspecialidad = itemView.findViewById(R.id.tvEspecialidad);
            txtTelefono = itemView.findViewById(R.id.tvTelefono);
            imgEspecialista = itemView.findViewById(R.id.imgEspecialista);
            HoraAtencion = itemView.findViewById(R.id.HoraAtencion);
        }
    }
}
