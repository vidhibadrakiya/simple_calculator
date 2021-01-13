package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    private EditText nu1;
    private EditText nu2;
    private TextView re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nu1=(EditText)findViewById(R.id.nu1);
        nu2=(EditText)findViewById(R.id.nu2);
        re=(TextView)findViewById(R.id.re);
    }

    public void bsum(View view) {
        int k1 = Integer.parseInt(nu1.getText().toString());
        int k2 = Integer.parseInt(nu2.getText().toString());
        int s = k1+k2;
        re.setText(String.valueOf(s));
    }

    public void bsub(View view) {
        int k1 = Integer.parseInt(nu1.getText().toString());
        int k2 = Integer.parseInt(nu2.getText().toString());
        int s = k1-k2;
        re.setText(String.valueOf(s));
    }

    public void bmul(View view) {
        int k1 = Integer.parseInt(nu1.getText().toString());
        int k2 = Integer.parseInt(nu2.getText().toString());
        int s = k1*k2;
        re.setText(String.valueOf(s));
    }

    public void bdiv(View view) {
        int k1 = Integer.parseInt(nu1.getText().toString());
        int k2 = Integer.parseInt(nu2.getText().toString());
        int s = k1 / k2;
        re.setText(String.valueOf(s));
    }

}