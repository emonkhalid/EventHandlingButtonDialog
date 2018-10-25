package com.example.user.eventhandlingbuttondialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button toastBtn,adpBtn2,adpBtn3,adpBtn4,adpBtn5,adpBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //createButtonObject is called here
        createButtonObject();

        // Here onclicklister have been set to all button
        toastBtn.setOnClickListener(this);
        adpBtn2.setOnClickListener(this);
        adpBtn3.setOnClickListener(this);
        adpBtn4.setOnClickListener(this);
        adpBtn5.setOnClickListener(this);
        adpBtn6.setOnClickListener(this);
    }


    // This method is for creating Button objects
    public void createButtonObject(){
        toastBtn = findViewById(R.id.button1);
        adpBtn2 = findViewById(R.id.button2);
        adpBtn3 = findViewById(R.id.button3);
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
            Toast.makeText(this,"Button 2  has been clicked",Toast.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.button3){
            Toast.makeText(this,"Button 3  has been clicked",Toast.LENGTH_LONG).show();
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