public class PremiumPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.25; // 25% de desconto
    }
}
