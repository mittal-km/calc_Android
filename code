package com.example.km.basiccalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.*;

import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;

public class MainActivity extends AppCompatActivity {
        TextView t1,t2,t3;
        EditText e1,e2;
        Button close_b,history_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         e1 = (EditText)findViewById(R.id.num1);
         e2 = (EditText)findViewById(R.id.num2);
         t1 = (TextView)findViewById(R.id.result);
         t2 = (TextView)findViewById(R.id.emoji);
         t3 = (TextView)findViewById(R.id.equation);
        history_b = (Button)findViewById(R.id.history);
        close_b = (Button)findViewById(R.id.close);
          onClickClose();
        onButtonClickHistory();
    }
    public void onButtonClickAdd(View v) {
        InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        try{
            if (e1 != null && e2 != null) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double ans = num1 + num2;
                t1.setText(Double.toString(ans));
                t2.setText(":D");
                t3.setText(num1 + " + " + num2);
            }
            else {
                throw new IllegalArgumentException("");
            }
        }
        catch(IllegalArgumentException e){
            Toast.makeText(this,"Enter Values",Toast.LENGTH_SHORT).show();
            t1.setText("Empty Input");
            t2.setText("-_-");
        }
    }

    public void onButtonClickSub(View v){
        InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        try {
            if ((e1 != null && e2 != null)) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double ans = num1 - num2;
                t1.setText(Double.toString(ans));
                t2.setText(":D");
                t3.setText(num1 + " - " + num2);
            }
            else {
                throw new IllegalArgumentException("");
            }
        }
        catch(IllegalArgumentException e){
            Toast.makeText(this,"Enter Values",Toast.LENGTH_SHORT).show();
            t1.setText("Empty Input");
            t2.setText("-_-");
        }
    }
    public void onButtonClickMul(View v){
        InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        try {
            if (e1 != null || e2 != null) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double ans = num1 * num2;
                t1.setText(Double.toString(ans));
                t2.setText(":D");
                t3.setText(num1 + " * " + num2);
            } else {
                throw new IllegalArgumentException("");
            }
        }
        catch(IllegalArgumentException e){
            Toast.makeText(this,"Enter Values",Toast.LENGTH_SHORT).show();
            t1.setText("Empty Input");
            t2.setText("-_-");
        }
    }
    public void onButtonClickDiv(View v){
        InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        try {
            if (e1 != null || e2 != null) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double ans = 0;
                try {
                    if (num2 == 0)
                        throw new ArithmeticException();
                    else {
                        ans = num1 / num2;
                        t1.setText(String.format("%.5f", ans));
                        t2.setText(":D");
                        t3.setText(num1 + " / " + num2);
                    }

                } catch (ArithmeticException e) {
                    t1.setText("DivideByZero");
                    t2.setText("-_-");
                    t3.setText("Arithmetic Error");
                }
            }
            else {
                throw new IllegalArgumentException("");
            }
        }
        catch(IllegalArgumentException e){
            Toast.makeText(this,"Enter Values",Toast.LENGTH_SHORT).show();
            t1.setText("Empty Input");
            t2.setText("-_-");
        }
    }
    public void onButtonClickClear(View v){
        e1.setText("");
        e2.setText("");
        e2.clearFocus();
        t1.setText("0000");
        t2.setText(":D");
        t3.setText("");
    }

    public void onClickClose(){
        close_b.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("Do you really want to exit?")
                                .setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        AppExit();
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.cancel();
                                    }
                                });
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("Alert !!");
                        alert.show();
                    }
                }
        );
    }
    public void onButtonClickHistory(){
        history_b.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent("com.example.km.basiccalculator.HistoryActivity");
                    startActivity(intent);
                }
            }
        );
    }
    public void AppExit()
    {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
