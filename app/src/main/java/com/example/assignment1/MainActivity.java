package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<programmingLanguages> programmingLanguagesList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecycleView);

        String[] languages = getResources().getStringArray(R.array.languages_txt);

        for (int i = 0; i < languages.length; i++) {
            String languageWithIndex = languages[i] + " - " + (i);
            programmingLanguages programmingLanguage = new programmingLanguages(languageWithIndex, "This is the Description of the item and appearing in the second line", i);
            programmingLanguagesList.add(programmingLanguage);
        }


        MyAdapter adapter = new MyAdapter(programmingLanguagesList );
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}