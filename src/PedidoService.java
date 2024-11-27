public class PedidoService {
    private PedidoRepository pedidoRepository = new PedidoRepository();

    public void criarPedido(PedidoDeEstagio pedido) throws Exception {
        // Regras de neg�cio, por exemplo:
        if (pedido.getIra() < 6.0) {
            throw new Exception("IRA abaixo do permitido!");
        }
        pedidoRepository.save(pedido);
    }

    public List<PedidoDeEstagio> listarPedidos() {
        return pedidoRepository.findAll();
    }
}
