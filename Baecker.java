/*
*
* Aufgabe Einkaufen beim Bäcker
* 
* @version 2020-12-18
* @author Gerrit Schrock
*/

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.print.event.PrintEvent;

import java.util.regex.Matcher;

// import java.util.*
// kann man das so machen oder ist das schlechter Stil?
public class Baecker {
  static String Willkommmen() {
    return "Willkommen beim Bäcker";
  }

  static String NormaleBroetchen() {
    return "Schusterjungen";
  }

  static String Koernerbroetchen() {
    return "Weltmeister";
  }

  static String Weißbrot() {
    return "Weißbrot";
  }

  static String Krustenbrot() {
    return "Krusti";
  }

  static String Ln() {
    // Linie
    return "****************";
  }

  static String ZA() {
    // Zeilenabstand
    return "*              *";
  }

  static String Br_Menge() {
    // Zeilenabstand
    return "Wieviele?";
  }

  public static void main(String[] args) {
    System.out.println(Ln() + "\n" + ZA() + "\n*  Willkommen  *" + "\n" + Ln());
    Scanner ScanAuswahl = new Scanner(System.in);
    int NormaleBr_Menge = 0;
    int KörnerBr_Menge = 0;
    int WeißBr_Menge = 0;
    int KrustBr_Menge = 0;
    double NormaleBr_Preis = .2;
    double KörnerBr_Preis = .45;
    double WeißBr_Preis = .8;
    double KrustBr_Preis = 2.5;

    System.out.println(
        "Bitte Geben Sie ein: \n S für unsere \"" + NormaleBroetchen() + "\" \n WM für unsere \"" + Koernerbroetchen()
            + "\" \n WB für unser  \"" + Weißbrot() + "\" \n K für unser leckeres \"" + Krustenbrot() + "\"");
    String Auswahl = ScanAuswahl.nextLine();

    if (Auswahl.equals("WM")) {
      System.out.println("Ausgewählt " + Koernerbroetchen());
      System.out.println(Br_Menge());
      KörnerBr_Menge = ScanAuswahl.nextInt();
      System.out.println(KörnerBr_Menge + " " + Koernerbroetchen() + " erfasst");
    } else if (Auswahl.equals("S")) {
      System.out.println("Ausgewählt " + NormaleBroetchen());
      System.out.println(Br_Menge());
      NormaleBr_Menge = ScanAuswahl.nextInt();
      System.out.println(NormaleBr_Menge + " " + NormaleBroetchen() + " erfasst");
    } else if (Auswahl.equals("WB")) {
      System.out.println("Ausgewählt " + Weißbrot());
      System.out.println(Br_Menge());
      WeißBr_Menge = ScanAuswahl.nextInt();
      System.out.println(WeißBr_Menge + " " + Weißbrot() + " erfasst");
    } else if (Auswahl.equals("K")) {
      System.out.println("Ausgewählt " + Krustenbrot());
      System.out.println(Br_Menge());
      KrustBr_Menge = ScanAuswahl.nextInt();
      System.out.println(KrustBr_Menge + " " + Krustenbrot() + " erfasst");
    } else {
      System.out.println("Nicht verstanden " + Auswahl);
    }
    System.out.println(Ln() + "\n" + ZA() + "\n*   Rechnung   *");
    double Preis = (double) NormaleBr_Menge * NormaleBr_Preis + (double) KörnerBr_Menge * KörnerBr_Preis
        + (double) WeißBr_Menge * WeißBr_Preis + (double) KrustBr_Menge * KrustBr_Preis;
    System.out.println(ZA() + "\n*   " + Preis + " €      *" + "\n" + ZA() + "\n" + Ln());

    /*
     * 
     * 
     * try { System.out.println(
     * "Bitte Geben Sie ein: \n S für unsere \"Schusterjungen\" \n WM für unsere \"Weltmeister\" \n WB für unser  \"Weißbrot\" \n K für unser leckeres \"Krusti\""
     * ); String Auswahl = ScanAuswahl.nextLine(); if (Auswahl.equals("S")) {
     * System.out.println("Ausgewählt " + Auswahl); } else { } } catch
     * (InputMismatchException e) { System.out.println(e); ScanAuswahl.nextLine();
     */
  }
}
