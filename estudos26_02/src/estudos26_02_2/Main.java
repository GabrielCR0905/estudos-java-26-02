package estudos26_02_2;

public class Main {

	public static void main(String[] args) {
		ContaBancaria  minhaconta = new ContaBancaria("Gabriel", 7000);
		
		minhaconta.exibirsaldo();
		minhaconta.depositar(200);
		minhaconta.sacar(100);
		minhaconta.sacar(700);

	}

}
