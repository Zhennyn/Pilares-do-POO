public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("231332");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("493242");
        //z400.ligar();

        //polimorfismo
        Veiculo coringa = z400;

        coringa.ligar();
    }
}
