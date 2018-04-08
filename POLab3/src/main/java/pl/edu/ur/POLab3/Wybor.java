package pl.edu.ur.POLab3;

import java.util.*;

public class Wybor {

    public void wybierz() {
        Scanner scan = new Scanner(System.in);
        int a;
        do {
            zadanie();
            a=scan.nextInt();
            switch (a) {
                case 0:
                    System.out.println("Zamknięcie programu");
                    break;
                case 14:
                    zad14();
                    break;
                case 17:
                    zad17();
                    break;
                case 22:
                    zad22();
                    break;
                case 33:
                    zad33();
                    break;
                case 34:
                    zad34();
                    break;
                default:
                    System.out.println("Błędny wybór\n");
                    break;
            }
        }while (a != 0);
    }

    public void zadanie(){
        System.out.println("\nWybierz zadanie\n[14] - Zad 1.4\t[17] - Zad 1.7\t[22] - Zad 2.2\n[33] - Zad 3.3\t[34] - Zad 3.4\n[0] - Zakończ program");
    }

    public void zad14(){
        int x;
        x=24;
        System.out.println("liczbę dziesientną "+x+", binarnie: "+Integer.toBinaryString(x)+"\nprzesuwamy w prawo o 3 za pomocą \">>\", binarnie otrzymujemy: "+Integer.toBinaryString(x>>3)+"\nteraz wartość dziesiętna liczby wynosi "+(x>>3)+"\n");
        x=1;
        System.out.println("liczbę dziesientną "+x+", binarnie: "+Integer.toBinaryString(x)+"\nprzesuwamy w lewo o 3 za pomocą \"<<\", binarnie otrzymujemy: "+Integer.toBinaryString(x<<3)+"\nteraz wartość dziesiętna liczby wynosi "+(x<<3)+"\n");
        x=-4;
        System.out.println("liczbę dziesientną "+x+", binarnie: "+Integer.toBinaryString(x)+"\nprzesuwamy w prawo o 2 za pomocą \">>>\", binarnie otrzymujemy: "+Integer.toBinaryString(x>>>2)+"\nteraz wartość dziesiętna liczby wynosi "+(x>>>2)+"\n");
        x=4;
        System.out.println("liczbę dziesientną "+x+", binarnie: "+Integer.toBinaryString(x)+"\nprzesuwamy w prawo o 2 za pomocą \">>>\", binarnie otrzymujemy: "+Integer.toBinaryString(x>>>2)+"\nteraz wartość dziesiętna liczby wynosi "+(x>>>2)+"\n");
    }

    public void zad17(){
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("Podaj liczbę nr. 1");
        a=scan.nextInt();
        System.out.println("Podaj liczbę nr. 2");
        b=scan.nextInt();

        System.out.println("\nNOT");
        if (a!=2) System.out.println("Pierwsza liczba ≠ 2");
        else System.out.println("Pierwsza liczba = 2");

        System.out.println("\nXOR");
        if ((a==2)^(b==3)) System.out.println("Pierwsza liczba = 2\tlub\tdruga liczba = 3");
        else System.out.println("Pierwsza liczba = 2 oraz druga liczba = 3\tlub\t\tpierwsza liczba ≠ 2 i druga liczba jest ≠ 3");
    }

    public void zad22(){
        String text0 = new String("Jakiś TAM szOPIe daGzt");
        String text1 = new String("Jakiś tam szopie daGzt");

        System.out.println("01."+text0.toCharArray());                     //string zamieniany jest na tablice znakow
        System.out.println("02."+text0.getBytes());                        //
        System.out.println("03."+text0.equals(text1));                    //porownanie 2 stringow
        System.out.println("04."+text0.equalsIgnoreCase(text1));          //porownanie 2 stringow bez wzgledu na wielkosc liter
        System.out.println("05."+text0.compareTo(text1));                 //
        System.out.println("06."+text0.compareToIgnoreCase(text1));       //
        System.out.println("07."+text0.indexOf('m'));                      //pierwsze wystapienie podanego znaku
        System.out.println("08."+text0.lastIndexOf('a'));              //ostatnie wystapienie danego znaku
        System.out.println("09."+text0.substring(6));                      //podzial stringu na substring zaczynajac od podanego indexu
        System.out.println("10."+text0.substring(0,6));                    //podzial stringu na substring od podanego do podanego indexu
        System.out.println("11."+text0.replace('a','u'));  //zamiana litery w stringu
        System.out.println("12."+text0.trim());                           //przyciecie stringu o nadmiarowe poprzedzajace i nadmiarowe whitespace'y
        System.out.println("13."+text0.toLowerCase());                     //zamiana liter na male
        System.out.println("14."+text0.toUpperCase());                     //zamiana liter na wielkie
        String[] podzielText = text0.split("a");              //podzial stringu na czesci: 1-wsza czesc przed podanym argumentem, 2-ga czesc po argumencie
        String cz1 = podzielText[0];
        String cz2 = podzielText[1];
        String cz3 = podzielText[2];
        System.out.println("15."+cz1);
        System.out.println("16."+cz2);
        System.out.println("17."+cz3);
    }

    public void zad33(){
        Scanner scan = new Scanner(System.in);
        int a,x,y,z;
        do{
            System.out.println("Wybierz metodę wykonania\n[1] - Rekurencja\t[2] - Iteracja\n[0] - Powrót do menu głównego");
            a=scan.nextInt();
            switch(a){
                case 0:
                    break;
                case 1:
                    System.out.println("Podaj liczbe do potegowania");
                    x=scan.nextInt();
                    System.out.println("Podaj wykladnik potegi");
                    y=scan.nextInt();
                    System.out.println("Wynik potęgowania = "+rekurencja(x,y));
                    break;
                case 2:
                    System.out.println("Podaj liczbe do potegowania");
                    x=scan.nextInt();
                    System.out.println("Podaj wykladnik potegi");
                    y=scan.nextInt();
                    z=1;
                    for (int i=0;i<y;i++){
                        z*=x;
                    }
                    System.out.println("Wynik potęgowania = "+z);
                    break;
                default:
                    System.out.println("Błędny wybór");
                    break;
            }

        }while(a!=0);
    }

    public void zad34(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ktory wyraz ciagu Fibonacciego obliczyc?");
        int a=scan.nextInt();
        System.out.println("Wartość "+a+" wyrazu = "+fibonacci(a));
    }

    public int rekurencja(int a,int b){
        if (b==0) return 1;
        else return a=a*rekurencja(a,--b);
    }

    public int fibonacci(int i){
        if (i>46) {System.out.println(i+" Wyraz jest poza zakresem zadeklarowanego typu");return 0;}
        else if ((i==1)||(i==2)) { return 1;}
        else { return fibonacci(i-1)+fibonacci(i-2);}
    }

}
