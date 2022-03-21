
public class Controle {

		// ATRIBUTOS
		private String agencia;
		private String conta;
		private String telefone;
		private String nome;
		private String email; 
		private double saldo;
		
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public String getConta() {
			return conta;
		}
		public void setConta(String conta) {
			this.conta = conta;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
		// CADASTRO
//		public ControleDados(String agencia, String conta, String nome, String email, String telefone, double saldo) {
//			this.agencia = agencia;
//			this.conta = conta;
//			this.nome = nome;
//			this.email = email; 
//			this.telefone = telefone;
//			this.saldo = saldo;
//		}

//		public String toString() {
//			return "Agencia: " + getAg() + ", conta: " + getConta() + ", cliente: " + getNome() + ", e-mail: " + getEmail() + ", telefone: " + getTelefone() + ", saldo: " + String.format("R$%.2f", getSaldo());
//		}
		
		
	

}
