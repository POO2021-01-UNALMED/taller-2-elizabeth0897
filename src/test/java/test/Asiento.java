package test;
public class Asiento {
	String color;
	int precio, registro;
	
	public void cambiarcolor(String color){
		if (color == "rojo" || color == "verde" || color == "amarillo" || color == "negro" || color == "blanco") {
				this.color = color;
		}
	}
}
