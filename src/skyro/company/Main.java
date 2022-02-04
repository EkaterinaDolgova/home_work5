package skyro.company;

public class Main {

    public static void main(String[] args) {
        //Задание №1
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (int i1 = 10; i1 >= 0; i1--) {
            System.out.print(i1 + " ");
        }
        System.out.println(" ");
        //Задание №2
        for (int i2 = 4; i2 <= 31; i2 = i2 + 7) {
            System.out.println("Сегодня пятница, " + i2 + "-е число. Необходимо подготовить отчет.");
        }
        //Задание №3
        int y1 = 1896;
        int yOut = y1+200;
        for (int y = 0; y < yOut; y = y + 79) {
            System.out.println(y);
        }
    }
}
