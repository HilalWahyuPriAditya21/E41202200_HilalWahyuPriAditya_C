/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.wsibd;

/**
 *
 * @author dell
 */
class Profile{

    String fName;

    String lName;

    int stuId;

    boolean stuStatus;



public void set(String fName, String lName, int stuId, boolean stuStatus){

    this.fName = fName;

    this.lName = lName;

    this.stuId = stuId;

    this.stuStatus = stuStatus;

    }



public void show(){

    System.out.println("Student Name : " + fName + " " + lName);

    System.out.println("Student ID   : " + stuId );

    if (stuStatus == true){

        System.out.println("Student Status : Active" );

    }else{

        System.out.println("Student Status : Not Active");

    }

    }

}

public class Person {

    public static void main(String[] args) {

        Profile Lisa = new Profile();

        Lisa.set("Lisa", "Palombo", 123456789, true);

        Lisa.show();

    }

}