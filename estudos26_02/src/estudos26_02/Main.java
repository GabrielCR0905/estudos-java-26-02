package estudos26_02;

public class Main {

	public static void main(String[] args) {
		Carro meuCarro = new Carro("Toyota","Corolla", 2022);

		meuCarro.exibirinformacoes();
		meuCarro.acelerar(20);
		meuCarro.frear(20);
	}

}
