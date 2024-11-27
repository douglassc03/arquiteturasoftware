@WebServlet("/criarPedido")
public class CriarPedidoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PedidoRepository pedidoRepository = new PedidoRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ira = request.getParameter("ira");
        String cargaHoraria = request.getParameter("cargaHoraria");
        String empresa = request.getParameter("empresa");
        // ... capturar outros par�metros

        // Valida��es b�sicas
        if (ira == null || cargaHoraria == null || empresa == null) {
            request.setAttribute("error", "Campos obrigat�rios n�o preenchidos!");
            request.getRequestDispatcher("form.jsp").forward(request, response);
            return;
        }

        // Criar o objeto PedidoDeEstagio
        PedidoDeEstagio pedido = new PedidoDeEstagio(ira, cargaHoraria, empresa);
        pedidoRepository.save(pedido);

        request.setAttribute("message", "Pedido criado com sucesso!");
        request.getRequestDispatcher("sucesso.jsp").forward(request, response);
    }
}
