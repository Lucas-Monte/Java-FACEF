public class ExercicioTreino {
    private int id;
    private Exercicio exercicio;
    private String treino;
    private float peso;
    private float intensidade;
    private int series;
    private int repeticoes;
    private String carga;
    private int tempoDescanso;
    private boolean status;

    public void ajustarVolume(int novasSeries, int novasRepeticoes) {
        this.series = novasSeries;
        this.repeticoes = novasRepeticoes;
    }

    public void marcarComoConcluido() {
        this.status = true;
    }

    public float calcularCargaTotal() {
        return peso * series * repeticoes;
    }

    public void incrementarCarga(float valor) {
        this.peso += valor;
    }
}