package com.andreas.aplikasisederhanadicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMotor;
    private ArrayList<MotorClass> listMotor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMotor = findViewById(R.id.rvMotor);
        rvMotor.setHasFixedSize(true);

        listMotor.addAll(MotorData.getListData());
    }
    private void showRecyclerList(){
        rvMotor.setLayoutManager(new LinearLayoutManager(this));
        MotorAdapter motorAdapter = new MotorAdapter(listMotor);
        rvMotor.setAdapter(motorAdapter);
    }
}