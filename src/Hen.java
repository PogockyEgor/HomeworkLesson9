public abstract class Hen {

    abstract int getCountOfEggs();

    String getDescription(){
        return "Я курица";
    }

    static int AllEggsPerYear(){
        return (RussianHen.getCountOfRussianHens()*RussianHen.getCOUNT_OF_EGGS_PER_MONTH()+UkrainianHen.getCountOfUkrainianHens()*UkrainianHen.getCOUNT_OF_EGGS_PER_MONTH()+
                MoldovanHen.getCountOfMoldovanHens()*MoldovanHen.getCOUNT_OF_EGGS_PER_MONTH()+BelarusianHen.getCountOfBelorusianHens()*BelarusianHen.getCOUNT_OF_EGGS_PER_MONTH())
                *12;
    }
}
