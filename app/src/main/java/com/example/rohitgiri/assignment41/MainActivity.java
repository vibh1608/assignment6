package com.example.rohitgiri.assignment41;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1,e2;
        final TextView btn,txt;

        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        btn=(TextView)findViewById(R.id.t2);
        txt=(TextView)findViewById(R.id.t3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(e1.getText().toString()+" "+e2.getText().toString());
            }
        });

    }
}
