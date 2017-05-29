package com.example.itsme.belajarmembaca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ActivityBelajar  extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /* Tombol untuk kembali */
        back = (ImageButton)findViewById(R.id.ib_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(ActivityBelajar.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //TampilGambar = (ImageView)findViewById(R.id.imageView);
        TampilGambar = (ImageView)findViewById(R.id.tampil_huruf);
        show = (ImageButton) findViewById(R.id.Ib_a);
        hide = (ImageButton) findViewById(R.id.Ib_b);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraA = MediaPlayer.create(this, R.raw.a); //Memanggil nama lagu
        final MediaPlayer SuaraB = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer SuaraC = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer SuaraD = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer SuaraE = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer SuaraF = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer SuaraG = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer SuaraH = MediaPlayer.create(this, R.raw.h);
        final MediaPlayer SuaraI = MediaPlayer.create(this, R.raw.i);
        final MediaPlayer SuaraJ = MediaPlayer.create(this, R.raw.j);
        final MediaPlayer SuaraK = MediaPlayer.create(this, R.raw.k);
        final MediaPlayer SuaraL = MediaPlayer.create(this, R.raw.l);
        final MediaPlayer SuaraM = MediaPlayer.create(this, R.raw.m);
        final MediaPlayer SuaraN = MediaPlayer.create(this, R.raw.n);
        final MediaPlayer SuaraO = MediaPlayer.create(this, R.raw.o);
        final MediaPlayer SuaraP = MediaPlayer.create(this, R.raw.p);
        final MediaPlayer SuaraQ = MediaPlayer.create(this, R.raw.q);
        final MediaPlayer SuaraR = MediaPlayer.create(this, R.raw.r);
        final MediaPlayer SuaraS = MediaPlayer.create(this, R.raw.s);
        final MediaPlayer SuaraT = MediaPlayer.create(this, R.raw.t);
        final MediaPlayer SuaraU = MediaPlayer.create(this, R.raw.u);
        final MediaPlayer SuaraV = MediaPlayer.create(this, R.raw.v);
        final MediaPlayer SuaraW = MediaPlayer.create(this, R.raw.w);
        final MediaPlayer SuaraX = MediaPlayer.create(this, R.raw.x);
        final MediaPlayer SuaraY = MediaPlayer.create(this, R.raw.y);
        final MediaPlayer SuaraZ = MediaPlayer.create(this, R.raw.z);


        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.Ib_a); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.Ib_b);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.Ib_c);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.Ib_d);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.Ib_e);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.Ib_f);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.Ib_g);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.Ib_h);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.Ib_i);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.Ib_j);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.Ib_k);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.Ib_l);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.Ib_m);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.Ib_n);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.Ib_o);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.Ib_p);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.Ib_q);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.Ib_r);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.Ib_s);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.Ib_t);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.Ib_u);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.Ib_v);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.Ib_w);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.Ib_x);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.Ib_y);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.Ib_z);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_a);
                TampilGambar.startAnimation(animScale);
                SuaraA.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_b);
                TampilGambar.startAnimation(animScale);
                SuaraB.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_c);
                TampilGambar.startAnimation(animScale);
                SuaraC.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_d);
                TampilGambar.startAnimation(animScale);
                SuaraD.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_e);
                TampilGambar.startAnimation(animScale);
                SuaraE.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_f);
                TampilGambar.startAnimation(animScale);
                SuaraF.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_g);
                TampilGambar.startAnimation(animScale);
                SuaraG.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_h);
                TampilGambar.startAnimation(animScale);
                SuaraH.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_i);
                TampilGambar.startAnimation(animScale);
                SuaraI.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_j);
                TampilGambar.startAnimation(animScale);
                SuaraJ.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_k);
                TampilGambar.startAnimation(animScale);
                SuaraK.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_l);
                TampilGambar.startAnimation(animScale);
                SuaraL.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_m);
                TampilGambar.startAnimation(animScale);
                SuaraM.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_n);
                TampilGambar.startAnimation(animScale);
                SuaraN.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_o);
                TampilGambar.startAnimation(animScale);
                SuaraO.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_p);
                TampilGambar.startAnimation(animScale);
                SuaraP.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_q);
                TampilGambar.startAnimation(animScale);
                SuaraQ.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_r);
                TampilGambar.startAnimation(animScale);
                SuaraR.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_s);
                TampilGambar.startAnimation(animScale);
                SuaraS.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_t);
                TampilGambar.startAnimation(animScale);
                SuaraT.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_u);
                TampilGambar.startAnimation(animScale);
                SuaraU.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.pop_v);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraV.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_w);
                TampilGambar.startAnimation(animScale);
                SuaraW.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_x);
                TampilGambar.startAnimation(animScale);
                SuaraX.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_y);
                TampilGambar.startAnimation(animScale);
                SuaraY.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.pop_z);
                TampilGambar.startAnimation(animScale);
                SuaraZ.start();
            }
        });
    }
}
