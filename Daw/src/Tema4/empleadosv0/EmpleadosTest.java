package Tema4.empleadosv0;

public class EmpleadosTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directivo direc = new Directivo ("2w","Luis Maroto","Gestión");
		Comercial comerc = new Comercial("3A","Carlos Torres",23.2);
		Tecnico tec = new Tecnico("4J","Eloy Planes");
		System.out.println(direc.toString()+comerc+tec);

	}

}
