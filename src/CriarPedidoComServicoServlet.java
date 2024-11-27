@WebServlet("/criarPedido")
public class CriarPedidoComServicoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PedidoService pedidoService = new PedidoService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String ira = request.getParameter("ira");
            String cargaHoraria = request.getParameter("cargaHoraria");
            String empresa = request.getParameter("empresa");
            // ... capturar outros parâmetros

            PedidoDeEstagio pedido = new PedidoDeEstagio(ira, cargaHoraria, empresa);
            pedidoService.criarPedido(pedido);

            request.setAttribute("message", "Pedido criado com sucesso!");
            request.getRequestDispatcher("sucesso.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("form.jsp").forward(request, response);
        }
    }
}
