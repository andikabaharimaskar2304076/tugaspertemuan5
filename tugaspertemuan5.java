/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro 5
 */
public class tugaspertemuan5 {

    static void checkRibuan(){
        Scanner Input = new Scanner(System.in);
        int masukanAngka1 = 0;
        System.out.println("Masukan 3 angkat untuk di check: ");

        for(int i = 1; i <= 3; i++)
        {
            System.out.println("Masukan angka ke-" + i);
            masukanAngka1 = Input.nextInt();
            masukanAngka1 = masukanAngka1 / 1000;
            if((masukanAngka1 == 0) || (masukanAngka1 >= 10))
            {
                System.out.println("Angka ke-" + i + " bukan ribuan");
            }else
            {
                System.out.println("Angka ke-" + i + " ribuan");
            }
        }
    }

    static void checkPrimaKomposit(int batasAwal, int batasAkhir){
        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah ");
        for(int i = batasAwal; i <= batasAkhir; i++)
        {
            boolean prima = true;
            if(i == 1)
            {
                continue;
            }
            int div = 2;
            while(div < i)
            {
                if(i % div == 0)
                {
                    prima = false;
                    break;
                }
                div++;
            }
            if(prima)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah ");
        for(int i = batasAwal; i <= batasAkhir; i++)
        {
            boolean prima = true;
            if(i == 1)
            {
                continue;
            }
            int div = 2;
            while(div < i)
            {
                if(i % div == 0)
                {
                    prima = false;
                    break;
                }
                div++;
            }
            if(!prima)
            {
                System.out.print(i + " ");
            }
        }
    }
    
    static void segitigaSikusiku(int N){
        if((N < 1) || N > 1000)
        {
            System.out.println("Inputan tidak berada di range nilai");
        }else
        {
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Soal 1");
        checkRibuan();
        
        System.out.println("Soal 2");
        int batasAwal, batasAkhir;
        System.out.print("Masukan batas awal : ");
        batasAwal = Input.nextInt();
        System.out.print("Masukan batas akhir : ");
        batasAkhir = Input.nextInt();
        checkPrimaKomposit(batasAwal, batasAkhir);
        System.out.println("");

        System.out.println("Soal 3");
        System.out.print("Masukan Bilangan N: ");
        int N = Input.nextInt();
        segitigaSikusiku(N);
    }
}
