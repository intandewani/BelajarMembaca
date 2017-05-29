package com.example.itsme.belajarmembaca;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton belajar, keluar;
    MediaPlayer mp;

    public void buttonExit() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are You Sure To Close This Activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.backsound);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

        /*Pindah ke activity Belajar */
        belajar = (ImageButton)findViewById(R.id.ib_play);
        belajar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(MainActivity.this,ActivityBelajar.class);
                startActivity(intent);
            }
        });

        /*Pindah ke Activity Mengenal Huruf */
        belajar = (ImageButton)findViewById(R.id.ib_play2);
        belajar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(MainActivity.this,MengenalHuruf.class);
                startActivity(intent);
            }
        });

        /*
        keluar = (ImageButton)findViewById(R.id.Ib_Exit);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                new AlertDialog.Builder()
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are You Sure To Close This Activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
            }
        });*/
    }
}