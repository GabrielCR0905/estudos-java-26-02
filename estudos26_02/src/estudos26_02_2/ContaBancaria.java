package estudos26_02_2;

 class ContaBancaria {
	 String titular;
	 double saldo;
	 
	 public ContaBancaria(String titular,double saldoinicial) {
		 this.titular = titular;
		 this.saldo =saldoinicial;
	 }

	 public void depositar(double valor) {
		 saldo += valor;
		 System.out.print("Deposito de 	R$ "+ valor + "Realizado. Saldo atual: R$" + saldo);
	 }
	 
	 public void sacar(double valor) {
		 if(valor > saldo) {
			 System.out.print("Saldo Insuficiente");
		 }else {	
			saldo -= valor;
			System.out.print("saque de r$" + valor +  "realizado, saldo: " + saldo);
		 }
		 }
	 public void exibirsaldo() {
		 System.out.print("titular: " + titular + "saldo:  " + saldo);
	 }
}
