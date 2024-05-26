public class Carro extends Veiculo {

    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("conferir combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo o cambio");
    }
}
