package Super;

public class PesoCaja extends Caja {

	double peso;

	PesoCaja(PesoCaja ob) {
		super(ob);
		peso = ob.peso;
	}

	PesoCaja(double w, double h, double d, double m) {
		super(w, h, d);
		peso = m;
	}

	PesoCaja() {
		super();
		peso = -1;
	}

	PesoCaja(double lon, double m) {
		super(lon);
		peso = m;
	}

}
