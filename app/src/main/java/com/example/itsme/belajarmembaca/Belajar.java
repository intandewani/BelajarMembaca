package com.example.itsme.belajarmembaca;

/**
 * Created by It's Me on 5/26/2017.
 */
import java.util.Random;

public class Belajar {
    private int listhuruf[] = {
            R.drawable.pop_a,
            R.drawable.pop_b,
            R.drawable.pop_c,
            R.drawable.pop_d,
            R.drawable.pop_e,
            R.drawable.pop_f,
            R.drawable.pop_g,
            R.drawable.pop_h,
            R.drawable.pop_i,
            R.drawable.pop_j,
            R.drawable.pop_k,
            R.drawable.pop_l,
            R.drawable.pop_m,
            R.drawable.pop_n,
            R.drawable.pop_o,
            R.drawable.pop_q,
            R.drawable.pop_r,
            R.drawable.pop_s,
            R.drawable.pop_t,
            R.drawable.pop_u,
            R.drawable.pop_v,
            R.drawable.pop_w,
            R.drawable.pop_y,
            R.drawable.pop_z
    };
    private int listhuruf2[] = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
            R.drawable.v,
            R.drawable.w,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z
    };

    public int[] getlist() {
        return listhuruf;
    }

    public int[] getlist2() {
        return listhuruf2;
    }

    public int getrandomhuruf() {
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;

    }
}
