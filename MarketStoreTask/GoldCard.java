package marketStoreDiscounts;

public class GoldCard extends Card {

    public double getDiscRate() {
        return discRate;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public double getTurnover() {
        return this.turnover;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public GoldCard(double turnover, double purchaseValue) {
        this(turnover, purchaseValue, "Unknown");
    }

    public GoldCard(double turnover, double purchaseValue, String ownerName){
        this.ownerName = ownerName;
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
        final int LEVEL_FOR_RISING_DISC_RATE = 100;
        this.discRate = 2 + (int)(turnover/LEVEL_FOR_RISING_DISC_RATE);
        if (this.discRate > 10) {
            this.discRate = 10;
        }
        this.discount = purchaseValue*discRate/100;
    }
}
