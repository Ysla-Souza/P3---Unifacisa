package Pacote1;

import Pacote2.ClassePublic2;

public class ClassePublic1 {

	public void metodoPublic() {
		
	}
	
	protected void metodoProtected() {
		
	}
	
	void metodosDefault() {
		
	}
	
	private void metodoPrivate(){
		
	}

	public static void main(String[] args) {
		
		ClassePublic1 cp1 = new ClassePublic1();
		cp1.metodoPublic();
		cp1.metodoProtected();
		cp1.metodosDefault();
		cp1.metodoPrivate();
	
		//Não é possivel acessar
		//ClasseDefault2 cd2 = new ClasseDefault2();
		//cd2.metodoPublic();
		//cd2.metodoProtected();
		//cd2.metodosDefault();
		//cd2.metodoPrivate();
		
		ClassePublic2 cp2 = new ClassePublic2();
		cp2.metodoPublic();
		//cp2.metodoProtected();
		//cp2.metodosDefault();
		//cp2.metodoPrivate();
		
		ClasseDefault1 cd1 = new ClasseDefault1();
		cd1.metodoPublic();
		cd1.metodoProtected();
		cd1.metodosDefault();
		//cd1.metodoPrivate();
	}
}
