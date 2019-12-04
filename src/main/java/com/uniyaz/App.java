package com.uniyaz;

import java.util.Scanner;

public class App {

    static Scanner klavyedenAlinanDeger = new Scanner(System.in);

    public static void main(String[] args) {
        MenuTasarimi.hosgeldinizYazdir();
        boolean donguDevamEdiyor = true;
        do {
            MenuTasarimi.menuYazdir();
            System.out.print("Seçiminiz: ");
            int secim = klavyedenAlinanDeger.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Girilen cümle tersten yazdırılacak...");
                    String metin;
                    metin = klavyedenAlinanDeger.nextLine();
                    Islemler.terstenYaz(metin);
                    MenuTasarimi.ayracYazdir();
                    break;
                case 2:
                    System.out.println("Yıldız Oluşturulacak...");
                    Islemler.yildizOlusturma();
                    MenuTasarimi.ayracYazdir();
                    break;
                case 3:
                    System.out.println("Girilen Metinden Parça Alınacak...");
                    Islemler.metindenParcaAlma();
                    MenuTasarimi.ayracYazdir();
                    break;
                case 4:
                    System.out.println("Tek Sayılar Yazdırılacak...");
                    Islemler.tekSayilariYazdirma();
                    MenuTasarimi.ayracYazdir();
                    break;
                case 5:
                    System.out.println("Çift Sayılar Yazdırılacak...");
                    Islemler.ciftSayilariYazdirma();
                    MenuTasarimi.ayracYazdir();
                    break;
                case 6:
                    System.out.println("Çıkış yapıldı.");
                    donguDevamEdiyor = false;
                    break;
                default:
                    System.out.println("Belirlenen rakamlarda giriş yapınız.");
                    break;
            }
        } while (donguDevamEdiyor);
    }
}
