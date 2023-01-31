package com.geektech.recyclerview_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.geektech.recyclerview_3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<String> animalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadData();
        AnimalAdapter adapter = new AnimalAdapter(animalList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Rat");
        animalList.add("Mouse");
        animalList.add("Cow");
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Tiger");
        animalList.add("Chicken");
        animalList.add("Panther");
        animalList.add("Panda");
        animalList.add("Zebra");
        animalList.add("Pig");
        animalList.add("Goat");
        animalList.add("Fox");
        animalList.add("Rabbit");
        animalList.add("Elephant");
        animalList.add("Kangaroo");
        animalList.add("Crocodile");
        animalList.add("Sheep");
    }
}