package com.example.user.eventhandlingbuttondialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button toastBtn,alertDialogdBtn,possitiveadBtn,panAdBtn,mustpnadBtn,npnadpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //createButtonObject is called here
        createButtonObject();

        // Here onclicklister have been set to all button
        toastBtn.setOnClickListener(this);
        alertDialogdBtn.setOnClickListener(this);
        possitiveadBtn.setOnClickListener(this);
        panAdBtn.setOnClickListener(this);
        mustpnadBtn.setOnClickListener(this);
        npnadpBtn.setOnClickListener(this);
    }


    // This method is for creating Button objects
    public void createButtonObject(){
        toastBtn = findViewById(R.id.button1);
        alertDialogdBtn = findViewById(R.id.button2);
        possitiveadBtn = findViewById(R.id.button3);
        panAdBtn = findViewById(R.id.button4);
        mustpnadBtn = findViewById(R.id.button5);
        npnadpBtn = findViewById(R.id.button6);
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1){
            //This is a simple Toast Message.
            Toast.makeText(this,"This is a Toast Message.\nWhen you click this Button \nA Toast Message will appear.",Toast.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.button2){
            //This is for Alert S button which shows Simple Alert Dialog
            new AlertDialog.Builder(this).setTitle("Title Section").setMessage("This is message Section.\nSo write down what you like to show into  message section.").show();
        }
        else if(v.getId() == R.id.button3){
            //This is for Alert P button which shows Only positive menu
            new AlertDialog.Builder(this).setTitle("Title").setMessage("This is Message section.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"Positive Button  has been clicked",Toast.LENGTH_LONG).show();
                }
            }).show();


        }
        else if(v.getId() == R.id.button4){
            //This is for Alert PN button which shows both positive and negative menu
            new AlertDialog.Builder(this).setTitle("Are you sure?").setMessage("Do you want to delete.").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"Delete Function will be executed.",Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"Delete Function wont be executed.",Toast.LENGTH_LONG).show();
                    dialog.cancel();
                }
            }).show();
        }
        else if(v.getId() == R.id.button5){
            //This is for Alert MC button which ensure must choose positive or negative menu options
            new AlertDialog.Builder(this).setTitle("Are you sure?")
                    .setMessage("Do you want to delete.").setIcon(R.drawable.ic_launcher_background).setCancelable(false)

                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,"Delete Function will be executed.",Toast.LENGTH_LONG).show();
                            dialog.cancel();
                        }
                     })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,"Delete Function wont be executed.",Toast.LENGTH_LONG).show();
                            dialog.cancel();
                        }
                    }).show();

        }
        else if(v.getId() == R.id.button6){
            //This is for 3 Options button which shows neutral, positive and negative menu
            new AlertDialog.Builder(this).setTitle("Are you sure?")
                    .setMessage("Do you want to delete.").setIcon(R.drawable.ic_launcher_background).setCancelable(false)

                    .setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,"Neutral Function will be executed.",Toast.LENGTH_LONG).show();
                            dialog.cancel();
                        }
                    })

                    .setNegativeButton("Negative Side", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,"Negative Side Function wont be executed.",Toast.LENGTH_LONG).show();
                            dialog.cancel();
                        }
                    })
                    .setPositiveButton("Positive Side", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this,"Positive Side Function will be executed.",Toast.LENGTH_LONG).show();
                            dialog.cancel();
                        }
                    })
                    .show();
        }

    }

}
