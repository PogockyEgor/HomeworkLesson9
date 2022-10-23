public class UkrainianHen extends Hen{

    private final static int COUNT_OF_EGGS_PER_MONTH = 19;
    private static int countOfUkrainianHens = 0;

    public static int getCountOfUkrainianHens() {
        return countOfUkrainianHens;
    }

    public static int getCOUNT_OF_EGGS_PER_MONTH() {
        return COUNT_OF_EGGS_PER_MONTH;
    }

    public UkrainianHen() {
        countOfUkrainianHens++;
    }

    @Override
    int getCountOfEggs() {
        return COUNT_OF_EGGS_PER_MONTH * countOfUkrainianHens;
    }

    @Override
    String getDescription() {
        return "Моя страна - Украина, я несу "+COUNT_OF_EGGS_PER_MONTH+" яиц в месяц";
    }
}