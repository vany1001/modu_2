package com.helloJava;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // getMonth();
        // tinhchisocannang();
        // hienthithoigian();
        // ptbacnhat();
        // kiemtranamnhuan();
        chuyendoitiente();

    }

    public static void getMonth() {
        //Tính số ngày trong tháng
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

//    [Thực hành] Hiển thị thời gian của hệ thống
    public static void hienthithoigian(){
        Date now = new Date();
        System.out.println("Thời gian hiện tại là: " + now);
    }

    public static void ptbacnhat(){

        System.out.println("Nhập a");
        double a = scanner.nextDouble();

        System.out.println("Nhập b");
        double b = scanner.nextDouble();

        System.out.println("Nhập c");
        double c = scanner.nextDouble();

        if(a != 0) {
            double x = (c - b) / a;
            System.out.println("x = " + x);
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }

    public static void kiemtranamnhuan(){
        System.out.println("Nhập năm");
        int year =scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + ": là năm nhuận");
                } else {
                            System.out.println(year + ": là năm không nhuận");
                }
            } else {
                System.out.println(year + ": là năm nhuận");
            }
        } else {
            System.out.println(year + ": là năm không nhuận");
        }

    }

    public static void chuyendoitiente(){
        float rate = 23000f;
        int usd;
        do{
            System.out.println("Nhap USD: ");
            usd = scanner.nextInt();
            if (usd <= -1) {
                System.out.println("Số không hợp lệ");
            } else if (usd > 1000000) {
                System.out.println("Số không hợp lệ");
            } else {
                System.out.println("Số tiền VND là " + rate * usd);
            }

        } while (usd<=-1 || usd > 1000000);
    }

}