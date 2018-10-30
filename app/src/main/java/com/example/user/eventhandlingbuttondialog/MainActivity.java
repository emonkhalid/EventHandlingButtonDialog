package com.example.user.eventhandlingbuttondialog;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button toastBtn,alertDialogdBtn,possitiveadBtn,panAdBtn,mustpnadBtn,npnadpBtn,lvBtn,clBtn,rdBtn,cdBtn,loadCusLayout;
    ArrayList<Integer> selectedItem;
    EditText etDate;
    DatePickerDialog datePickerDialog;
    Calendar dateCalendar;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-dd-mm",Locale.ENGLISH);


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
        lvBtn.setOnClickListener(this);
        clBtn.setOnClickListener(this);
        rdBtn.setOnClickListener(this);
        cdBtn.setOnClickListener(this);
        loadCusLayout.setOnClickListener(this);
    }


    // This method is for creating Button objects
    public void createButtonObject(){
        toastBtn = (Button)findViewById(R.id.button1);
        alertDialogdBtn = (Button)findViewById(R.id.button2);
        possitiveadBtn = (Button)findViewById(R.id.button3);
        panAdBtn = (Button)findViewById(R.id.button4);
        mustpnadBtn = (Button)findViewById(R.id.button5);
        npnadpBtn = (Button)findViewById(R.id.button6);
        lvBtn = (Button)findViewById(R.id.button7);
        clBtn = (Button)findViewById(R.id.button8);
        rdBtn = (Button)findViewById(R.id.button9);
        cdBtn = (Button)findViewById(R.id.button10);
        etDate = (EditText)findViewById(R.id.editText);
        Calendar newCalender = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dateCalendar = Calendar.getInstance();
                dateCalendar.set(year,month,dayOfMonth);
                etDate.setText(format.format(dateCalendar.getTime()));
            }
        }, newCalender.get(Calendar.YEAR),
                newCalender.get(Calendar.MONTH),
                newCalender.get(Calendar.DAY_OF_MONTH)
        );

        loadCusLayout = (Button)findViewById(R.id.button11);


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

        else if(v.getId() == R.id.button7){
            //This is for List View button which shows List of items in Alert Dialog
            final CharSequence[] items = {"Argentina","Brazil","Germany","England","Italy","Franch"};
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Choose Your Favourite Football Team?");
            builder.setItems(items, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"You Choose "+items[which],Toast.LENGTH_LONG).show();
                    dialog.dismiss();

                }
            });
            builder.show();

        }

        else if(v.getId() == R.id.button8){
            //This is for Check Box button which shows List of checked items in Alert Dialog
            selectedItem = new ArrayList<Integer>();
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Choose Your Home Land:");
            builder.setMultiChoiceItems(R.array.countries, null, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    if(isChecked){
                        selectedItem.add(which);
                    }
                    else if(selectedItem.contains(which)){
                        selectedItem.remove(Integer.valueOf(which));
                    }
                }
            });
            //This positive button code is to display selected index inside Alert Dialog
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String selectedIndex="";
                    for(Integer i:selectedItem){
                        selectedIndex +=i+" ";
                    }
                    Toast.makeText(MainActivity.this,"Selected Index is:" +selectedIndex,Toast.LENGTH_LONG).show();
                }
            });
            builder.show();

        }

        else if(v.getId() == R.id.button9){
            //This is for Radio button which shows a List to choose item through radio  in Alert Dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Choose Your Favourite Cricket Team?");
            builder.setSingleChoiceItems(R.array.countries, 1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"Your Home land index is:"+ which,Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }
            });
            builder.show();

        }

        else if(v.getId() == R.id.button10){
            //This is for Choose Date Button via DatePicker
            datePickerDialog.show();

        }

        else if(v.getId() == R.id.button11){
            //This is for Choose Date Button via DatePicker
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            LayoutInflater inflater = MainActivity.this.getLayoutInflater();
            builder.setView(inflater.inflate(R.layout.login,null));
            builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_LONG).show();
                }
            });
            builder.show();

        }


    }

}
