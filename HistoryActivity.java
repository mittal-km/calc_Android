package com.example.km.basiccalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoryActivity extends AppCompatActivity {

    Button close_b,back_b;

    @Override
    protected void onCreate(Bundle savedInstanceStatzze) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_);
        close_b = (Button)findViewById(R.id.close);
        back_b = (Button)findViewById(R.id.back);
        onClickClose();
        onClickBack();
    }
    public void AppExit()
    {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void onClickClose(){
        close_b.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(HistoryActivity.this);
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
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
    public void onClickBack(){
        back_b.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        onBackPressed();
                    }
                }
        );
    }
}
