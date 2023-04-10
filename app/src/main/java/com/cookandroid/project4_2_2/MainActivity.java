package com.cookandroid.project4_2_2;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch chkSwitch;
    TextView text2;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnEnd;

    Button btnReset;
    ImageView imgPet;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkSwitch = findViewById(R.id.ChkSwitch);
        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        rdoDog = findViewById(R.id.RdoDog);
        rdoCat = findViewById(R.id.RdoCat);
        rdoRabbit = findViewById(R.id.RdoRabbit);
        btnEnd = findViewById(R.id.BtnEnd);
        btnReset = findViewById(R.id.BtnReset);
        imgPet = findViewById(R.id.ImgPet);

        rGroup1.setVisibility(View.INVISIBLE);
        rdoDog.setVisibility(View.INVISIBLE);
        rdoCat.setVisibility(View.INVISIBLE);
        rdoRabbit.setVisibility(View.INVISIBLE);
        btnEnd.setVisibility(View.INVISIBLE);
        btnReset.setVisibility(View.INVISIBLE);
        imgPet.setVisibility(View.INVISIBLE);

        chkSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkSwitch.isChecked()) {
                    rGroup1.setVisibility(View.VISIBLE);
                    rdoDog.setVisibility(View.VISIBLE);
                    rdoCat.setVisibility(View.VISIBLE);
                    rdoRabbit.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                } else {
                    rGroup1.setVisibility(View.INVISIBLE);
                    rdoDog.setVisibility(View.INVISIBLE);
                    rdoCat.setVisibility(View.INVISIBLE);
                    rdoRabbit.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });


            rdoDog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imgPet.setImageResource(R.drawable.nougat);
                }
            });

            rdoCat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imgPet.setImageResource(R.drawable.oreo);
                }
            });

            rdoRabbit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imgPet.setImageResource(R.drawable.pie);
                }
            });

            btnEnd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chkSwitch.setChecked(false);
                chkSwitch.setEnabled(false);


                rGroup1.clearCheck();


                imgPet.setImageResource(0);


                rGroup1.setVisibility(View.INVISIBLE);
                rdoDog.setVisibility(View.INVISIBLE);
                rdoCat.setVisibility(View.INVISIBLE);
                rdoRabbit.setVisibility(View.INVISIBLE);
                btnEnd.setVisibility(View.INVISIBLE);
                btnReset.setVisibility(View.INVISIBLE);
                imgPet.setVisibility(View.INVISIBLE);


                chkSwitch.setEnabled(true);
            }
        });

    }
}