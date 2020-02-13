package marketStoreDiscounts;

public class SilverCard extends Card {
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

    public SilverCard(double turnover, double purchaseValue) {
        this(turnover, purchaseValue, "Unknown");
    }

    public SilverCard(double turnover, double purchaseValue, String ownerName) {
        this.ownerName = ownerName;
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
        if (turnover > 300) {
            this.discRate = 3.5;
        } else {
            this.discRate = 2;
        }
        this.discount = purchaseValue*discRate/100;
    }
}
