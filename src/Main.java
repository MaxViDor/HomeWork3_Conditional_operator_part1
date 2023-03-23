public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();

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
    public static void task5 () {
        System.out.println("Задача 5");
        byte age=4;
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }else if (age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        }else if (age >14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int passangersUplift = 10;
        byte totalRoom = 102;
        byte seetingRoom = 60;
        int standingRoom = (totalRoom - seetingRoom);
        int placeSeetingPlaces = (seetingRoom - passangersUplift);
        int placeStandindPlaces = (totalRoom - passangersUplift);
        if (passangersUplift >= totalRoom){
            System.out.println("Вагон заполнен полностью, мест нет");
        }else if (passangersUplift < seetingRoom) {
            System.out.println("В вагоне осталось " + placeSeetingPlaces + " сидячих и " + standingRoom + " стоячих мест"  );
        }else if (passangersUplift > seetingRoom && passangersUplift <=totalRoom) {
            System.out.println("В вагоне осталось " + placeStandindPlaces + " стоячих мест");
        }
    }

}