package fr.eni;

public class Cheval implements Animal{

	
	
	public Cheval() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("Zzzzz");
	}
	
	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void communiquer() {
		System.out.println("Hiiiihihihiiii");
	}
	
	public void galoper() {
		System.out.println("Cataclop, cataclop");
	}


}
