package com.example.info;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    CheckBox Male;
    CheckBox Female;

    RadioButton radioButton1;
    RadioButton radioButton2;

    TextView tv;
    Button btn;

    Calendar c;
    DatePickerDialog dpd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Male = (CheckBox) findViewById(R.id.checkBox_male);
        Female= (CheckBox) findViewById(R.id.checkBox_female);

        radioButton1= (RadioButton)findViewById(R.id.radioOne);
        radioButton2= (RadioButton)findViewById(R.id.radioTwo);

        tv = (TextView) findViewById(R.id.textView4);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int day =c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd= new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int yy, int mm, int dd) {
                        tv.setText(dd+"/"+mm+"/"+yy);
                    }
                },year,month,day);
                dpd.show();
            }
        });




        Male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Male.isChecked()){
                    Toast.makeText(MainActivity.this,"Male Checkbox is Checked",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Male Checkbox is Unchecked",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Female.isChecked()){
                    Toast.makeText(MainActivity.this,"Female Checkbox is Checked",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Female Checkbox is Unchecked",Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton1.isChecked()){
                    Toast.makeText(MainActivity.this,"Undergraduate",Toast.LENGTH_SHORT).show();
                }
                else{

                }
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton2.isChecked()){
                    Toast.makeText(MainActivity.this,"Graduate",Toast.LENGTH_SHORT).show();
                }
                else{

                }
            }
        });
    }
}

