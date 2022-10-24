public class Exercise8 {
    public static void main(String[] args) {
        int fingerNumber = 2;

        System.out.println("Порядковый номер пальца" + " " + fingerNumber);
        switch (fingerNumber) {
            case 1:
                System.out.println("Большой");
                break;
            case 2:
                System.out.println("Указательный");
                break;
            case 3:
                System.out.println("Средний");
                break;
            case 4:
                System.out.println("Безымянный");
                break;
            case 5:
                System.out.println("Мизинец");
                break;
            default:
                System.out.println("Такого пальца нет!");
        }
    }
}
