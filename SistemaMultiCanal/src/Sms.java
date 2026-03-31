public class Sms extends CanalNotificacao {
    private String numeroTelefone;

    public Sms(String destinatario, String mensagem, String numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "numeroTelefone=" + numeroTelefone +
                ", destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número " + this.numeroTelefone + ": " + this.mensagem);
    }
}
