public class Main {
    public static void main(String[] args) {
        //Домашнее задание 2
        System.out.println("Домашнее задание 2");

        //Задание 1
        System.out.println("Задание 1");

        int age = 9;

        if (age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием!!!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }


        //Задание 2
        System.out.println("Задание 2");

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        //Задание 3
        System.out.println("Задание 3");

        int capacity = 102;
        int sedentaryPlaces = 60;
        int standingPlaces = capacity-sedentaryPlaces;

        int seatsUsed = 60;
        int standingPlacesUsed = 25;

        if (seatsUsed < sedentaryPlaces) {
            System.out.println("В вагоне есть ещё " + (sedentaryPlaces - seatsUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (standingPlacesUsed < standingPlaces) {
            System.out.println("В вагоне есть ещё " + (sedentaryPlaces - standingPlacesUsed) + " стоячие места");
        } else {
            System.out.println("Стоячих мест нет!");
        }
        if (seatsUsed + standingPlacesUsed >= 102) {
            System.out.println("Вагон полностью забит");
        }
    }
}