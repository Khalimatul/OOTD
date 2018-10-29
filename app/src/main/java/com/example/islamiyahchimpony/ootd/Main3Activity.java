package com.example.islamiyahchimpony.ootd;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisiasi object bertipe BodyPartsFrament
        BodyPartsFragment bodyFragment;
        //inisiasi adapter untuk mengaktifkan fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        //pengecekan agar fragment hanya dibuat sekali saja.
        if(savedInstanceState == null) {
            //membuat object untuk heads  dengan men-setting list gambar yang dipanggil serta index nya.
            //setimageids untu mengisi image pada bodypartsfragment variabel imageids
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setImageIds(ImageAssets.getAtas());
            bodyFragment.setmListIndex(0);
            //transaksi fragment
            fragmentManager.beginTransaction().add(R.id.heads_container, bodyFragment).commit();
//            Toast.makeText(this, "Event Create", Toast.LENGTH_SHORT).show();

            //membuat object untuk bodies  dengan men-setting list gambar yang dipanggil serta index nya.
            bodyFragment = new BodyPartsFragment();
            bodyFragment.setImageIds(ImageAssets.getBawah());
            bodyFragment.setmListIndex(0);
            //transaksi fragment
            fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

        }
    }
}
