package com.example.new2.provider;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.new2.R;

public class ProviderActivity extends AppCompatActivity {

    private Button btn_meal_info_resist;
    private Button btn_support_info_resist;
    private Button btn_volunteer_info_resist;
    private Button btn_meal_info_check;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);

        btn_meal_info_resist = findViewById(R.id.btn_meal_info_resist);
        btn_meal_info_resist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProviderActivity.this, MealInfoResistActivity.class);
                startActivity(intent);
            }
        });

        btn_support_info_resist=findViewById(R.id.btn_support_info_resist);
        btn_support_info_resist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProviderActivity.this, SupportInfoResistActivity.class);
                startActivity(intent);
            }
        });

        btn_volunteer_info_resist=findViewById(R.id.btn_volunteer_info_resist);
        btn_volunteer_info_resist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProviderActivity.this, VolunteerInfoResistActivity.class);
                startActivity(intent);
            }
        });

        btn_meal_info_check=findViewById(R.id.btn_meal_info_check);
        btn_meal_info_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProviderActivity.this, MealInfoCheckActivity.class);
                startActivity(intent);
            }
        });

    }
}