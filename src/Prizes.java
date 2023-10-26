public class Prizes {
    public static void main(String[] args) {
        Olimpiada olimpiada = new Olimpiada();

        olimpiada.addPrize("First Member", 1);
        olimpiada.addPrize("Second Member", 2);
        // code
        Observer firstSubscriber = new Subscribers("First Subscriber");
        Observer secondSubscriber = new Subscribers("Second Subscriber");

        olimpiada.addObserver(firstSubscriber);
        olimpiada.addObserver(secondSubscriber);

        olimpiada.addPrize("Third Member", 3);

        olimpiada.removePrize("Third Member");

        olimpiada.addPrize("Fourth Member", 4);
    }
}
