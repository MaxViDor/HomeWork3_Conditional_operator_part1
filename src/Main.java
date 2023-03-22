public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();

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
    public static void task4 () {
        System.out.println("Задача 4");
        byte age = 17;
        if (age >=2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >=18 && age <24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в унивеситет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }


    }
}