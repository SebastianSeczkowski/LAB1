package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account();
      acc.setName("Piotr Gołabek");
      //  acc.name = "Piotr Gołąbek";
        System.out.println(acc.getName());

    }
}



