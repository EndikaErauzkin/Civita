package Model;

public class Admin extends Pertsona {

public Admin(String nan, String izena, String rol, String email, String telefonoa, String pasahitza) {
		super(nan, izena, rol, email, telefonoa, pasahitza);		
	}

 public String DatuakAtera() {
	return "Admin [NAN=" + NAN + ", izena=" + izena + ", rol=" + rol + ", email=" + email + ", telefonoa="
			+ telefonoa + ", pasahitza=" + pasahitza + "]";
	 
 }
 
}
