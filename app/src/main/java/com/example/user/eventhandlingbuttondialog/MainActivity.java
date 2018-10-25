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

    Button toastBtn,alertDialogdBtn,possitiveadBtn,adpBtn4,adpBtn5,adpBtn6;

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
        adpBtn4.setOnClickListener(this);
        adpBtn5.setOnClickListener(this);
        adpBtn6.setOnClickListener(this);
    }


    // This method is for creating Button objects
    public void createButtonObject(){
        toastBtn = findViewById(R.id.button1);
        alertDialogdBtn = findViewById(R.id.button2);
        possitiveadBtn = findViewById(R.id.button3);
        adpBtn4 = findViewById(R.id.button4);
        adpBtn5 = findViewById(R.id.button5);
        adpBtn6 = findViewById(R.id.button6);
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1){
            Toast.makeText(this,"This is a Toast Message.\nWhen you click this Button \nA Toast Message will appear.",Toast.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.button2){
            //Toast.makeText(this,"Button 2  has been clicked",Toast.LENGTH_LONG).show();
            new AlertDialog.Builder(this).setTitle("Title Section").setMessage("This is message Section.\nSo write down what you like to show into  message section.").show();
        }
        else if(v.getId() == R.id.button3){
            new AlertDialog.Builder(this).setTitle("Title").setMessage("This is Message section.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"Positive Button  has been clicked",Toast.LENGTH_LONG).show();
                }
            }).show();


        }
        else if(v.getId() == R.id.button4){
            Toast.makeText(this,"Button 4  has been clicked",Toast.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.button5){
            Toast.makeText(this,"Button 5  has been clicked",Toast.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.button6){
            Toast.makeText(this,"Button 6  has been clicked",Toast.LENGTH_LONG).show();
        }

    }

}
