package com.mdstudios.scratchapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jawad on 2/4/2016.
 */
public class ActivityMain extends Activity {
    private TextView myTextview;
    private int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actitiy_main);

        myTextview = (TextView) findViewById(R.id.textView);
        myTextview.setText("Something");

        Button myButton = (Button) findViewById(R.id.button2);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saySomething("I said something!");
            }
        });
    }

    public void buttonBClick(View v) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

    // Outputs to screen "output" and logs it
    private void saySomething(String output) {
        /*Toast message = Toast.makeText(this, output, Toast.LENGTH_LONG);
        message.show();*/

        mCounter++;
        myTextview.setText("Button click x" + mCounter);

        Toast.makeText(this, output, Toast.LENGTH_LONG).show();
    }
}
