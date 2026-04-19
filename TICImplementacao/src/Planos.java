public class Planos {
    private String descricao;
    private float valor;
    private int duracaoMeses;
    private String tipoPlano;

    public String consultarPlanos() {
        return descricao + " - R$" + valor;
    }

    public void definirPlano(String descricao, float valor, int duracaoMeses, String tipoPlano) {
        this.descricao = descricao;
        this.valor = valor;
        this.duracaoMeses = duracaoMeses;
        this.tipoPlano = tipoPlano;
    }

    public float calcularValorMensal() {
        return valor / duracaoMeses;
    }

    public float aplicarDesconto(float percentual) {
        return valor - (valor * percentual / 100);
    }
}