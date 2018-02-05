package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite polindromą : ");
        Scanner sc = new Scanner(System.in);
        String poli = sc.nextLine();
        String polir = poli;
        String poli2 = poli.replaceAll("\\s","");
        String polir2 = polir.replaceAll("\\s","");

        int dyd = poli2.length()/2;
        int sutap = 0;
        boolean runing = true;
        for (int i = 0; i < dyd; i++) {
            for (int b = dyd;b > 0;b--){
                if(poli2.charAt(i) == polir2.charAt(b)){
                    sutap++;
                }
            }
        } runing = false;
        if( runing == false){
        if(sutap == dyd){
            System.out.println("Įvesta polindromas");
            System.out.println(poli);
            System.out.println(polir);
        }else {
            System.out.println("Įvesta ne polindromas");
            System.out.println(poli);
            System.out.println(polir);
        }
    }
}}
