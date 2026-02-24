public class Moto extends Veiculo{
    private String modelo;

    public Moto(String cor, String placa, int qtdRodas, String modelo) {
        super(cor, placa, qtdRodas);
        this.modelo = modelo;
    }

    public String toString() {
        return "Modelo - " + this.modelo + "\n" +
                "Placa - " + super.placa + "\n" +
                "Cor - " + super.cor + "\n" +
                "Quantidade de Rodas - " + super.qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
