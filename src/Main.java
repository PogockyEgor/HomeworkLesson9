public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<=100; i++){
            double random = Math.random();
            if(random<0.25){
                new RussianHen();
            }
            else if (random<0.50){
                new UkrainianHen();
            }
            else if (random<0.75){
                new MoldovanHen();
            }
            else {
                new BelarusianHen();
            }
        }
        System.out.println(new RussianHen().getDescription());
        System.out.println(new UkrainianHen().getDescription());
        System.out.println(new MoldovanHen().getDescription());
        System.out.println(new BelarusianHen().getDescription());

        System.out.println("Яиц от всех русских куриц: "+new RussianHen().getCountOfEggs()+
                ", всего русских куриц: "+ RussianHen.getCountOfRussianHens());
        System.out.println("Яиц от всех украинских куриц: "+new UkrainianHen().getCountOfEggs()+
                ", всего украинских куриц: "+UkrainianHen.getCountOfUkrainianHens());
        System.out.println("Яиц от всех молдовских куриц: "+new MoldovanHen().getCountOfEggs()+
                ", всего молдовских куриц: "+MoldovanHen.getCountOfMoldovanHens());
        System.out.println("Яиц от всех белорусских куриц: "+new BelarusianHen().getCountOfEggs()+
                ", всего белорусских куриц: "+BelarusianHen.getCountOfBelorusianHens());
        System.out.println("Все курицы яиц за год: "+ Hen.AllEggsPerYear());

    }
}