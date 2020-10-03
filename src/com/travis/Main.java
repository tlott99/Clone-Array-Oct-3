package com.travis;

public class Main {

    public static void main(String[] args) {
        int p = 0;
	String[] utah = {"Church", "Temples", "Apostle", "General Conference", "Bednar"};
       for(int i = 0; i < utah.length; i ++){
           System.out.println(utah[i]);
           utah[i] = utah[i] + p;
           p++;
       }
        for (String saltLake:utah) {
            System.out.println(saltLake);
        }
    }
}
