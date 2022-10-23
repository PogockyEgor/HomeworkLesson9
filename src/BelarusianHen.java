public class BelarusianHen extends Hen{

    private final static int COUNT_OF_EGGS_PER_MONTH = 14;
    private static int countOfBelorusianHens = 0;

    public static int getCountOfBelorusianHens() {
        return countOfBelorusianHens;
    }

    public static int getCOUNT_OF_EGGS_PER_MONTH() {
        return COUNT_OF_EGGS_PER_MONTH;
    }

    public BelarusianHen() {
        countOfBelorusianHens++;
    }

    @Override
    int getCountOfEggs() {
        return COUNT_OF_EGGS_PER_MONTH * countOfBelorusianHens;
    }

    @Override
    String getDescription() {
        return "Моя страна - Беларусь, я несу "+COUNT_OF_EGGS_PER_MONTH+" яиц в месяц";
    }

}