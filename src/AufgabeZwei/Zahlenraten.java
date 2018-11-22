package AufgabeZwei;

import javax.swing.*;
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
       /* if (zufallszahl%2== 0)
       {
           System.out.println("diese Zahl ist gerade");
       }
       else
       {
           System.out.println("diese Zahl ist ungerade");
       } */

        while(true)
       {
               String benutzerstring = JOptionPane.showInputDialog("bitte geben sie eine Zahl zwischen " +min+" und "+max+" ein");

           int benutzerzahl = Integer.parseInt(benutzerstring);

           if (benutzerzahl>max||benutzerzahl<min)
           {
               continue;
           }

           else
           {
               System.out.println(benutzerzahl);
               if (zufallszahl==benutzerzahl)
               {
                   System.out.println("die zahlen stimmen überein");
               }
               else
               {
                   System.out.println("die zahlen stimmen nicht überein");
               }
               if (benutzerzahl-zufallszahl>2||benutzerzahl-zufallszahl<-2)
               {
                   System.out.println("der Betrag der Zahlendifferenz überschreitet 2 ");
               }
               else
               {
                   System.out.println("Der Betrag der Differenz der Zahlen ist kleiner oder gleich 2");
               }
               break;
           }

       }



    }


}
