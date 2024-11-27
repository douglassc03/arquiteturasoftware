public class PedidoDeEstagio {
    private String ira;
    private String cargaHoraria;
    private String empresa;
    private String enderecoEmpresa;
    private String modalidade;
    private String cargaHorariaSemanal;
    private String valorBolsa;
    private String resumoAtividades;

    // Construtor
    public PedidoDeEstagio(String ira, String cargaHoraria, String empresa) {
        this.ira = ira;
        this.cargaHoraria = cargaHoraria;
        this.empresa = empresa;
    }

    // Getters e Setters
    public String getIra() {
        return ira;
    }

    public void setIra(String ira) {
        this.ira = ira;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(String cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(String valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public String getResumoAtividades() {
        return resumoAtividades;
    }

    public void setResumoAtividades(String resumoAtividades) {
        this.resumoAtividades = resumoAtividades;
    }

    @Override
    public String toString() {
        return "PedidoDeEstagio{" +
                "ira='" + ira + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", empresa='" + empresa + '\'' +
                ", enderecoEmpresa='" + enderecoEmpresa + '\'' +
                ", modalidade='" + modalidade + '\'' +
                ", cargaHorariaSemanal='" + cargaHorariaSemanal + '\'' +
                ", valorBolsa='" + valorBolsa + '\'' +
                ", resumoAtividades='" + resumoAtividades + '\'' +
                '}';
    }
}
