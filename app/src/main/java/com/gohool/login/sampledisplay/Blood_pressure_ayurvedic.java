package com.gohool.login.sampledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Blood_pressure_ayurvedic extends AppCompatActivity {

    LinearLayout amla, gotukola, ashwagandha, garlic, honey;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_pressure_ayurvedic);

        amla = (LinearLayout) findViewById(R.id.amla);
        gotukola = (LinearLayout) findViewById(R.id.gotukola);
        ashwagandha = (LinearLayout) findViewById(R.id.ashwagandha);
        garlic = (LinearLayout) findViewById(R.id.garlic);
        honey = (LinearLayout) findViewById(R.id.honey);

        dialog = new Dialog(this);

        amla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAmlaDialog();
            }
        });
        gotukola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGotukolaDialog();
            }
        });
        ashwagandha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAshwagandhaDialog();
            }
        });
        garlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGarlicDialog();
            }
        });
        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHoneyDialog();
            }
        });
    }
    public void openAmlaDialog(){
        dialog.setContentView(R.layout.activity_amla);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }
    public void openGotukolaDialog(){
        dialog.setContentView(R.layout.activity_gotukola);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }
    public void openAshwagandhaDialog(){
        dialog.setContentView(R.layout.activity_ashwagandha);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }
    public void openGarlicDialog(){
        dialog.setContentView(R.layout.activity_garlic);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }
    public void openHoneyDialog(){
        dialog.setContentView(R.layout.activity_honey);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }
}
