package com.counter.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity extends AppCompatActivity {


    TextView tv;
    Button btncounter,btnreset;
    int count =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.Mycounter);
        btncounter=(Button) findViewById(R.id.btncounter);
        btnreset=(Button) findViewById(R.id.btnreset);

        btncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tv.setText("Count is : " + count);
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tv.setText("Count is : " + count);
            }
        });



    }
}