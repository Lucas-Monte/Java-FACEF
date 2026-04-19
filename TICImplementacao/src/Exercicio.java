public class Exercicio {
    private int id;
    private String nome;
    private String descricao;

    @Override
    public String toString() {
        return "Exercicio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public void adicionarExercicio(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void excluirExercicio(int id) {
        if (this.id == id) {
            this.nome = null;
            this.descricao = null;
        }
    }

    public String obterResumo() {
        return nome + ": " + descricao;
    }
}