public class Main {
    public static void main(String[] args){
        Feeder i = new Feeder(200);
        i.simulateOneDay(5);
        System.out.println(i);

        Feeder j = new Feeder(1000);
        j.simulateManyDays(5,5);
        System.out.println(j);
    }
}