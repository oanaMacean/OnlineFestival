public class Promotion {

    private Price initialPrice;
    private int discount;

    public Promotion(Price initialPrice, int discount) {
        this.initialPrice = initialPrice;
        this.discount = discount;
    }

    public Price getFinalPrice() {
        Price finalPrice = new Price();
        Double price = Double.valueOf(initialPrice.getPrice() * discount / 100);
        finalPrice.setPrice(price.intValue());
        return finalPrice;
    }

}
