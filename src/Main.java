public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+ " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " +age+ " , то он не достиг совершеннолетия, нужно немного подождать");

        }

    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperatureOutdoor = 30;
        if (temperatureOutdoor <=5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int carSpeed = 80;
        if (carSpeed >60) {
            System.out.println("Если скорость "+ carSpeed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость" + carSpeed + " , то  можно ездить спокойно");
        }
    }
}