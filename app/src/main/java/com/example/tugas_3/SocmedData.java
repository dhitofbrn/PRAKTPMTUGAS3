package com.example.tugas_3;

import java.util.ArrayList;

public class SocmedData {
    private static String[] nama = new String[] {"Instagram","Twitter","Facebook","Line"};
    private static int[] thumbnail = new int[] {R.drawable.ig, R.drawable.tw, R.drawable.fb, R.drawable.line};
    public static ArrayList<SocmedModel> getListData(){
        SocmedModel socmedModel = null;
        ArrayList<SocmedModel> list = new ArrayList<>();
        for (int i=0; i<nama.length; i++){
            socmedModel = new SocmedModel();
            socmedModel.setNamaSocmed(nama[i]);
            socmedModel.setLogoSocmed(thumbnail[i]);
            list.add(socmedModel);

        }
        return list;
    }
}
