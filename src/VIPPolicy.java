public class VIPPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return amount * 0.40; // 40% de desconto
    }
}