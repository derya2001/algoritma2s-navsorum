
/*# Algoritma2sınavsorum
dışardan girilen hastaneye 
yatış ve hemşire sayısına göre 
hemşire sayısının yeterli olup 
olmadığını söylen program */
package benimalgoritma2sorum;

import java.util.Scanner;

class hemsıreyogunlugu { 
    private  String durum;
     private int bolumdekıhemsıreyogunlugu ;
     private int genelhemsıreyogunlugu ;
     
     public int bolumdekıhemsıreyogunlugu(int yatanhasta, int hemsıresayısı){
        int bolumdekıhemsıreyogunlugu = yatanhasta / hemsıresayısı;
        return bolumdekıhemsıreyogunlugu ;
        
        
        public int genelhemsıreyogunlugu (int tumyatanhasta, int tumhemsıresayısı){
       
       int genelhemsıreyogunlugu = tumyatanhasa / tumhemsıresayısı;
       return genelhemsıreyogunlugu ;
        
        
         
     }
           public String durum (int bolumdekıhemsıreyogunlugu, int genelhemsıreyogunlugu ){
               if (genelhemsıreyogunlugu < bolumdekıhemsıreyogunlugu ){
                   durum = "bölüme hemşire alınmalı";
                   
                           
               } else if (genelhemsıreyogunlugu > bolumdekıhemsıreyogunlugu){
                   durum = "normal";
                   
                           
               } else if (genelhemsıreyogunlugu == bolumdekıhemsıreyogunlugu){
                   durum ="gelecek zamanda hemşire alınmalı";
               }
           return durum;
           
     
public class hemsıreyogunlugu
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("tüm yatan hasta sayısını giriniz : ");
        int tumyatanhasta = input.nextInt();
        System.out.print("tüm hemşire sayısını giriniz : ");
        int tumhemsıresayısı = input.nextInt();
        System.out.print("bölümde yatan hasta sayısı giriniz: ");
        int yatanhasa = input.nextInt();
        System.out.print("bölümdeki hemşire sayısını giriniz: ");
        int hemsıresayısı = input.nextInt();
        Corona class hemsıreyogunlugu = new hemsıreyogunlugu();
        class hemsıreyogunlugu.bolumdekıhemsıreyogunlugu(yatanhasta,hemsıresayısı );
        class hemsıreyogunlugu.genelhemsıreyogunlugu (tumyatanhasta,tumhemsıresayısı);
                
