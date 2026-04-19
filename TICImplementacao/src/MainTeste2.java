import java.util.Date;

public class MainTeste2 {
    public static void main(String[] args) {

        // =========================
        // 🔹 TESTE PLANOS
        // =========================
        System.out.println("=== PLANOS ===");

        Planos plano = new Planos();
        plano.definirPlano("Plano Premium", 300f, 3, "Mensal");

        System.out.println(plano.consultarPlanos());
        System.out.println("Valor mensal: R$ " + plano.calcularValorMensal());
        System.out.println("Valor total com desconto: R$ " + plano.aplicarDesconto(10));

        System.out.println();

        // =========================
        // 🔹 TESTE EXERCÍCIO
        // =========================
        System.out.println("=== EXERCÍCIO ===");

        Exercicio exercicio = new Exercicio();
        exercicio.adicionarExercicio("Supino", "Treino de peito");

        System.out.println(exercicio.obterResumo());

        System.out.println();

        // =========================
        // 🔹 TESTE EXERCICIO_TREINO
        // =========================
        System.out.println("=== EXERCICIO_TREINO ===");

        ExercicioTreino et = new ExercicioTreino();
        et.incrementarCarga(50);
        et.ajustarVolume(3, 10);

        System.out.println(et.calcularCargaTotal());

        et.marcarComoConcluido();

        System.out.println();

        // =========================
        // 🔹 TESTE TREINOS
        // =========================
        System.out.println("=== TREINOS ===");

        Treinos treino = new Treinos();
        treino.adicionarExercicio(et);

        System.out.println("Volume total: " + treino.calcularVolumeTotal());
        System.out.println("Duração estimada: " + treino.obterDuracaoEstimada());

        treino.finalizarTreino();

        System.out.println(treino);

        // =========================
        // 🔹 TESTE HORARIO TREINO
        // =========================
        System.out.println("=== HORÁRIO TREINO ===");

        Presencial cliente = new Presencial();
        cliente.cadastrar();

        HorarioTreino horario = new HorarioTreino();

        Date hoje = new Date();

        horario.agendarAula(hoje);
        System.out.println("Agenda: " + horario.consultarAgenda());

        horario.registrarPresenca(hoje);
        System.out.println("Presença registrada");

        horario.remarcarAula(new Date(System.currentTimeMillis() + 86400000)); // +1 dia
        System.out.println("Remarcado: " + horario.consultarAgenda());

        horario.cancelarAula();
        System.out.println("Após cancelamento: " + horario.consultarAgenda());

        System.out.println();

        // =========================
        // 🔹 TESTE INTEGRAÇÃO
        // =========================
        System.out.println("=== INTEGRAÇÃO COMPLETA ===");

        Online online = new Online();
        online.cadastrar();

        online.consultarStatusFinanceiro();
        online.efetuarPagamento();
        online.consultarStatusFinanceiro();

        online.plano();

        System.out.println();

        System.out.println("Sistema testado com sucesso 🚀");
    }
}