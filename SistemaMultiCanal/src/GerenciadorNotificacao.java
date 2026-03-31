import java.util.ArrayList;

public class GerenciadorNotificacao {
    public static void main(String args[]) {
        ArrayList<CanalNotificacao> lista = new ArrayList<>();

        lista.add(new Email("Lucas", "Bom dia! Como esta o relatorio?", "Relatorio"));
        lista.add(new Sms("Pedro", "Bom dia, tudo bem?", "16996168006"));
        lista.add(new Whatsapp("Joana", "Boa noite, tudo bem? Você tem estudado muito ultimamente... Vamos nos encontrar?", "Lida"));

        for (CanalNotificacao canal : lista) {
            canal.enviar();
        }
    }
}
