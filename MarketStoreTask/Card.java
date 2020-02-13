package marketStoreDiscounts;

public abstract class Card {
    protected double discRate;
    protected double discount;
    protected double purchaseValue;
    protected double turnover;
    protected String ownerName;

    public abstract double getPurchaseValue();
    public abstract double getDiscRate();
    public abstract double getDiscount();
    public abstract double getTurnover();
    public abstract String getOwnerName();

}
