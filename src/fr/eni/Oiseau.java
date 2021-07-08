package fr.eni;

public class Oiseau implements Animal,Siffleur{


	public void dormir() {
		System.out.println("Zzzzzzzzz");
	}
	@Override
	public void communiquer() {
		siffler();
	}
	
	public void siffler () {
		System.out.println("Triliiiliiiiouuu");
	}
	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}

}
