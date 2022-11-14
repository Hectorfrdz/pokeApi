package com.example.volley;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class nombreAdaptador extends RecyclerView.Adapter<nombreAdaptador.viewHolder> {
    private List<pokemonNombre> I;

    public nombreAdaptador(List<pokemonNombre>I){this.I = I;}

    @NonNull
    @Override
    public nombreAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)  {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new nombreAdaptador.viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.setData(I.get(position));
    }

    @Override
    public int getItemCount() {
        return I.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        TextView txtintent;
        TextView txtintent2;
        pokemonNombre pokemonHolder;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtintent = (TextView)itemView.findViewById(R.id.nombre);
            txtintent2 = (TextView)itemView.findViewById(R.id.url);
        }
        public void setData(pokemonNombre intent) {
            pokemonHolder = intent;
            txtintent.setText(intent.getName());
            txtintent2.setText(intent.getUrl());
        }
    }
}
