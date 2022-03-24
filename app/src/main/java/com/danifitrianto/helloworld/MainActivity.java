package com.danifitrianto.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declare variable
    TextView incrementNumber;
    private int nCount = 0;
    private String message = "You Click Me!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set connection to the attribut
        incrementNumber = (TextView) findViewById(R.id.intIncement);

    }

    public void doToast(View view) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }

    public void doCount(View view) {
        nCount++;

        // check if number doesn't had a 0 value
        if((incrementNumber != null)) {
            incrementNumber.setText(String.valueOf(nCount));
        }

    }
}