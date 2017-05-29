package com.example.itsme.belajarmembaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MengenalHuruf extends AppCompatActivity {
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengenal_huruf);

        /* Tombol untuk kembali */
        back = (ImageButton)findViewById(R.id.ib_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(MengenalHuruf.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
