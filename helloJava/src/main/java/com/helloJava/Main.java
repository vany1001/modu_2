package com.helloJava;
import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //getMonth();
        tinhchisocannang();

    }
    public static void getMonth() {
        int month;
        String daysInMonth;
        do {
            System.out.println("Nhập tháng: ");
            month = scanner.nextInt();
            switch (month) {
                case 2:
                    System.out.println("Thang co 29 ngay");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang co 31 ngay");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang co 30 ngay");
                    break;
                default:
                    System.out.println("Tháng không hợp lệ");
            }
        } while (month < 1 || month > 12);

    }

    public static void tinhchisocannang() {
        System.out.println("Nhap can nang: ");
        float cannang = scanner.nextFloat();
        System.out.println("Nhap chieu cao: ");
        float chieucao = scanner.nextFloat();
        float bmi = cannang / chieucao*chieucao;
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi<25) {
            System.out.println("normal");
        } else if (25 <= bmi && bmi <30) {
            System.out.println("Overweight");
        } else if(bmi >= 30) {
            System.out.println("Obese");
        }
    }


}