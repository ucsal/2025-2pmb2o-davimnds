public class RegularPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.10; // 10% de desconto
    }
}
