package parte_1.strategy;

public class FundoImobiliario implements Investimento {
  private double investimentoTotal;
  private double porcentagemPagamento;

  public FundoImobiliario(double investimento) {
    this.porcentagemPagamento = 0.2;
    this.investimentoTotal = investimento;
  }

  public double getInvestimentoTotal() {
    return this.investimentoTotal;
  }

  public void adicionarInvestimento(double investimento) {
    this.investimentoTotal += investimento;
  }

  public double calcularPagamento() {
    return this.investimentoTotal * this.porcentagemPagamento;
  }

  @Override
  public String toString() {
    return String.format("[Fundo Imobiliario]\nPorcentagem Pagamento: %.2f\nInvestimento Total: %.2f",
        this.porcentagemPagamento, this.investimentoTotal);
  }
}
