package com.embracepetinsurance.myembracedemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DoubleA on 3/22/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PetViewHolder>{

    List<Pet> pets;
    RVAdapter(List<Pet> persons){
        this.pets = persons;
    }
    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pet_cardview, viewGroup, false);
        PetViewHolder pvh = new PetViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PetViewHolder pepetViewHolder, int i) {
        pepetViewHolder.petName.setText(pets.get(i).name);
        pepetViewHolder.petAge.setText(pets.get(i).age);
        pepetViewHolder.petSex.setText(pets.get(i).sex);
        pepetViewHolder.petBreed.setText(pets.get(i).breed);
        pepetViewHolder.petPhoto.setImageResource(pets.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public static class PetViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView petName;
        TextView petAge;
        TextView petSex;
        TextView petBreed;
        ImageView petPhoto;

        PetViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            petName = (TextView)itemView.findViewById(R.id.pet_name);
            petAge = (TextView)itemView.findViewById(R.id.pet_age);
            petSex = (TextView)itemView.findViewById(R.id.pet_sex);
            petBreed = (TextView)itemView.findViewById(R.id.pet_breed);
            petPhoto = (ImageView)itemView.findViewById(R.id.pet_photo);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
