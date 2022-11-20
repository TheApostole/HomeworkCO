import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1
        System.out.println("Домашнее задание 1");

        //Задание 1
        System.out.println("Задание 1");

        int age = 18;

        if (age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием!!!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }


        //Задание 2
        System.out.println("Задание 2");

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }


        //Задание 3
        System.out.println("Задание 3");

        int capacity = 102;
        int sedentaryPlaces = 60;
        int standingPlaces = capacity-sedentaryPlaces;

        int seatsUsed = 45;
        int standingPlacesUsed = 41;

        if (seatsUsed < sedentaryPlaces) {
            System.out.println("В вагоне есть ещё " + (sedentaryPlaces - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed == sedentaryPlaces) {
                System.out.println("Сидячих мест нет!");
            }
        if (standingPlacesUsed < standingPlaces) {
            System.out.println("В вагоне есть ещё " + (sedentaryPlaces - standingPlacesUsed) + " стоячие места");
        }
        if (standingPlacesUsed == standingPlaces) {
            System.out.println("Стоячих мест нет!");
        }
        if (seatsUsed + standingPlacesUsed >= 102) {
            System.out.println("Вагон полностью забит");
        }
    }
}