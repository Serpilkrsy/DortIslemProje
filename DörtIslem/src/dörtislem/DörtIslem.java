/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dörtislem;

import java.util.Scanner;

/**
 *
 * @author serpil
 */
public class DörtIslem {
    public static void main(String[] args) {
        while(true){
           Scanner s=new Scanner(System.in);
       
        System.out.println("ISLEMLER:");
        System.out.println("1-TOPLAMA");
        System.out.println("2-CIKARMA");
        System.out.println("3-CARPMA");
        System.out.println("4-BOLME");
        System.out.println("Lütfen yapmak istediğiniz işlemi seciniz:");
        int işlem=s.nextInt();
        
        if(işlem==1){
            System.out.println("Lütfen üzerinde işlem yapmak istediğiniz sayıları giriniz:");
            int a= s.nextInt();
            int b=s.nextInt();
            System.out.println("İki sayinin toplamı:" + (a+b));
        }
        if(işlem==2){
            System.out.println("Lütfen üzerinde işlem yapmak istediğiniz sayıları giriniz:");
            int a= s.nextInt();
            int b=s.nextInt();
            System.out.println("iki sayinin farkı" + (a-b));
        }
        if(işlem==3){
            System.out.println("Lütfen üzerinde işlem yapmak istediğiniz sayıları giriniz:");
            int a= s.nextInt();
            int b=s.nextInt();
            System.out.println("İki sayinin carpimi:" + (a*b));
        }
        if(işlem==4){
            System.out.println("Lütfen üzerinde işlem yapmak istediğiniz sayıları giriniz:");
            int a= s.nextInt();
            int b=s.nextInt();
            System.out.println("İki sayinin bolumu:" + (a/b));
        }
       }
    }
    
}
