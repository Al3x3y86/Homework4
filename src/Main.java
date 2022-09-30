public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int yearsOld = 17;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        } else if (yearsOld > 6 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (yearsOld < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (yearsOld < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребенок может кататься на аттракционе");
        }

        // Задание 3
        System.out.println("Задание 3");
        int one = 5;
        int two = 55;
        int three = 155;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        }else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        }else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}