public class Whatsapp extends CanalNotificacao{
    private String statusLeitura;

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "statusLeitura='" + statusLeitura + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario + "... Mensagem: " + this.mensagem);
    }
}
