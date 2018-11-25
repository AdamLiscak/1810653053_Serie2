import javax.swing.*;
import java.util.Random;
@SuppressWarnings("Duplicates")
    public class Aufgabe5 {
        public static void main(String[] args) {
            int min = 1;
            int max = 10;
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

            int i=-1;
             do   {
                while (true) {
                    String benutzerstring = JOptionPane.showInputDialog("bitte geben sie eine Zahl zwischen " + min + " und " + max + " ein");

                    int benutzerzahl = Integer.parseInt(benutzerstring);

                    if (benutzerzahl > max || benutzerzahl < min) {
                        System.out.println("BITTE EINE ZAHL ZWISCHEN 1 und 10 !!!!!!!!!");
                    }
                    else
                        {

                            i++;

                        System.out.println(benutzerzahl);

                        if (zufallszahl == benutzerzahl) {
                            System.out.println("Touché, die zahlen stimmen überein\n\n________GG________");
                            System.exit(0);
                        } else {
                            System.out.println("LOOOOL Die zahlen stimmen nicht überein ");
                        }

                        if (benutzerzahl - zufallszahl > 2 || benutzerzahl - zufallszahl < -2) {
                            System.out.println("der Betrag der Zahlendifferenz überschreitet 2 ");
                        } else {
                            System.out.println("Der Betrag der Differenz der Zahlen ist kleiner oder gleich 2");
                        }

                        if ((i == 2) && benutzerzahl != zufallszahl) {
                            System.out.println("\n\n____________GAME OVER____________"+"\nDie Gesuchte Zahl war "+ zufallszahl);
                        }
                            if (i == 0)
                            {
                                System.out.println("sie haben noch zwei versuche");
                            }
                            if (i==1)
                            {
                                System.out.println("noch ein Versuch");
                            }
                        break;
                    }


                }
            } while (i < 2);


        }
    }

// while: Zuerst wird die bedingung der Schleife auf richtigkeit überprüft
// do while: Die bedingung wird erst danach überprüft
// for schleife: Die for schleife ist nicht so flexibel wie eine while schleife und richtet sich nach dem Abzählen einer Zahl