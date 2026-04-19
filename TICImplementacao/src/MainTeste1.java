public class MainTeste1 {

    public static void main(String[] args) {

        StatusPagamento pago = new StatusPagamento() {
            @Override
            public void efetuarPagamento() {
                System.out.println("Pagamento já realizado.");
            }

            @Override
            public void consultarStatusFinanceiro() {
                System.out.println("Pago");
            }
        };

        StatusPagamento pendente = new StatusPagamento() {
            @Override
            public void efetuarPagamento() {
                System.out.println("Realizando pagamento...");
            }

            @Override
            public void consultarStatusFinanceiro() {
                System.out.println("Pendente");
            }
        };


        System.out.println("=== CLIENTE ONLINE ===");

        Online clienteOnline = new Online();
        clienteOnline.nome = "Lucas";
        clienteOnline.cadastrar();

        clienteOnline.setStatusPagamento(pendente);
        clienteOnline.verificarStatusPagamento();

        clienteOnline.efetuarPagamento();

        clienteOnline.setStatusPagamento(pago);
        clienteOnline.verificarStatusPagamento();

        clienteOnline.plano();
        clienteOnline.enviarFeedbackSemanal("Treino concluído", "link-video.com");

        clienteOnline.mudarStatus(1);

        System.out.println();


        System.out.println("=== CLIENTE PRESENCIAL ===");

        Presencial clientePresencial = new Presencial();
        clientePresencial.nome = "João";
        clientePresencial.cadastrar();

        clientePresencial.setStatusPagamento(pendente);
        clientePresencial.verificarStatusPagamento();

        clientePresencial.plano();
        clientePresencial.registrarDesempenho();

        clientePresencial.efetuarPagamento();

        clientePresencial.setStatusPagamento(pago);
        clientePresencial.verificarStatusPagamento();

        clientePresencial.mudarStatus(2);

        System.out.println();


        System.out.println("=== TESTE POLIMORFISMO ===");

        Cliente cliente;

        cliente = new Online();
        cliente.cadastrar();
        cliente.setStatusPagamento(pago);
        cliente.verificarStatusPagamento();

        cliente = new Presencial();
        cliente.cadastrar();
        cliente.setStatusPagamento(pendente);
        cliente.verificarStatusPagamento();

        System.out.println();


        System.out.println("=== TESTE REMOÇÃO ===");

        clienteOnline.remover(1);
        clientePresencial.remover(2);

        System.out.println("Testes finalizados.");
    }
}