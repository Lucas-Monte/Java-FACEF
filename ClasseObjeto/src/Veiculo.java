public class Veiculo {
    protected String cor;
    protected String placa;
    protected int qtdRodas;

    public Veiculo(String cor, String placa, int qtdRodas) {
        this.cor = cor;
        this.placa = placa;
        this.qtdRodas = qtdRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
}
