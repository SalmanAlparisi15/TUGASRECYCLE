package com.example.tugasday06;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    private ArrayList<Model> Model;
    private Context context;

    public Adapter(ArrayList<com.example.tugasday06.Model> model,Context context)  {
        this.Model = model;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist,parent,false);
        viewHolder vh = new viewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
        Model model = Model.get(position);
        holder.nama.setText(Model.get(position).getNama());
        holder.asal.setText(Model.get(position).getAsal());
        holder.genre.setText(Model.get(position).getGenre());
        holder.tahun.setText(Model.get(position).getTahun());
        holder.deskripsi.setText(Model.get(position).getDeskripsi());
        holder.foto.setImageResource(Model.get(position).getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("Nama", model.getNama());
                intent.putExtra("Asal", model.getAsal());
                intent.putExtra("Genre", model.getGenre());
                intent.putExtra("Tahun", model.getTahun());
                intent.putExtra("Deskripsi", model.getDeskripsi());
                intent.putExtra("Foto", model.getFoto());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Model.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {



        TextView nama,asal,genre,tahun, deskripsi;
        ImageView foto;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.tvNama);
            asal = itemView.findViewById(R.id.tvAsal);
            genre = itemView.findViewById(R.id.tvGenre);
            tahun = itemView.findViewById(R.id.tvTahun);
            deskripsi = itemView.findViewById(R.id.tvDeskripsi);
            foto = itemView.findViewById(R.id.ivFoto);
        }
    }
}
