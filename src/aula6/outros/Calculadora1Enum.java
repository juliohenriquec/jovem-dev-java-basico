package aula6.outros;

public enum Calculadora1Enum {
	SOMA("Soma") {
        @Override
        public int calcula(int a, int b) {
            return a + b;
        }
    },
    SUBTRACAO("Subtração") {
        @Override
        public int calcula(int a, int b) {
            return a - b;
        }
    },
    DIVISAO("Divisão") {
        @Override
        public int calcula(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida");
            }
            return a / b;
        }
    },
    MULTIPLICACAO("Multiplicação") {
        @Override
        public int calcula(int a, int b) {
            return a * b;
        }
    };

    private final String nomeAmigavel;

    Calculadora1Enum(String nomeAmigavel) {
        this.nomeAmigavel = nomeAmigavel;
    }

    public String getNomeAmigavel() {
        return nomeAmigavel;
    }

    public abstract int calcula(int a, int b);

	String getNomeAmigavel1() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
