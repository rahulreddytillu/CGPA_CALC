package com.example.cgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CgpaRes extends AppCompatActivity {
    TextView j,k;
    float x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_res);
        j=(TextView)findViewById(R.id.textView14);
        k=(TextView)findViewById(R.id.textView15);
        Bundle data = getIntent().getExtras();
        x = data.getInt("cgpa" );
        y = data.getInt("percentage" );
    }
    public void f3(View v)
    {
        j.setText(" "+x);
    }
    public void f4(View v)
    {
        k.setText(x +"%");
    }
    public void f5(View v)
    {
        Intent abc = new Intent(this,MainActivity.class);
        startActivity(abc);
    }
}
