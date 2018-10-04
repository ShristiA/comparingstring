package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
    // creating a class sc from the object Scanner)
        System.out.println("How is the weather?");
        String answer = sc.nextLine();
String r = "rain";
String w = "windy";
String s = "snow" ;
String st = "stormy";
        if (answer .equals(r)){
            System.out.println("Take your umbrella!");
        }else if (answer .equals(w)){
            System.out.println("Wear your jacket!");
        }else if (answer .equals(s)) {
            System.out.println("Wear a coat and take a shovel!");
        }else if (answer .equals(st)){
            System.out.println("You should stay inside!");
        }else
            System.out.println("Enjoy your day!");

    }
}
