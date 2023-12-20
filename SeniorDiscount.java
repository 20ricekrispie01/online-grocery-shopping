public class SeniorDiscount implements Discount {
    private static final double SENIOR_DISCOUNT = 0.10;
    
    @Override
    public double applyDiscount(double totalCost) {
        return totalCost * SENIOR_DISCOUNT;
    }
}
