package io;

import java.util.Scanner;

public class Data {

    Scanner scanner;

    public Data(Scanner scanner) {
        this.scanner = scanner;
    }

    public void print(String text){
        System.out.print(text);
    }

    public void print(int number){
        System.out.println(number);
    }

    public int read(){
       return scanner.nextInt();
    }

    public int input(String text){
        print(text);
        return read();
    }
}
