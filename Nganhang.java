/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nganhang;

import java.text.NumberFormat;
import java.util.Scanner;


public class Nganhang {
    private long sotk;
    private String tentk;
    private double sotientk;
    Scanner sc = new Scanner(System.in);
    public Nganhang() {
        
    }
        public Nganhang(long sotk,String tentk,double sotientk){
            this.sotk = sotk;
            this.tentk = tentk;
            this.sotientk = sotientk;
        }
        public long getsotk() {
            return this.sotk;
        }
        public void setsotk(long sotk) {
            this.sotk = sotk;
        }
        public String gettentk() {
            return this.tentk;
        }
        public void settentk(String tentk){
            this.tentk = tentk;
        }
        public double getsotientk(){
            return this.sotientk;
        }
        public void setsotientk(double sotientk){
            this.sotientk = sotientk;
        }
        public String toString() {
            NumberFormat currencyVND = NumberFormat.getCurrencyInstance();
            String str1 = currencyVND.format (sotientk);
            return sotk + "-" + tentk + "-" + str1;
        }
        public double naptien() {
            double nap;
        
            System.out.print("nhap vao so tien can nap : ");
            nap = sc.nextDouble();
            if(nap >= 0) {
                sotientk = nap + sotientk;
                NumberFormat currencyVND = NumberFormat.getCurrencyInstance();
                String str1 = currencyVND.format(nap);
                System.out.println("ban vua nap" + str1 + "vao tk");
            }
            else {
                System.out.println("so tien ko hop le");
            }
            return nap;
        }
        public double ruttien(){
            double rut;
            double phi = 3;
            System.out.print("nhap so tien can rut: ");
            rut = sc.nextDouble();
            if(rut <= (sotientk - phi)) {
                sotientk = sotientk - (rut+phi);
                NumberFormat currencyVND = NumberFormat.getCurrencyInstance();
                String str1 = currencyVND.format(rut);
                System.out.println("ban vua rut" + str1 + "trong tk,phi la 3k");
                 }
            else{
                System.out.println("so tien rut ko hop le");
                return ruttien();
            }
            return rut;
        }
        public double daohan() {
            double laisuat = 0.035;
            sotientk = sotientk + sotientk *laisuat;
            NumberFormat currencyVND = NumberFormat.getCurrencyInstance();
                String str1 = currencyVND.format(sotientk);
                System.out.println("ban dc " + str1 + "tu dao han 1 thang");
                return sotientk;
        }
        void intk() {
            NumberFormat currencyVND = NumberFormat.getCurrencyInstance();
                String str1 = currencyVND.format(sotientk);
                System.out.println("%-10d %-20s %-20s \n",long sotk,String tentk,str1);
        }
}

    

    

      
    
   
        
    
    

