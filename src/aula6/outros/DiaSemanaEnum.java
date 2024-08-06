package aula6.outros;

public enum DiaSemanaEnum {
	DOMINGO("Domingo") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return true;
		}
	},
	SEGUNDA("Segunda-feira") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return false;
		}
	},
	TERCA("Terça-feira") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return false;
		}
	},
	QUARTA("Quarta-Feira") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return false;
		}
	},
	QUINTA("Quinta-Feira") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return false;
		}
	},
	SEXTA("Sexta-Feira") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return false;
		}
	},
	SABADO("Sábado") {
		@Override
		public boolean isFimDeSemana() {
			// TODO Auto-generated method stub
			return true;
		}
	};
	
	private String diaDaSemana;
	
	DiaSemanaEnum(String diaDaSemana){
		this.diaDaSemana = diaDaSemana;
	}
	
	public String getdiaDaSemana() {
		return diaDaSemana;
		
	
	}
	public abstract boolean isFimDeSemana();
	
}
