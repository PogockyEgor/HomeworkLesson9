public class RussianHen extends Hen {

    private final static int COUNT_OF_EGGS_PER_MONTH = 16;
    private static int countOfRussianHens = 0;

    public static int getCountOfRussianHens() {
        return countOfRussianHens;
    }

    public static int getCOUNT_OF_EGGS_PER_MONTH() {
        return COUNT_OF_EGGS_PER_MONTH;
    }

    public RussianHen() {
        countOfRussianHens++;
    }

    @Override
    int getCountOfEggs() {
        return COUNT_OF_EGGS_PER_MONTH * countOfRussianHens;
    }

    @Override
    String getDescription() {
        return "Моя страна - Россия, я несу "+COUNT_OF_EGGS_PER_MONTH+" яиц в месяц";
    }
}