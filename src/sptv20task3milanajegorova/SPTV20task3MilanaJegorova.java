package sptv20task3milanajegorova;

import java.util.Scanner;

public class SPTV20task3MilanaJegorova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Ваша фамилия: ");
        String lastname = scanner.nextLine();
        System.out.print("Число и месяц вашего рождения: ");
        String birthnumber = scanner.nextLine();
        System.out.print("Год вашего рождения: ");
        String birthyear = scanner.nextLine();
        System.out.println(firstname+" "+lastname+" родился "+birthnumber+" "+birthyear+" года");
        
    }
    
}
