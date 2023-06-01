
public class ContaInvestimento extends ContaBancaria {

	@Override
	public double calcularSaldo() {
		return saldo + (saldo * 0.05);
	}

}
