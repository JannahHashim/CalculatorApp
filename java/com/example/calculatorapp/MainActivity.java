package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//variable just put any name (tak semestinya sama dengan unique id dalam design)
//all the name should different from other
    private TextView result;
    private EditText edtno1;
    private EditText edtno2;
    private Button add;
    private Button minus;
    private Button mult;
    private Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Simple Calculator");

        //link with view id (from design)
        // var name = findViewById(R.id.unique id)
        result =  findViewById(R.id.tvresult);
        edtno1 =  findViewById(R.id.etno1);
        edtno2 =  findViewById(R.id.etno2); //makesure click link yg betul.
        add    =  findViewById(R.id.addbtn);
        minus  =  findViewById(R.id.minusbtn);
        mult   =  findViewById(R.id.multbtn);
        div    =  findViewById(R.id.divbtn);

        //subtraction
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (!edtno1.getText().toString().matches("")&& !edtno2.getText().toString().matches("" )){
                //if ((edtno1.getText().length() > 0) && (edtno2.getText().length() > 0)) {//to check
                    double etno1 = Double.parseDouble(edtno1.getText().toString()); //convert string to double & get the num value
                    double etno2 = Double.parseDouble(edtno2.getText().toString());
                    double tvresult = etno1 - etno2; //subtraction works
                    result.setText(Double.toString(tvresult)); // display the result

                    //tvresult.setText("" + res); OR tv.setText(String.valueOf(res);

                } else {

                   //Toast toast = Toast.makeText(MainActivity.this, "Enter Both Numbers", Toast.LENGTH_LONG);
                  // toast.show();

                    result.setText("please enter both numbers");
                    // feedback message appear in text view
                }
            }
        });

        //addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtno1.getText().toString().matches("")&& !edtno2.getText().toString().matches("" )){
               //if ((edtno1.getText().length() > 0) && (edtno2.getText().length() > 0)) {
                    double etno1 = Double.parseDouble(edtno1.getText().toString());
                    double etno2 = Double.parseDouble(edtno2.getText().toString());
                    double tvresult = etno1 + etno2;
                    result.setText(Double.toString(tvresult));
                } else {
                    //Toast toast = Toast.makeText(MainActivity.this, "Enter Both Numbers", Toast.LENGTH_LONG);
                   // toast.show();

                    result.setText("please enter both numbers");


                }
            }
        });

        //multiplication

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtno1.getText().toString().matches("")&& !edtno2.getText().toString().matches("" )){
               // if ((edtno1.getText().length() > 0) && (edtno2.getText().length() > 0)) {
                    double etno1 = Double.parseDouble(edtno1.getText().toString());
                    double etno2 = Double.parseDouble(edtno2.getText().toString());
                    double tvresult = etno1 * etno2;
                    result.setText(Double.toString(tvresult));
                } else {
                    //Toast toast = Toast.makeText(MainActivity.this, "Enter Both Numbers", Toast.LENGTH_LONG);
                   // toast.show();

                    result.setText("please enter both numbers");
                }
            }


        });

        //division

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edtno1.getText().toString().matches("")&& !edtno2.getText().toString().matches("" )){

                //    if ((edtno1.getText().length() > 0) && (edtno2.getText().length() > 0)) {
                    double etno1 = Double.parseDouble(edtno1.getText().toString());
                    double etno2 = Double.parseDouble(edtno2.getText().toString());
                    double tvresult = etno1 / etno2;
                    result.setText(Double.toString(tvresult));
                } else {
                  //  Toast toast = Toast.makeText(MainActivity.this, "Enter Both Numbers", Toast.LENGTH_LONG);
                  //  toast.show();
                    result.setText("please enter both numbers");
                }
            }


        });


    }
}
