package com.example.multiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondactivity2 extends AppCompatActivity {
    TextView txtname, txtaddress, txtdesignation, txtsalary;
    Button btnnext;
    String name, address, designation, salary;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        txtname = findViewById(R.id.txtname);
        txtaddress = findViewById(R.id.txtaddress);
        txtdesignation = findViewById(R.id.txtdesignation);
        txtsalary = findViewById(R.id.txtsalary);
        btnnext = findViewById(R.id.btnnext);

        Bundle bundle = getIntent().getExtras();

        name = bundle.getString("name_key");
        address = bundle.getString("address_key");
        designation = bundle.getString("designation_key");
        salary = bundle.getString("salary_key");

        txtname.setText(name);
        txtaddress.setText(address);
        txtdesignation.setText(designation);
        txtsalary.setText(salary);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(secondactivity2.this, activitythird.class);
                intent1.putExtra("name_key", name);
                intent1.putExtra("designation_key", designation);
                startActivity(intent1);
            }
        });
    }
}
