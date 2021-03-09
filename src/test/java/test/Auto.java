package test;
public class Auto {
	String modelo, marca;
	int precio, registro; 
	static int cantidadCreados;
	Motor motor;
	Asiento[] asientos;
	
	public int cantidadAsientos () {
		int count = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				count = count + 1;
			}
			
		}
		return count;
	}
	
	public String verificarIntegridad() {
		String verificador = "Auto original";
		if(motor.registro != registro){
			verificador = "Las piezas no son originales";
			return verificador;
		}
		for(int i = 0; i < asientos.length;i++) {
			if((asientos[i] != null) && (asientos[i].registro != registro)){
				verificador = "Las piezas no son originales";
				break;
			}			
		}
		return verificador;
	}	        
}