package com.example.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mTVNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTVNumber = (TextView) findViewById(R.id.number);
    }

    @Override
    public void onClick(View view) {
        Random random = new Random();
        int maxInt = 6;
        mTVNumber.setText( String.valueOf( random.nextInt() + 1) );
    }
}
