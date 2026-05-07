package Model;

public class Gida extends Pertsona {

	public Gida(String nan, String izena, String rol, String email, String telefonoa, String pasahitza) {
		super(nan, izena, rol, email, telefonoa, pasahitza);		
	}
	public String DatuakAtera() {
			return "Gida [NAN=" + NAN + ", izena=" + izena + ", rol=" + rol + ", email=" + email + ", telefonoa="
					+ telefonoa + ", pasahitza=" + pasahitza + "]";
			 
		 }
}
