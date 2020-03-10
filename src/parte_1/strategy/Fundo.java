package parte_1.strategy;

public class Fundo implements Investimento {
  private double porcentagemPagamento;
  private double investimentoTotal;
  private int meses;

  public Fundo(double investimento, int meses) {
    this.investimentoTotal = investimento;
    this.meses = meses;
    if (meses < 6)
      this.porcentagemPagamento = 0.25;
    else if (meses >= 6 && meses < 12)
      this.porcentagemPagamento = 0.2;
    else
      this.porcentagemPagamento = 0.15;
  }

  public double calcularPagamento() {

    return this.investimentoTotal * this.porcentagemPagamento;
  }

  public void adicionarInvestimento(double investimento) {
    this.investimentoTotal += investimento;
  }
}
