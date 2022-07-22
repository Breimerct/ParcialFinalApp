package com.parcialfinalapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderProgramas>{

    ArrayList<Program> listProgram;

    public Adaptador(ArrayList<Program> listProgram) {
        this.listProgram = listProgram;
    }

    @Override
    public ViewHolderProgramas onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.programs_list_item, null, false);
        return new ViewHolderProgramas(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderProgramas holder, int position) {
        holder.txtTitleProgram.setText(listProgram.get(position).getProgramName());
        holder.txtInfoProgram.setText(listProgram.get(position).getProgramInfo());
        holder.imgProgram.setImageResource(listProgram.get(position).getImgProgram());
    }

    @Override
    public int getItemCount() {
        return this.listProgram.size();
    }

    public class ViewHolderProgramas extends RecyclerView.ViewHolder {

        TextView txtTitleProgram;
        TextView txtInfoProgram;
        ImageView imgProgram;

        public ViewHolderProgramas(View itemView) {
            super(itemView);

            txtTitleProgram = (TextView) itemView.findViewById(R.id.txtTitleProgram);
            txtInfoProgram = (TextView) itemView.findViewById(R.id.txtInfoProgram);
            imgProgram = (ImageView) itemView.findViewById(R.id.imgProgram);
        }
    }
}
