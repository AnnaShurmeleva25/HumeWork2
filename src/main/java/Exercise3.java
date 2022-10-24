import javax.swing.*;

public class Exercise3 {
    public static void main(String[] args) {
        int n = 23466;

        System.out.printf("Число в секундах %d\n", n);
        n = n / 60;
        System.out.printf("Числа в секундах %d\n", n);
        n = n / 60;
        System.out.printf("Осталось %d часов\n\n", n);

    }
}
