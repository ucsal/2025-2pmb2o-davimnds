import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crie o mapa de políticas.
        Map<String, DiscountPolicy> policies = new HashMap<>();
        policies.put("regular", new RegularPolicy());
        policies.put("premium", new PremiumPolicy());
        policies.put("partner", new PartnerPolicy());

        // Agora, adicione a nova política (VIPPolicy) ao mapa.
        // O DiscountCalculator não precisa ser modificado para suportar isso.
        policies.put("vip", new VIPPolicy());

        // Injetamos o mapa no DiscountCalculator.
        DiscountCalculator calculator = new DiscountCalculator(policies);

        // Use o calculador para aplicar as políticas.
        double valorCompra = 200.00;

        System.out.println("Valor da compra: R$" + valorCompra);
        System.out.println("------------------------------------");

        double descontoRegular = calculator.calculate("regular", valorCompra);
        System.out.println("Desconto (regular): R$" + descontoRegular);

        double descontoPremium = calculator.calculate("premium", valorCompra);
        System.out.println("Desconto (premium): R$" + descontoPremium);

        double descontoParceiro = calculator.calculate("partner", valorCompra);
        System.out.println("Desconto (parceiro): R$" + descontoParceiro);

        // E aqui está a nova política funcionando, sem mudar o DiscountCalculator!
        double descontoVIP = calculator.calculate("vip", valorCompra);
        System.out.println("Desconto (vip): R$" + descontoVIP);
    }
}