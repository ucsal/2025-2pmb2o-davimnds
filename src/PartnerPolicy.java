public class PartnerPolicy implements DiscountPolicy {
    @Override
    public double apply(double amount) {
        return 20.00; // Desconto fixo
    }
}
