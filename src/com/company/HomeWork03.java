package com.company;
import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date birthday :");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        year = (year - 1900)%12 +1;

        if (month == 12 && day >= 22 && day <= 31 || month == 1 && day <= 19 && day > 0){
        System.out.println("Your Zodiac Sign is Capricorn.");}
        else if (month == 1 && day >= 20 && day <= 31||month == 2 && day <= 17 && day > 0){
            System.out.println("Your Zodiac Sign is Aquarius.");}

        else if (month == 2 && day >= 18 && day <= 29 || month == 3 && day <= 19 && day > 0){
            System.out.println("Your Zodiac Sign is Pisces.");}

        else if (month == 3 && day >= 20 && day <= 31 || month == 4 && day <= 19 && day > 0){
            System.out.println("Your Zodiac Sign is Aries.");}

        else if (month == 4 && day >= 20 && day <= 30 || month == 5 && day <= 20 && day > 0){
        System.out.println("Your Zodiac Sign is Taurus.");}

        else if (month == 5 && day >= 21 && day <= 31 || month == 6 && day <= 20 && day > 0){
            System.out.println("Your Zodiac Sign is Gemini.");}

        else if (month == 6 && day >= 21 && day <= 30 || month == 7 && day <= 22 && day > 0){
            System.out.println("Your Zodiac Sign is Cancer.");}

        else if (month == 7 && day >= 23 && day <= 31 || month == 8 && day <= 22 && day > 0){
            System.out.println("Your Zodiac Sign is Leo.");}

        else if (month == 8 && day >= 23 && day <= 31 || month == 9 && day <= 22 && day > 0){
        System.out.println("Your Zodiac Sign is Virgo.");}

        else if (month == 9 && day >= 23 && day <= 30 || month == 10 && day <= 22 && day > 0){
            System.out.println("Your Zodiac Sign is Libra.");}

        else if (month == 10 && day >= 23 && day <= 31  || month == 11 && day <= 21 && day > 0){
            System.out.println("Your Zodiac Sign is Scorpio.");}

        else if (month == 11 && day >= 22 && day <= 30 || month == 12 && day <= 21 && day > 0){
            System.out.println("Your Zodiac Sign is Sagittarius.");}

        switch (year){
            case 1 -> System.out.println("Year: Rat");
            case 2 -> System.out.println("Year: bulls");
            case 3 -> System.out.println("Year: Tiger");
            case 4 -> System.out.println("Year: Rabbit");
            case 5 -> System.out.println("Year: Dragon");
            case 6 -> System.out.println("Year: Snake");
            case 7 -> System.out.println("Year: Horse");
            case 8 -> System.out.println("Year: Goat");
            case 9 -> System.out.println("Year: Monkey");
            case 10 -> System.out.println("Year: Rooster");
            case 11 -> System.out.println("Year: Dog");
            case 12 -> System.out.println("Year: Pig");

        }

    }
}
