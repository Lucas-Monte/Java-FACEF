public class Online extends Cliente {
    private float valor;
    private String plataforma;
    private int tempoAcesso;

    @Override
    public String toString() {
        return "Online{" +
                "valor=" + valor +
                ", plataforma='" + plataforma + '\'' +
                ", tempoAcesso=" + tempoAcesso +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", ativo=" + ativo +
                ", telefone='" + telefone + '\'' +
                ", statusPagamento=" + statusPagamento +
                '}';
    }

    @Override
    public void cadastrar() {
        this.ativo = true;
        this.tipoCliente = "Online";
        System.out.println("Cliente online cadastrado.");
    }

    @Override
    public Cliente remover(int id) {
        this.ativo = false;
        System.out.println("Cliente online removido.");
        return this;
    }

    @Override
    public void plano() {
        System.out.println("Plano online via: " + plataforma);
    }

    public void enviarFeedbackSemanal(String relatorioTexto, String linkVideo) {
        System.out.println("Feedback enviado: " + relatorioTexto);
    }

    @Override
    public void consultarStatusFinanceiro() {
        this.verificarStatusPagamento();
    }
}