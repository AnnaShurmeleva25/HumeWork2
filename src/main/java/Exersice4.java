import java.util.Scanner;

public class Exersice4 {
    public static void main(String[] args) {

        int first = 0;
        int second = 0;
        int third = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        first = in.nextInt();
        System.out.print("Введите второе число: ");
        second = in.nextInt();
        System.out.print("Введите третье число: ");
        third = in.nextInt();

        System.out.print("Среднее число: ");

        if (first > second) {
            if (first > third) {
                if (second > third) {
                    System.out.print(second);
                } else {
                    System.out.print(third);
                }
            } else {
                System.out.print(first);
            }
        } else {
            if (second > third) {
                if (first > third) {
                    System.out.print(first);
                } else {
                    System.out.print(third);
                }
            } else {
                System.out.print(second);
            }
        }
        System.out.print("\n\n");


    }
}


