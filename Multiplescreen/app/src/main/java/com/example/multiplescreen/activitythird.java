package com.example.multiplescreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activitythird extends AppCompatActivity {
    TextView txtname, txtdesignation;
    Button btnload;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdactivity);

        txtname = findViewById(R.id.txtname);
        txtdesignation = findViewById(R.id.txtdesignation1);

        btnload = findViewById(R.id.btnload);

        btnload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();

                String name = bundle.getString("name_key1");
                String designation = bundle.getString("designation_key1");

                name = bundle.getString("name_key");
                designation  = bundle.getString("designation_key");
                txtname.setVisibility(View.VISIBLE);
                txtdesignation.setVisibility(View.VISIBLE);
                txtname.setText(name);
                txtdesignation.setText(designation);
            }
        });

    }
}
