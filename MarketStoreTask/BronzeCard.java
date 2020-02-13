package marketStoreDiscounts;

public class BronzeCard extends Card{

    public double getDiscRate() {
        return discRate;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTurnover() {
        return this.turnover;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BronzeCard(double turnover, double purchaseValue) {
        this(turnover, purchaseValue, "Unknown");
    }

    public BronzeCard(double turnover, double purchaseValue, String ownerName) {
        this.ownerName = ownerName;
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
        if (turnover < 100) {
            this.discRate = 0;
            this.discount = purchaseValue*discRate/100;
        } else if(turnover <= 300) {
            this.discRate = 1;
            this.discount = purchaseValue*discRate/100;
        } else {
            this.discRate = 2.5;
            this.discount = purchaseValue*discRate/100;
        }
    }
}
