/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilgenap;

import java.util.Scanner;

public class BilGenap {

    public static void main(String[] args) {
   int BilGenap;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Batas Angka Bilangan Genap = ");
        BilGenap= keyboard.nextInt();

        for(int i=2; i<=BilGenap; i+=2){
            System.out.print(i + " ");
    }
    
}
