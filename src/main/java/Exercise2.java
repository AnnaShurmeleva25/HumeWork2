import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int day = 0;
        int month = 0;
        int year = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер дня: ");
        day = in.nextInt();
        System.out.print("Введите номер месяца: ");
        month = in.nextInt();
        System.out.print("Введите год: ");
        year = in.nextInt();

        System.out.printf("Начальная дата %d.%d.%d\n", day, month, year);
        day++;
        if (29 <= day) {
            switch (month) {
                case 2:
                    day = 1;
                    month++;
                    break;
                case 4:
                case 6:
                case 7:
                case 9:
                    if (31 <= day) {
                        day = day - 30;
                        month++;
                        break;
                    }
                        default:
                            if (32 <= day) {
                                day = day - 31;
                                month++;
                            }
                    }
            }
            if (month > 12) {
                month = 1;
                year++;
            }
            System.out.printf("Следующая дата %d.%d.%d\n\n", day, month, year);
        }
    }