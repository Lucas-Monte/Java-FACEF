public class Email extends CanalNotificacao {
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Email{" +
                "assunto='" + assunto + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }

    @Override
    public void enviar(){
        System.out.println("Enviando E-mail para " + this.destinatario + " com o assunto " + this.assunto + ": " + this.mensagem);
    }
}
