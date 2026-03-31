public abstract class CanalNotificacao {
    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "CanalNotificacao{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

    public abstract void enviar();

}
