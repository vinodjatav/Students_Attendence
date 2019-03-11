package com.example.vj.students_attendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntake,btnadd,btndelete,btnhelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntake.setOnClickListener(findViewById(R.id.btntake));
        btnadd.setOnClickListener(findViewById(R.id.btnadd));
        btndelete.setOnClickListener(findViewById(R.id.btndelete));
        btnhelp.setOnClickListener((View.OnClickListener) findViewById(R.id.btnhelp));


    }
}
