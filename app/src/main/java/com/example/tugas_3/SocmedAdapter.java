package com.example.tugas_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SocmedAdapter extends RecyclerView.Adapter<SocmedAdapter.ViewHolder> {
    private Context context;
    private ArrayList<SocmedModel> socmedModels;

    public ArrayList<SocmedModel> getSocmedModels(){
        return  socmedModels;

    }

    public void setSocmedModels(ArrayList<SocmedModel> socmedModels){
       this.socmedModels = socmedModels;
    }

    public SocmedAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public SocmedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data,parent,false );
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull SocmedAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getSocmedModels().get(position).getLogoSocmed()).into(holder.imv1);
        holder.tev1.setText(getSocmedModels().get(position).getNamaSocmed());
    }

    @Override
    public int getItemCount() {
        return socmedModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imv1;
        private TextView tev1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imv1= itemView.findViewById(R.id.iv1);
            tev1 = itemView.findViewById(R.id.tv1);
        }
    }
}

