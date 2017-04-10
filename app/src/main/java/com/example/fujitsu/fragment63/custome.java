package com.example.fujitsu.fragment63;

/**
 * Created by Fujitsu on 15/02/2017.
 */

public class custome {

    private int imageview;
    private String name;


    public custome() {
            }

        public custome(int phoneno,String name) {
               this.name = name;
                this.imageview = phoneno;
            }

                public String getName() {
                return name;
            }

                public void setName(String name) {
                this.name = name;
            }

                public int getPhoneno() {
                return imageview;
            }

                public void setPhoneno(int phoneno) {
                this.imageview = phoneno;
            }
}
