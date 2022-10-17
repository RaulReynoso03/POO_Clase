package Caja;

public class Caja {

	double ancho;
	double alto;
	double largo;
	
	Caja(Caja ob){
		ancho=ob.ancho;
		alto=ob.alto;
		largo=ob.largo;
	}
	
	Caja (double w,double h,double d){
		
		ancho=w;
		alto=h;
		largo=d;
	}Caja(){
		ancho=-1;
		alto=-1;
		largo=-1;
	}Caja(double ion){
		ancho=alto=largo=ion;		
	}double volumen(){
		return ancho*alto*largo;
	}

}
