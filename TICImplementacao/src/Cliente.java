public abstract class Cliente implements StatusPagamento {
    protected int id;
    protected String nome;
    protected String dataNascimento;
    protected String endereco;
    protected String tipoCliente;
    protected boolean ativo;
    protected String telefone;
    protected StatusPagamento statusPagamento;

    public abstract void cadastrar();
    public abstract Cliente remover(int id);
    public abstract void plano();

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", ativo=" + ativo +
                ", telefone='" + telefone + '\'' +
                ", statusPagamento=" + statusPagamento +
                '}';
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void efetuarPagamento() {
        if (statusPagamento != null) {
            statusPagamento.efetuarPagamento();
        } else {
            System.out.println("Status de pagamento não definido.");
        }
    }

    public void verificarStatusPagamento() {
        if (statusPagamento != null) {
            statusPagamento.consultarStatusFinanceiro();
        } else {
            System.out.println("Status de pagamento não definido.");
        }
    }

    public boolean mudarStatus(int id) {
        this.ativo = !this.ativo;
        return this.ativo;
    }

    public void consultarPlanilha() {
        System.out.println("Consultando planilha...");
    }
}