package com.uniyaz;

import java.util.Scanner;

public class Islemler {
    static Scanner klavyedenGirilenDeger = new Scanner(System.in);

    public static void terstenYaz(String substring) {
        String metin = klavyedenGirilenDeger.nextLine();
        String cevrilen = cevir(metin);
        System.out.println("Çevrilen Yazı: " + cevrilen);
    }

    public static String cevir(String yazi) {
        if (yazi.isEmpty())
            return yazi;
        return cevir(yazi.substring(1)) + yazi.charAt(0);
    }

    public static void yildizOlusturma() {
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = klavyedenGirilenDeger.nextInt();
        int sayac = 0;

        for (int i = 0; i < girilenSayi; i++) {
            System.out.print("*");
                    }
        for (int j = 0; j < girilenSayi; j++) {
            System.out.println("*");
            sayac++;
        }
    }

    public static void metindenParcaAlma() {
        String metin;
        System.out.println("Lütfen bir metin giriniz:");
        metin = klavyedenGirilenDeger.nextLine();
        System.out.print("Kaçıncı harften itibaren alınsın: ");
        int ilkSayi = klavyedenGirilenDeger.nextInt();
        System.out.print("Kaçıncı harfe kadar alınsın: ");
        int sonSayi = klavyedenGirilenDeger.nextInt();
        System.out.println(metin.substring(ilkSayi, sonSayi));
    }

    public static void tekSayilariYazdirma() {
        System.out.print("Bir sayı giriniz: ");
        int sayi = klavyedenGirilenDeger.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }

    public static void ciftSayilariYazdirma() {
        System.out.print("Bir sayı giriniz: ");
        int sayi = klavyedenGirilenDeger.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }


}
