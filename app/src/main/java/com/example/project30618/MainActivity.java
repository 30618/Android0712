package com.example.project30618;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tx1, tx2;
    Switch chk;
    RadioGroup rg1;
    RadioButton rb1, rb2, rb3;
    Button btn1, btn2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        chk = findViewById(R.id.chk);
        rg1 = findViewById(R.id.rg1);
        rb1 = findViewById(R.id.dog);
        rb2 = findViewById(R.id.cat);
        rb3 = findViewById(R.id.rabbit);
        btn1 = findViewById(R.id.btnend);
        btn2 = findViewById(R.id.btnre);
        img = findViewById(R.id.img);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk.isChecked() == true) {
                    tx2.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                } else {
                    tx2.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dog:
                img.setImageResource(R.drawable.oreo);
                break;
            case R.id.cat:
                img.setImageResource(R.drawable.pie);
                break;
            case R.id.rabbit:
                img.setImageResource(R.drawable.q10);
                break;
            case R.id.btnend:
                finish();
            case R.id.btnre:
                rg1.clearCheck();
                img.setImageResource(0);
                chk.setChecked(false);
        }
    }
}