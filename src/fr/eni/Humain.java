package fr.eni;

public class Humain implements Animal,Siffleur{
	

    
	public Humain() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("Zzzzz");
	}
	
	@Override
	public void manger() {
		
	}
	
	@Override
	public void communiquer() {
		System.out.println("Bonjour");
	}
	
	public void siffler () {
		System.out.println("Pfiouiou");
	}

}
