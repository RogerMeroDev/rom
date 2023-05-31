/**
 * 
 */
package fin.coop1504.tallerjava.entidades;

/**
 * @author racastillo
 *
 */
public class Persona {

	protected String nombre;
	protected String identificacion;
	//protected String tipoIdentificacion;

	public Persona() {
		super();
		System.out.println("Usando el constructor sin parametros");
	}



	public Persona(String nombre, String identificacion) {
		super();
		System.out.println("Usando el constructor con parametros");
		this.nombre = nombre;
		this.identificacion = identificacion;
	}



		@Override
	    public String toString() {
	        return "Nombre: " + nombre +
	               ", Identificación: " + identificacion;
	    }



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getIdentificacion() {
			return identificacion;
		}



		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}
		
		
		

}
