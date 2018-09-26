package com.example.cerx.starbuck;

public class Drinks {
    private String name;
    private String desc;
    private int imageID;

    public static final Drinks[] drinks={
            new Drinks("Lattte","A shot of foamy espresso with steamed milk", R.drawable.latte),
            new Drinks("Cappuccino","A double espresso with steamed milk foam",R.drawable.cappuccino),
            new Drinks("Filter","Regular filter coffee",R.drawable.filter)
    };

        private Drinks(String name, String des, int imageID){
            this.name=name;
            this.desc=desc;
            this.imageID=imageID;
        }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
