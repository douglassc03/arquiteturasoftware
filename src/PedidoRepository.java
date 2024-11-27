public class PedidoRepository {
    private List<PedidoDeEstagio> pedidos = new ArrayList<>();

    public void save(PedidoDeEstagio pedido) {
        pedidos.add(pedido);
    }

    public List<PedidoDeEstagio> findAll() {
        return pedidos;
    }
}
