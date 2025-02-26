package estudos26_02_03;

 class Pessoa {
	 String nome;
	 String cpf;
	 int idade;
	 
	 
	 
	 public Pessoa(String nome, String cpf, int idade) {
		 this.nome= nome;
		 this.cpf = cpf;
		 this.idade = idade;
		 
	 }

	 public void apresentar() {
		 System.out.print("Ola, meu nome é"+ nome+ " e tenho" + idade + "anos");
	 }
}
