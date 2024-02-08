public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("если возраст человека равен 18 то он совершеннолетний");
        } else {
            System.out.println("если возраст человека не достиг 18 то нужно немного подождать");
        }

        int outDoors = 3;
        if (outDoors > 5) {
            System.out.println("сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("на улице холодно, нужно надеть шапку");
        }
        int speed = 65;
        if (speed < 60) {
            System.out.println("если скорость меньше 60, можно ездить спокойноЭ");
        } else {
            System.out.println("если скорость больше 60, то придется заплатить штраф");
        }
        if (age < 6 && age > 2) {
            System.out.println("если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age > 7 && age < 17) {
            System.out.println(" если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("если возраст человека равен " + age + " то ему нужно ходить в университет ");
        }
        if (age > 24) {
            System.out.println("если возраст человека равен " + age + " то ему пора ходить на работу");
        } else if (age < 5) {
            System.out.println("если возраст ребенка меньше 5, то он не может кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("если возраст ребенка меньше 5, но больше 14, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя ");
        } else if (age > 14) {
            System.out.println(" если ребенок старше 14 лет, то он может кататься без сопровождения взрослого");
        }
        int capacityCoach = 102;
        int seating = 60;
        if (seating < 60 && capacityCoach < 102) {
            System.out.println(" в вагоне есть сидячие места");
        } else if (seating == 60 && capacityCoach < 102) {
            System.out.println(" в вагоне есть стоячие места");
        } else
        {System.out.println("вагон полностью забит");

        }
        int one  = 1;
        int two = 3;
        int three = 2;
        if ( one > two && one > three) {
            System.out.println(" one is biggest");
        }else if (two > one && two > three)
        {System.out.println("two is biggest");
        } else {System.out.println(" three is biggest");}




        }}