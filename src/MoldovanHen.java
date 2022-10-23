public class MoldovanHen extends Hen {

    private final static int COUNT_OF_EGGS_PER_MONTH = 12;
    private static int countOfMoldovanHens = 0;

    public static int getCountOfMoldovanHens() {
        return countOfMoldovanHens;
    }

    public static int getCOUNT_OF_EGGS_PER_MONTH() {
        return COUNT_OF_EGGS_PER_MONTH;
    }

    public MoldovanHen() {
        countOfMoldovanHens++;
    }

    @Override
    int getCountOfEggs() {
        return COUNT_OF_EGGS_PER_MONTH * countOfMoldovanHens;
    }

    @Override
    String getDescription() {
        return "Моя страна - Молдова, я несу " + COUNT_OF_EGGS_PER_MONTH + " яиц в месяц";
    }
}