package com.example.rahul.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashBoard extends AppCompatActivity{
    private Button designTask,apiWork,serviceTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        designTask = findViewById(R.id.design_task);
        apiWork = findViewById(R.id.api_work);
        serviceTask = findViewById(R.id.service_task);
        designTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(DashBoard.this, MapActivity.class);
                startActivity(activityChangeIntent);
            }
        });
        serviceTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(DashBoard.this, MainActivity.class);
                startActivity(activityChangeIntent);
            }
        });
    }

}


