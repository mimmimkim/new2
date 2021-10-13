package com.example.new2.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.new2.R;

import java.util.ArrayList;

public class MyPageActivity extends AppCompatActivity {

    ArrayList<SampleDataFav> soup_kitchen_DataList;

    private Button btn_support_info;
    private Button btn_volunteer_resister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage_main);


        btn_support_info = findViewById(R.id.btn_support_info);
        btn_support_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, SupportInfoActivity.class);
                startActivity(intent);
            }
        });

        btn_volunteer_resister = findViewById(R.id.btn_volunteer_resister);
        btn_volunteer_resister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, SupportInfoActivity.class);
                startActivity(intent);
            }
        });



        this.InitializeMovieData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final FavAdapter FavAdapter = new FavAdapter(this,soup_kitchen_DataList);

        listView.setAdapter(FavAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        FavAdapter.getItem(position).getSoup_kitchen_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeMovieData()
    {
        soup_kitchen_DataList = new ArrayList<SampleDataFav>();

        soup_kitchen_DataList.add(new SampleDataFav("서울 1 급식소"));
        soup_kitchen_DataList.add(new SampleDataFav("경기 1 급식소"));
        soup_kitchen_DataList.add(new SampleDataFav("서울 2 급식소"));
    }

}

