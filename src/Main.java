public class Main {
    public static void main(String[] args) {
        //Задание 1
        short month = 0;
        float total = 0;
        while (total < 2_459_000) {
            total += 15000;
            total *= 1.01;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        //Задание 2.
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Задание 3.
        int yPopulation = 12_000_000;
        for (int z = 1; z <= 10; z++) {
            System.out.println("Год " + z + ", численность населения составляет " + yPopulation);
            yPopulation += yPopulation / 1000 * (17 - 8);
        }
        System.out.println();
        //Задание 4-6.
        total = 15000;
        for (i = 0; i <= 12 * 9; i++) {
            total += 1500;
            total *= 1.07;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Задание 7.
        System.out.println();
        int firstFriday = 5;
        int totalDay = 31;
        while (firstFriday < totalDay) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;

        }
        System.out.println();
        //Задание 8.
        int for200Years = 2022 - 200;
        int after100 = 2022 + 100;
        for (; for200Years < after100; for200Years++) {
            if (for200Years % 79 == 0)
                System.out.println(for200Years);
        }
        System.out.println();
        //Задание 9.
        for (i=1;i<=10;i++){
            System.out.println("2*"+i+"="+2*i);
        }
    }
}