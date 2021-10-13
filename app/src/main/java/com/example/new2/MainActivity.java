package com.example.new2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.new2.provider.ProviderActivity;
import com.example.new2.user.UserActivity;


public class MainActivity extends AppCompatActivity {

    private Button btn_user;
    private Button btn_provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_user = findViewById(R.id.btn_user);
        btn_user.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });

        btn_provider = findViewById(R.id.btn_provider);
        btn_provider.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProviderActivity.class);
                startActivity(intent);
            }
        });


    }
}