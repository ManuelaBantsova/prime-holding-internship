package marketStoreDiscounts;

public class PayDesk {
    public static void printInfo(Card card) {
        if (card instanceof BronzeCard) {
            System.out.println("Bronze card");
        } else if (card instanceof SilverCard) {
            System.out.println("Silver card");
        } else {
            System.out.println("Gold card");
        }
        System.out.printf("Owner: %s\n", card.getOwnerName());
        System.out.printf("Purchase value: $%.2f\n",card.getPurchaseValue());
        System.out.printf("Discount rate: %.1f%%\n", card.getDiscRate());
        System.out.printf("Discount: $%.2f\n", card.getDiscount());
        System.out.printf("Total: $%.2f\n",card.getPurchaseValue() - card.getDiscount());
        System.out.println("------------------------");
    }
}
