public class Main {
    public static void main(String[] args) {
        //task1
        byte bananas = 6;
        System.out.println("Значение переменной bananas с типом byte равно " + bananas);
        short apples = 30;
        System.out.println("Значение переменной apples с типом short равно " + apples);
        int cherry = 40;
        System.out.println("Значение переменной cherry с типом int равно " + cherry);
        long tomato = 1_560L;
        System.out.println("Значение переменной tomato с типом long равно " + tomato);
        float grapes = 5.5f;
        System.out.println("Значение переменной grapes с типом float равно " + grapes);
        double mango = 35.34;
        System.out.println("Значение переменной mango с типом double равно " + mango);

        //task2
        float pear = 27.12f;
        long avocado = 987_678_965_549L;
        double watermelon = 2.786;
        boolean isMore = 5 > 10; //false
        short dog = 569;
        int cashBalance = -159;
        int birds = 27897;
        byte cat = 67;

        //task3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println(totalStudents); //80
        System.out.println("На каждого ученика рассчитано " + 480/totalStudents + " листов бумаги");

        //task4
        byte in1Minute = 16/2;
        System.out.println("За 1 минуту машины производят бутылок " +in1Minute+ " штук");
        int in20Minute = in1Minute*20;
        System.out.println("За 20 минут машины производят бутылок " +in20Minute+ " штук");
        int in1Hour = in20Minute*3;
        System.out.println("За 1 час машины производят бутылок " +in1Hour+ " штук");
        int in1Day = in1Hour*24;
        System.out.println("За сутки машины производят бутылок " +in1Day+ " штук");
        int in3Days = in1Day*3;
        System.out.println("За 3 дня машины производят бутылок " +in3Days+ " штук");
        int in1Month = in1Day*31;
        System.out.println("За 1 месяц машины производят бутылок " +in1Month+ " штук");

        //task5














    }
}