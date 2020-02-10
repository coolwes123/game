package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=0;
        int AP = 10;
        int Str = 3;
        int Int = 3;
        int Dex = 3;
        int End = 3;
        int Lck = 3;
	System.out.println("Welcome to 'Insert_Title'!");
        System.out.println("What is your name?");
            System.out.print("Name: ");
            String Name;
            Scanner sc = new Scanner(System.in);
            Name = sc.nextLine();
        System.out.println("Alright, " + Name + ", let's see what you're made of..." );
        System.out.println("Press the corresponding key to allot a point." );
            while (AP > 0) {
                System.out.println("AP: " + AP);
                System.out.println("1) Str: " + Str);
                System.out.println("2) Int: " + Int);
                System.out.println("3) Dex: " + Dex);
                System.out.println("4) End: " + End);
                System.out.println("5) Lck: " + Lck);
                String temp;
                sc = new Scanner(System.in);
                temp = sc.nextLine();
                if(temp.equals("HAX")){
                    System.out.println("HAXXX!!!!!!!!!!!!!!!!!!!!!!");
                        for(int c=0;c<9;c++)
                        {System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");}
                    Str+=7;
                    Int+=7;
                    Dex+=7;
                    End+=7;
                    Lck+=7;
                }else if(temp.equals("1")){
                    AP--;
                    Str++;
                }else if(temp.equals("2")){
                    AP--;
                    Int++;
                }else if(temp.equals("3")){
                    AP--;
                    Dex++;
                }else if(temp.equals("4")){
                    AP--;
                    End++;
                }else if(temp.equals("5")){
                    AP--;
                    Lck++;
                }else {
                    System.out.println("///ERROR/// unexpected response '"+temp+"' ///ERROR///");

                }

            }
    }
}
