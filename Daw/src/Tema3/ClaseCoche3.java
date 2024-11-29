package Tema3;

public class ClaseCoche3 {
	  private String sColor;
	  private int iVelocidad;
	  private double Tamano;
	  private int posicionX;
	  private int posicionY;
	/**
	 * @param sColor
	 * @param iVelocidad
	 * @param tamano
	 * @param posicionX
	 * @param posicionY
	 */
	public ClaseCoche3(String sColor, int iVelocidad, double tamano, int posicionX, int posicionY) {
		super();
		this.sColor = sColor;
		this.iVelocidad = iVelocidad;
		Tamano = tamano;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		
		
		
		
	}
	/**
	 * @return the sColor
	 */
	public String getsColor() {
		return sColor;
	}
	/**
	 * @param sColor the sColor to set
	 */
	public void setsColor(String sColor) {
		this.sColor = sColor;
	}
	/**
	 * @return the iVelocidad
	 */
	public int getiVelocidad() {
		return iVelocidad;
	}
	/**
	 * @param iVelocidad the iVelocidad to set
	 */
	public void setiVelocidad(int iVelocidad) {
		this.iVelocidad = iVelocidad;
	}
	/**
	 * @return the tamano
	 */
	public double getTamano() {
		return Tamano;
	}
	/**
	 * @param tamano the tamano to set
	 */
	public void setTamano(double tamano) {
		Tamano = tamano;
	}
	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}
	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}
	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
		
		
	}
	@Override
	public String toString() {
		return "ClaseCoche3 [sColor=" + sColor + ", iVelocidad=" + iVelocidad + ", Tamano=" + Tamano + ", posicionX="
				+ posicionX + ", posicionY=" + posicionY + ", getsColor()=" + getsColor() + ", getiVelocidad()="
				+ getiVelocidad() + ", getTamano()=" + getTamano() + ", getPosicionX()=" + getPosicionX()
				+ ", getPosicionY()=" + getPosicionY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	  
	  


}
