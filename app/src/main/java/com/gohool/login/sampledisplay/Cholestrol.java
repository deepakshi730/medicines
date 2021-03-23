package com.gohool.login.sampledisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Cholestrol extends AppCompatActivity {

    LinearLayout ator;
    Button ator_cheap;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholestrol);

        ator= (LinearLayout) findViewById(R.id.ator);
        ator_cheap = (Button) findViewById(R.id.ator_cheap);
        dialog = new Dialog(this);

        ator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtorDialog();
            }
        });
        ator_cheap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtorCheap();
            }
        });

    }

    public void openAtorCheap()
    {
        dialog.setContentView(R.layout.activity_ator_cheap);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        LinearLayout myatchol = dialog.findViewById(R.id.atchol);
        ImageView close1 = dialog.findViewById(R.id.ator_close);

        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();

            }
        });

        dialog.show();

        myatchol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.activity_atchol);
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
        });

    }

    public void openAtorDialog(){
        dialog.setContentView(R.layout.activity_ator);
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
