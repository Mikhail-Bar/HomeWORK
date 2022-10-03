package com.company;

public class HomeWork02 {
    public static void main(String[] args) {
        // 1. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        int a = 123;
        int hundreds = a/100;
        int tens = a/10%10;
        int ones = a%10;
        int b = ones*100+tens*10+hundreds;
        System.out.println(b);
        //2. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.
        int num = 123;
        int first = num/100;
        int second = num/10%10;
        int third= num%10;
        int end = second*100+third*10+first;
        System.out.println(end);
        //3. Дано трехзначное число. Вывести число, полученное при переста¬новке цифр сотен и десятков исходного числа (например,123 перейдет в 213).
        int num_1 = 123;
        int first_1 = num_1/100;
        int second_1 = num_1/10%10;
        int third_1= num_1%10;
        int end_1 = second_1*100+first_1*10+third_1;
        System.out.println(end_1);
        //4. Дано трехзначное число. Заменить в нем вторую цифру, если она является четной, на ближайшую большую нечетную цифру.
        int num_2 = 423;
        int first_2 = num_2/100;
        int second_2 = num_2/10%10;
        int third_2= num_2%10;
        int result  = first_2*100+((second_2+1) - (second_2%2))*10+third_2;
        System.out.println(result);
        //5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).
        int num_3 = 423;
        int first_3 = num_3/100;
        int second_3 = num_3/10%10;
        int third_3 = num_3%10;
        int result3  = first_3*100 + second_3*10 + first_3;
        System.out.println(result3);
        //6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
        int num_4 = 423;
        int first_4 = num_4/100;
        int second_4 = num_4/10%10;
        int third_4 = num_4%10;
        boolean result4  = (second_4 % 2 == 0);
        System.out.println(result4);
        //7. Дано трехзначное число. Определить, является ли его число сотен нечетным числом.
        int num_5 = 423;
        int first_5 = num_5/100;
        int second_5 = num_5/10%10;
        int third_5 = num_5%10;
        boolean result5  = (first_5 % 2 == 0);
        System.out.println(result5);
        //8. Определить, является ли введенное трехзначное число палиндромом (одинаково читается справа налево и слева направо).
        int num_6 = 423;
        int first_6 = num_6/100;
        int second_6 = num_6/10%10;
        int third_6 = num_6%10;
        boolean result6  = (first_6 == third_6);
        System.out.println(result6);
        //9. Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
        int num_7 = 4231;
        int result7  = (num_7 / 100 % 10);
        System.out.println(result7);
        //10. Дано трехзначное число. Определить разность между этим числом и числом, записанным из тех же цифр, но в обратном порядке.
        int num_8 = 423;
        int first_8 = num_8/100;
        int second_8 = num_8/10%10;
        int third_8 = num_8%10;
        int revers8  = (third_8*100 + second_8*10 + first_8);
        int result8 = num_8 - revers8;
        System.out.println(result8);
        //11. Дано трехзначное число. Округлить его до десятков.
        int num_9 = 423;
        int result9  = (num_9 / 10) * 10;
        System.out.println(result9);
        //12. Дано трехзначное число. Округлить его до сотен.
        int num_10 = 423;
        int result10  = (num_10 / 100) * 100;
        System.out.println(result10);

        //Две клетки на шахматной доске определены своими координатами (x1,y1) и (x2,y2).
        //1. Может ли конь переместиться с первой на вторую клетку?
        int x1 = 1 , y1 = 1, x2 = 3, y2 = 2;
        boolean horse = (x2-x1 == 2 ) && (y2-y1 == 1) || (y2-y1 == 2 ) && (x2-x1 == 1);
        System.out.println(horse);
        //2. Может ли король переместиться с первой на вторую клетку?
        int x3 = 1 , y3 = 1, x4 = 3, y4 = 2;
        boolean  king = (x2-x1 <= 1 ) && (y2-y1 <= 1);
        System.out.println(king);

    }
}
