import java.util.Date;

public class HorarioTreino {
    private int id;
    private Presencial cliente;
    private Date data;
    private boolean checkIn;

    public void registrarPresenca(Date dataHora) {
        this.checkIn = true;
    }

    public void registrarFalta(boolean justificada) {
        this.checkIn = false;
    }

    public void agendarAula(Date data) {
        this.data = data;
    }

    public void remarcarAula(Date novaData) {
        this.data = novaData;
    }

    public void cancelarAula() {
        this.data = null;
    }

    public String consultarAgenda() {
        return data != null ? data.toString() : "Sem agendamento";
    }
}