public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Rosa", "UFO-9871", 4, "Fusca");
//        carro1.setModelo("Fusca");
//        carro1.setCor("Rosa");
//        carro1.setPlaca("UFO-9871");
//        carro1.setQtdRodas(4);

        Carro carro2 = new Carro("Branco", "GVB-9155", 4, "Corsa");
//        carro2.setModelo("Corsa");
//        carro2.setCor("Branco");
//        carro2.setPlaca("GVB-9155");
//        carro2.setQtdRodas(4);

        System.out.println(carro1);
        System.out.println("-----------------------------------------");
        System.out.println(carro2);

        Moto moto1 = new Moto("Cinza", "HE1J66", 2, "R15");
//        moto1.setModelo("R15");
//        moto1.setCor("Cinza");
//        moto1.setPlaca("HE1J66");
//        moto1.setQtdRodas(2);

        System.out.println("-----------------------------------------");
        System.out.println(moto1);
        System.out.println("-----------------------------------------");

    }


}
