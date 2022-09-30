public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int yearsOld = 20;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }
        if (yearsOld < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать!");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (yearsOld >= 24) {
            System.out.println("Человек окончил университет и ходит на работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int seatsCount = 60;
        int standingCount = capacity - seatsCount;

        int seatsUsed = 20;
        int standingUsed = 20;
        if (seatsUsed < seatsCount) {
            System.out.println(" Свободных сидячих мест " +(seatsCount - seatsUsed) );
        }
        if (seatsUsed == seatsCount) {
            System.out.println(" Сидячих мест нет ");
        }
        if (standingUsed < standingCount) {
            System.out.println(" Свободных стоячих мест " +(standingCount - standingUsed) );
        }
        if (standingUsed == standingCount) {
            System.out.println(" Стоячих мест нет ");
        }
    }
}