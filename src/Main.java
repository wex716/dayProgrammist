import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        System.out.println("Программа позволяет узнать в какой день отмичается день программиста ");

        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("12/09/" + year);
        else
            System.out.println("13/09/" + year);

    }
}