import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treinos {
    private int id;
    private String nome;
    private List<ExercicioTreino> exercicios = new ArrayList<>();
    private Cliente cliente;
    private Date data;
    private boolean status;


    @Override
    public String toString() {
        return "Treinos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", exercicios=" + exercicios +
                ", cliente=" + cliente +
                ", data=" + data +
                ", status=" + status +
                '}';
    }

    public void adicionarExercicio(ExercicioTreino ex) {
        exercicios.add(ex);
    }

    public void removerExercicio(int id) {
        exercicios.removeIf(e -> e.equals(id));
    }

    public void adicionarRemovido(ExercicioTreino ex) {
        exercicios.remove(ex);
    }

    public void excluirRemovidos() {
        exercicios.clear();
    }

    public int obterDuracaoEstimada() {
        return exercicios.size() * 5; // exemplo
    }

    public void finalizarTreino() {
        this.status = true;
    }

    public float calcularVolumeTotal() {
        float total = 0;
        for (ExercicioTreino e : exercicios) {
            total += e.calcularCargaTotal();
        }
        return total;
    }

    public List<ExercicioTreino> listarExerciciosConcluidos() {
        List<ExercicioTreino> concluidos = new ArrayList<>();
        for (ExercicioTreino e : exercicios) {
            if (e != null) concluidos.add(e);
        }
        return concluidos;
    }
}