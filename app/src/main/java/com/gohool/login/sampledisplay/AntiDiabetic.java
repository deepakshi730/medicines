package com.gohool.login.sampledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AntiDiabetic extends AppCompatActivity {

    LinearLayout glimestar, daonil;
    Button daonil_cheap;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_diabetic);


        glimestar = (LinearLayout) findViewById(R.id.glimestar);
        daonil = (LinearLayout) findViewById(R.id.daonil);
        daonil_cheap = (Button) findViewById(R.id.dionil_cheap);

        dialog = new Dialog(this);

        glimestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        daonil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openDaonilDialog();
            }
        });

        daonil_cheap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaonilCheap();
            }
        });
    }

    public void openDaonilCheap(){
        dialog.setContentView(R.layout.activity_daonil_cheap);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        LinearLayout gliconil1 = dialog.findViewById(R.id.gliconil);
        LinearLayout glybovin1 = dialog.findViewById(R.id.glybovin);

        ImageView close1 = dialog.findViewById(R.id.daonil_close);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();

        glybovin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.activity_glybovin);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView close1 = dialog.findViewById(R.id.daonil_close);

                close1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();

                    }
                });
                dialog.show();
            }
        });

        gliconil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.activity_gliconil);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                ImageView close1 = dialog.findViewById(R.id.daonil_close);

                close1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();

                    }
                });
                dialog.show();
            }
        });
    }

    public void openDaonilDialog()
    {
        dialog.setContentView(R.layout.activity_daonil);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.daonil_close);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();
    }

    public void openDialog(){

        dialog.setContentView(R.layout.activity_glimestar);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView close1 = dialog.findViewById(R.id.myclose);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });
        dialog.show();



        //glimestar gl = new glimestar();
        //gl.show(getSupportFragmentManager(),"Glimestar M2");
    }
}
