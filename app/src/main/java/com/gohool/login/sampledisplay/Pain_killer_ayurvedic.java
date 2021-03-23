package com.gohool.login.sampledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Pain_killer_ayurvedic extends AppCompatActivity {

    LinearLayout turmeric, clove,ice;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain_killer_ayurvedic);

        turmeric = (LinearLayout) findViewById(R.id.turmeric);
        clove = (LinearLayout) findViewById(R.id.clove);
        ice = (LinearLayout) findViewById(R.id.ice);

        dialog = new Dialog(this);

        turmeric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTurmericDialog();
            }
        });
        clove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCloveDialog();
            }
        });
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIceDialog();
            }
        });
    }
    public void openTurmericDialog(){
        dialog.setContentView(R.layout.activity_turmeric);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();}
    public void openCloveDialog(){
        dialog.setContentView(R.layout.activity_clove);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();}
    public void openIceDialog(){

        dialog.setContentView(R.layout.activity_ice);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();}
}
