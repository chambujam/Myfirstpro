package com.example.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button  ok;
    TextView result;
    ImageView image;
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageExample);

         ok.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 
                 showDialogMessage();
                 
             }

         });

    }

             private void showDialogMessage() {

                 AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
                 alertDialog.setTitle("Delete")
                         .setMessage("Do you want to delete text?")
                         .setNegativeButton("No", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {

                                 dialog.cancel();


                             }
                         })
                         .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {

                                 result.setText("");


                             }
                         }).show();
                 alertDialog.create();

             }

   }
