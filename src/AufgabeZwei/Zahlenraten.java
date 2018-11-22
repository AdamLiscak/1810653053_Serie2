package AufgabeZwei;

import java.util.Random;

public class Zahlenraten
{
    public static void main ( String [] args)
    {
        int min=1;
        int max=10;
        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;
        // es gibt eine Zufallszahl Zw. 1 und 10
        System.out.println(zufallszahl);
       if (zufallszahl%2== 0)
       {
           System.out.println("diese Zahl ist gerade");
       }
       else
       {
           System.out.println("diese Zahl ist ungerade");
       }
    }

}
