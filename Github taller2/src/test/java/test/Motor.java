package test;
public class Motor {
	int numeroCilindros, registro;
	String tipo;
	
	public void cambiarRegistro(int numero) {
		this.registro = numero;
	}
	
	void asignarTipo(String elctGas) {
		if (elctGas == "gasolina" || elctGas == "electrico") {
			this.tipo = elctGas;
		} 
	}
}