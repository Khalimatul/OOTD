package com.example.islamiyahchimpony.ootd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Islamiyah Chimpony on 9/26/2018.
 */

public class ImageAssets {
    //Variabel ini adalah variabel pengelompokan untuk head kedalam array dan mengambil gambar head dari resource drawable
    private static List<Integer> atas = new ArrayList<Integer>(){{
        add(R.drawable.atas1);
        add(R.drawable.atas2);
        add(R.drawable.atas3);
        add(R.drawable.atas4);
        add(R.drawable.atas5);
        add(R.drawable.atas6);
        add(R.drawable.atas7);
    }};

    //Variabel ini adalah variabel pengelompokan untuk body kedalam array
    private static List<Integer> bawah = new ArrayList<Integer>() {{
        add(R.drawable.bawah1);
        add(R.drawable.bawah2);
        add(R.drawable.bawah3);
        add(R.drawable.bawah4);
        add(R.drawable.bawah5);
    }};

    //Variabel ini adalah variabel pengelompokan untuk legs kedalam array
//    private static List<Integer> legs = new ArrayList<Integer>() {{
//        add(R.drawable.legs1);
//        add(R.drawable.legs2);
//        add(R.drawable.legs3);
//        add(R.drawable.legs4);
//        add(R.drawable.legs5);
//        add(R.drawable.legs6);
//        add(R.drawable.legs7);
//        add(R.drawable.legs8);
//        add(R.drawable.legs9);
//        add(R.drawable.legs10);
//        add(R.drawable.legs11);
//        add(R.drawable.legs12);
//    }};

    //ini adalah method yg digunakana untuk memanggil/mengambil variable heads
    public static List<Integer> getAtas() {

        return atas;
    }
    //ini adalah method yg digunakana untuk memanggil/mengambil variable bodies
    public static List<Integer> getBawah() {

        return bawah;
    }
}
