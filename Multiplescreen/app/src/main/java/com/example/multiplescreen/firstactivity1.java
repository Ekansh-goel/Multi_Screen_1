package com.example.multiplescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class firstactivity1 extends AppCompatActivity {
    private EditText edtname, edtaddress, edtdesignation, edtsalary;
    private Button btnshow, btnnext;
    String name, address, designation, salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname = findViewById(R.id.edtname);
        edtaddress = findViewById(R.id.edtaddress);
        edtsalary = findViewById(R.id.edtsalary);
        edtdesignation = findViewById(R.id.designation);
        btnshow = findViewById(R.id.btnshow);
        btnnext = findViewById(R.id.btnnext);

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edtname.getText().toString().trim();
                address = edtaddress.getText().toString().trim();
                designation = edtdesignation.getText().toString().trim();
                salary = edtsalary.getText().toString().trim();
                if ((name.length() > 0) && (address.length() > 0) && (designation.length() > 0) && (salary.length() > 0))
                    Toast.makeText(firstactivity1.this, "show butoon:" + name
                                    + "\n" + address + "\n" + designation + "\n" + salary ,
                                    Toast.LENGTH_SHORT).show();
                else
                {
                    Toast.makeText(firstactivity1.this, "Check input :some input is missing", Toast.LENGTH_SHORT).show();
                }

            }


        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(firstactivity1.this, secondactivity2.class);
                intent.putExtra("name_key", name);
                intent.putExtra("address_key", address);
                intent.putExtra("designation_key", designation);
                intent.putExtra("salary_key", salary);
                if ((name.length() > 0) && (address.length() > 0) && (designation.length() > 0) && (salary.length() > 0))
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(firstactivity1.this, "Check input :some input is missing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
