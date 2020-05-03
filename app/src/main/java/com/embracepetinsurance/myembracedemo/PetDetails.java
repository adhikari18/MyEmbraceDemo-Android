package com.embracepetinsurance.myembracedemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PetDetails extends AppCompatActivity {
    CardView cv;
    TextView tvPetName;
    TextView tvPetAge;
    TextView tvPetSex;
    TextView tvPetBreed;
    ImageView ivPetPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Pet selectedPet = (Pet)getIntent().getSerializableExtra("SelectedPet");

        tvPetName = (TextView)findViewById(R.id.pd_pet_name);
        tvPetAge = (TextView)findViewById(R.id.pd_pet_age);
        tvPetSex = (TextView)findViewById(R.id.pd_pet_sex);
        tvPetBreed = (TextView)findViewById(R.id.pd_pet_breed);
        ivPetPhoto = (ImageView)findViewById(R.id.pd_pet_photo);

        tvPetName.setText(selectedPet.name);
        tvPetAge.setText(selectedPet.age);
        tvPetSex.setText(selectedPet.sex);
        tvPetBreed.setText(selectedPet.breed);
        ivPetPhoto.setImageResource(selectedPet.photoId);
    }

}
