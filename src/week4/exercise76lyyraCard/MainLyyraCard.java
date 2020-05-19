package week4.exercise76lyyraCard;

public class MainLyyraCard {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);
        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

        System.out.println();

        LyyraCard card2 = new LyyraCard(5);
        System.out.println(card2);

        card2.payGourmet();
        System.out.println(card2);

        card2.payGourmet();
        System.out.println(card2);

        System.out.println();

        LyyraCard card3 = new LyyraCard(10);
        System.out.println(card);

        card3.loadMoney(15);
        System.out.println(card3);

        card3.loadMoney(10);
        System.out.println(card3);

        card3.loadMoney(200);
        System.out.println(card3);

        System.out.println();

        LyyraCard card4 = new LyyraCard(10);
        System.out.println("Pekka: " + card4);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card4);

        System.out.println();

        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);
        pekka.payGourmet();
        brian.payEconomical();
        System.out.println("Pekka: " + pekka);
        System.out.println("Brian: " + brian);
        pekka.loadMoney(20);
        brian.payGourmet();
        System.out.println("Pekka: " + pekka);
        System.out.println("Brian: " + brian);
        pekka.payEconomical();
        pekka.payEconomical();
        brian.loadMoney(50);
        System.out.println("Pekka: " + pekka);
        System.out.println("Brian: " + brian);


    }
}

