package Model;

public class Bezeroa extends Pertsona {

	public Bezeroa(String nan, String izena, String rol, String email, String telefonoa, String pasahitza) {
		super(nan, izena, rol, email, telefonoa, pasahitza);

	}
	public String DatuakAtera() {
		return "Pertsona [NAN=" + NAN + ", izena=" + izena + ", rol=" + rol + ", email=" + email + ", telefonoa="
				+ telefonoa + ", pasahitza=" + pasahitza + "]";
	}
}
