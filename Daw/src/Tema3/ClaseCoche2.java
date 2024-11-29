package Tema3;

public class ClaseCoche2 {
	  private String sColor;
	  private int iVelocidad;
	  private double Tamano;
	  private int posicionX;
	  private int posicionY;

	  public ClaseCoche2(String sColor, int iVelocidad, double sTamano, int posicionX, int posicionY) {
		super();
		this.sColor = sColor;
		this.iVelocidad = iVelocidad;
		this.Tamano = sTamano;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		
		
		
		
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public int getiVelocidad() {
		return iVelocidad;
	}

	public void setiVelocidad(int iVelocidad) {
		this.iVelocidad = iVelocidad;
	}

	public double getTamano() {
		return Tamano;
	}

	public void setsTamano(double Tamano) {
		this.Tamano = Tamano;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	  
}
	