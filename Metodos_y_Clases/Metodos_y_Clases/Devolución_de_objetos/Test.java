package Devolución_de_objetos;

public class Test {
	int a;
	
	Test(int i){
		a=i;
	}
	
	Test increDiez() {	
		Test temp=new Test(a+10);
		return temp;
		
	}
}
