public class MemberDiscount implements Discount {
    private static final double MEMBER_DISCOUNT = 0.15;
    
    @Override
    public double applyDiscount(double totalCost) {
        return totalCost * MEMBER_DISCOUNT;
    }
}