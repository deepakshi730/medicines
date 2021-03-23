package com.gohool.login.sampledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AntiDiabetic_ayurvedic extends AppCompatActivity {

    LinearLayout diabecon, mehari;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_diabetic_ayurvedic);

        diabecon = (LinearLayout) findViewById(R.id.diabecon);
        mehari = (LinearLayout) findViewById(R.id.mehari);

        dialog = new Dialog(this);


        diabecon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaibeconDialog();
            }
        });
        mehari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 openMehariDialog();
            }
        });

    }
    public void openMehariDialog()
    {
        dialog.setContentView(R.layout.activity_mehari);
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
    public void openDaibeconDialog(){
        dialog.setContentView(R.layout.activity_daibecon);
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
