
// Override back button behavior.

package com.example.snippet.backbutton;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // call when back button is pressed
    @Override
    public void onBackPressed() {

        new AlertDialog.Builder(this)

                // set title and message
                .setTitle("Back Button Sample App")
                .setMessage("Exit app?")

                // yes button
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })

                // no button
                .setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })

                // show dialog
                .show();
    }
}
