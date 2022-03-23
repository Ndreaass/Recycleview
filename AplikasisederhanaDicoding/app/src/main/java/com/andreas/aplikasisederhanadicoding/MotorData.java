package com.andreas.aplikasisederhanadicoding;

import java.util.ArrayList;

public class MotorData {
    private static String[] motorName ={
            "vario",
            "karisma",
            "legenda",
            "beat",
            "tiger",
            "cbr",
            "ninja",
            "harley",
            "beneli",
            "crf"
    };
    private static String[] motorMerk={
            "vario merupakan motor Honda",
            "karisma merupakan motor Honda",
            "legenda merupakan motor Honda",
            "beat merupakan motor Honda",
            "tiger merupakan motor Honda",
            "cbr merupakan motor Honda",
            "ninja merupakan motor Kawasaki",
            "harley merupakan motor Harley",
            "beneli merupakan motor Beneli",
            "crf merupakan motor Honda"
    };

    private static String[] motorCc={
            "vario 150Cc",
            "karisma 125Cc",
            "legenda 100Cc",
            "beat 110Cc",
            "tiger 200Cc",
            "cbr 150Cc",
            "ninja 250Cc",
            "harley 1868Cc",
            "beneli 250Cc",
            "crf 150Cc"

    };

    private static int[] motorImage={
            R.drawable.vario,
            R.drawable.karisma,
            R.drawable.legenda,
            R.drawable.beat,
            R.drawable.tiger,
            R.drawable.cbr,
            R.drawable.ninja,
            R.drawable.harley,
            R.drawable.beneli,
            R.drawable.crf
    };
    static ArrayList<MotorClass> getListData(){
        ArrayList<MotorClass> list = new ArrayList<>();
        for (int position = 0; position<motorName.length; position++){
            MotorClass motorClass = new MotorClass();
            motorClass.setNama(motorName[position]);
            motorClass.setMerk(motorMerk[position]);
            motorClass.setCc(motorCc[position]);
            motorClass.setPhoto(motorImage[position]);
            list.add(motorClass);
        }
        return list;
    }
}
