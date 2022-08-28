public class Main {
    public static void main(String[] args) {
        //task1
        byte tea = 6;
        System.out.println("Значение переменной tea с типом byte равно " + tea);
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
        byte whiteBanks = 2;
        byte brownBanks = 4;
        byte totalBanks = 120;
        int totalBanksOn1Class = whiteBanks + brownBanks;
        int totalClasses = totalBanks/(totalBanksOn1Class);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " +
                2*totalClasses + " банок белой краски и " + 4*totalClasses + " банок коричневой краски");

        //task6
        int weightBananaOnGram = 80;
        int weightMilkOnGram = 105;
        int weightIceCreamOnGram = 100;
        int weightEggOnGram = 70;
        int totalWeight = 5*weightBananaOnGram + 2*weightMilkOnGram + 2*weightIceCreamOnGram + 4*weightEggOnGram;
        System.out.println("Вес спорт-завтрака " + totalWeight/1000.0 + " кг");

        //task7

        int weightInKg = 7;
        int weightInGram = weightInKg*1000;
        int daysIf250 = weightInGram/250;
        System.out.println(daysIf250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        int daysIf500 = weightInGram/500;
        System.out.println(daysIf500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        int daysOnAverage = (daysIf250 + daysIf500)/2;
        System.out.println(daysOnAverage + "  день может потребоваться дней в среднем, чтобы добиться результата похудения");

        //task8
        int salaryMasha = 67_760;
        float salaryUpMasha = salaryMasha*1.1f;
        System.out.println(salaryUpMasha);
        float differenceSalaryMasha = salaryUpMasha*12 - salaryMasha*12;
        System.out.println("Маша теперь получает " + salaryUpMasha + " рублей. Годовой доход вырос на "
                + differenceSalaryMasha + " рублей");
        int salaryDenis = 83_690;
        float salaryUpDenis = salaryDenis*1.1f;
        System.out.println(salaryUpDenis);
        float differenceSalaryDenis = salaryUpDenis*12 - salaryDenis*12;
        System.out.println("Денис теперь получает " + salaryUpDenis + " рублей. Годовой доход вырос на "
                + differenceSalaryDenis + " рублей");
        int salaryKristina = 76_230;
        float salaryUpKristina = salaryKristina*1.1f;
        System.out.println(salaryUpKristina);
        float differenceSalaryKristina = salaryUpKristina*12 - salaryKristina*12;
        System.out.println("Кристина теперь получает " + salaryUpKristina + " рублей. Годовой доход вырос на "
                + differenceSalaryKristina + " рублей");



















    }
}