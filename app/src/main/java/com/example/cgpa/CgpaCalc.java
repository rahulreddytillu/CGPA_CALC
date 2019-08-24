package com.example.cgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CgpaCalc extends AppCompatActivity {
    EditText a1,a2,a3,a4,a5,a6,a7,a8,b1,b2,b3,b4,b5,b6,b7,b8;
    static float c1,c2,c3,c4,c5,c6,c7,c8,d1,d2,d3,d4,d5,d6,d7,d8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calc);

        a1=(EditText)findViewById(R.id.editText2);
        a2=(EditText)findViewById(R.id.editText3);
        a3=(EditText)findViewById(R.id.editText4);
        a4=(EditText)findViewById(R.id.editText5);
        a5=(EditText)findViewById(R.id.editText6);
        a6=(EditText)findViewById(R.id.editText7);
        a7=(EditText)findViewById(R.id.editText8);
        a8=(EditText)findViewById(R.id.editText9);
        b1=(EditText)findViewById(R.id.editText10);
        b2=(EditText)findViewById(R.id.editText11);
        b3=(EditText)findViewById(R.id.editText12);
        b4=(EditText)findViewById(R.id.editText13);
        b5=(EditText)findViewById(R.id.editText14);
        b6=(EditText)findViewById(R.id.editText15);
        b7=(EditText)findViewById(R.id.editText16);
        b8=(EditText)findViewById(R.id.editText17);

    }
    public void f2(View abc)
    {
        c1 = Float.parseFloat(a1.getText().toString());
        c2 = Float.parseFloat(a2.getText().toString());
        c3 = Float.parseFloat(a3.getText().toString());
        c4 = Float.parseFloat(a4.getText().toString());
        c5 = Float.parseFloat(a5.getText().toString());
        c6 = Float.parseFloat(a6.getText().toString());
        c7 = Float.parseFloat(a7.getText().toString());
        c8 = Float.parseFloat(a8.getText().toString());
        d1 = Float.parseFloat(b1.getText().toString());
        d2 = Float.parseFloat(b2.getText().toString());
        d3 = Float.parseFloat(b3.getText().toString());
        d4 = Float.parseFloat(b4.getText().toString());
        d5 = Float.parseFloat(b5.getText().toString());
        d6 = Float.parseFloat(b6.getText().toString());
        d7 = Float.parseFloat(b7.getText().toString());
        d8 = Float.parseFloat(b8.getText().toString());
        float tot,avg,perc;
        avg = (c1*d1)+(c2*d2)+(c3*d3)+(c4*d4)+(c5*d5)+(c6*d6)+(c7*d7)+(c8*d8);
        tot=avg/8;
        perc = (float) (tot*(9.5));
        Intent ab = new Intent(this,CgpaRes.class);
        ab.putExtra("cgpa",tot);
        ab.putExtra("percentage",perc);
        startActivity(ab);
    }
}
