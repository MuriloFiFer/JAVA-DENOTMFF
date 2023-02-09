package CalculoDeViagem;

/**
 * CalculoViagem
 */
public class CalculoViagem {

    public static void main(String[] args) {

        int distanciaPercorrida = 148; // em KM // int é var inteiro.
        double consumoTransporte = 10; // em Km/L // double é var decimal.
        double precoCombustivel = 4.99; // em R$
        double quantidadeLitrosCombustivel = distanciaPercorrida / consumoTransporte;
        double custoTotal = quantidadeLitrosCombustivel * precoCombustivel;
        System.out.println("O custo total da Viagem foi de:");
        System.out.println("R$" + custoTotal);
    }
}
