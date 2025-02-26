package estudos26_02;

public class Carro {
	String marca;
	String modelo;
	int ano;
	double velocidadeAtual;
	
	public Carro(String marca,String modelo, int ano) {
		this.marca= marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual= 0.0;
		
	}
	public void acelerar(double incremento) {
		velocidadeAtual += incremento;
		System.out.print("Acelerando...  Velocidade Atual: " + velocidadeAtual + "Kmh");
	}

	public void frear(double descremento) {
		if(velocidadeAtual - descremento < 0) {
			velocidadeAtual = 0;
			
		}else {
			velocidadeAtual -= descremento;
		}
		System.out.print("Voce Freou..."+ velocidadeAtual + "Kmh") ;
	}
	public void  exibirinformacoes() {
		System.out.print("Carro" + marca + "" + modelo +  " - ano :" + ano);
	}
}
