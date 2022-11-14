package com.example.volley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.DOMStringList;

import java.util.List;

public class pokemonAdapter extends RecyclerView.Adapter<pokemonAdapter.viewHolder> {
    private List<pokemon> I;
    List<pokemonNombre> pki;
    public pokemonAdapter(List<pokemon>I){this.I = I;}

    @NonNull
    @Override
    public pokemonAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new viewHolder(v);
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
        pokemon pokemonHolder;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtintent = (TextView)itemView.findViewById(R.id.nombre);
            txtintent2 = (TextView)itemView.findViewById(R.id.url);
        }
        public void setData(pokemon intents) {
            pokemonHolder = intents;
        }
    }
}
