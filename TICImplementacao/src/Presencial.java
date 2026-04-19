import java.util.List;

public class Presencial extends Cliente {
    private String localTreino;
    private float frequencia;
    private int duracaoSessao;
    private float valor;
    private List<HorarioTreino> horarios;

    @Override
    public void cadastrar() {
        this.ativo = true;
        this.tipoCliente = "Presencial";
        System.out.println("Cliente presencial cadastrado.");
    }

    @Override
    public Cliente remover(int id) {
        this.ativo = false;
        System.out.println("Cliente presencial removido.");
        return this;
    }

    @Override
    public void plano() {
        System.out.println("Plano presencial no local: " + localTreino);
    }

    public void registrarDesempenho() {
        System.out.println("Desempenho registrado.");
    }

    @Override
    public void consultarStatusFinanceiro() {
        this.verificarStatusPagamento();
    }
}