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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tx1, tx2;
    CheckBox chk;
    RadioGroup rg1;
    RadioButton rb1, rb2, rb3;
    Button btn;
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
        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk.isChecked() == true){
                    tx2.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }
                else {
                    tx2.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
                    btn.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rg1.getCheckedRadioButtonId()){
                    case R.id.dog:
                        img.setImageResource(R.drawable.dog);
                        break;
                    case R.id.cat:
                        img.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rabbit:
                        img.setImageResource(R.drawable.ra);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}