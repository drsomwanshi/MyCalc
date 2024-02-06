package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String num="";
    String op="";

    TextView txt1;

    int n1,n2,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
    }

    public void numclick(View view) {

        Button b=(Button) view;
        num=num+b.getText().toString();
        txt1.setText(num);



    }

    public void opclick(View view) {

        Button b=(Button) view;
        op=b.getText().toString();
        n1=Integer.parseInt(txt1.getText().toString());
        num="";
    }

    public void opeq(View view) {
        n2=Integer.parseInt(txt1.getText().toString());
        if(op.equals("+"))
        {
            ans=n1+n2;
        }
        if(op.equals("-"))
        {
            ans=n1-n2;
        }
        if(op.equals("*"))
        {
            ans=n1*n2;
        }
        if(op.equals("/"))
        {
            ans=n1/n2;
        }
        txt1.setText("" + ans);


    }
}