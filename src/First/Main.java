package First;


public class Main {

    public static void main(String[] args) {
        //Задание №1:
        byte juniorSalaryForHour = 100;
        short middleSalaryForHour = 3000;
        int seniorSalaryForHour = 50000;
        long tmSalaryForHour = 100000L;
        float timeToStudyYear = 0.11F;
        double timeForTm = 3.557;
        char currency = 36;


        long Salary = juniorSalaryForHour + middleSalaryForHour + seniorSalaryForHour + tmSalaryForHour;
        double YearForDream = timeToStudyYear + timeForTm;
        boolean money = true;
        System.out.println("Заработал " + Salary + currency + " за " + YearForDream + " лет! " + money);

        //Задание №2:
        double boxerFirst = 78.2;
        double boxerSecond = 82.7;
        double weightBoxers = boxerFirst + boxerSecond;
        double differenceWeight = boxerSecond - boxerFirst;
        System.out.println("Общий вес боксёров " + weightBoxers + " кг, " + "разнице в весе "
                + differenceWeight + " кг!");

        //Задание №3:
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        int icWeight = 2 * 100;
        long eggWeight = 4 * 70L;
        long cooking = bananaWeight + milkWeight + icWeight + eggWeight;
        float cookingKg = (float) cooking / 1000;
        System.out.println("Общий вес спорт-завтрака " + cooking + " грамм или " + cookingKg + " кг.");

        //Задание №4:
       var lightDiet = 0.250;
       var hardDiet = 0.500;
       var weightNeedPutsAway = 7;
       var needWeight = boxerSecond - weightNeedPutsAway;
       var daysForLD = (boxerSecond /  lightDiet) % needWeight;
       var daysForHD = (boxerSecond / hardDiet) % needWeight;
       var middlePutsAwayWeights = (daysForLD + daysForHD) / 2;

        System.out.println("Нужный вес " + needWeight+" кг, " + daysForLD + " дней уйдет при потере веса 250 грамм в день или " + daysForHD +
                " дней при диете с потерей веса по 500 грамм на день, среднее количество дней " + middlePutsAwayWeights);

        //Задание №5:
        var SalaryForMasha = 67760 / 10 + 67760;
        var SalaryForDenis = 83690 / 10 + 83690;
        var SalaryForKristina = 76320 / 10 + 76320;
        var yearSalaryMasha = (SalaryForMasha - 67760) * 12;
        var yearSalaryForDenis = (SalaryForDenis - 83690) * 12;
        var yearSalaryForKristina = (SalaryForKristina - 76320) * 12;

        System.out.println("Маша теперь получает " + SalaryForMasha + " рублей. Годовой доход Маши вырос на "
                + yearSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + SalaryForDenis + " рублей, его годовой доход вырос на "
                + yearSalaryForDenis + " рублей.");
        System.out.println("Кристина теперь получает " + SalaryForKristina + " рублей, её годовой доход вырос на "
                + yearSalaryForKristina + " рублей.");



    }
}
