package marketStoreDiscounts;

import static marketStoreDiscounts.PayDesk.printInfo;

public class MarketStoreDemo {
    public static void main(String[] args) {
        BronzeCard bronzeCard1 = new BronzeCard(0, 150);
        SilverCard silverCard1 = new SilverCard(600, 850);
        GoldCard goldCard1 = new GoldCard(1500, 1300, "Mark");

        printInfo(bronzeCard1);
        printInfo(silverCard1);
        printInfo(goldCard1);
    }
}
