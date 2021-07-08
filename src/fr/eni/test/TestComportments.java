package fr.eni.test;

import fr.eni.Animal;
import fr.eni.Centaure;
import fr.eni.Cheval;
import fr.eni.Humain;
import fr.eni.Oiseau;

public class TestComportments {

	public static void main(String[] args) {
		
		Cheval tornado = new Cheval();
		tornado.communiquer();
		tornado.dormir();
		tornado.galoper();
		
		
		Humain zorro = new Humain();
		zorro.communiquer();
		zorro.dormir();
		zorro.siffler();
		
// DECOMMENTER POUR LA QUESTION 6 		
		Oiseau titi = new Oiseau();
		titi.siffler();
		titi.communiquer();
		titi.dormir();		

		Animal anonyme1 = tornado;
		anonyme1.communiquer();
		Animal anonyme2 = zorro;
		anonyme2.communiquer();
		
		Humain inconnu = (Humain) anonyme2;
		inconnu.siffler();
		
		Centaure chiron= new Centaure();
		chiron.communiquer();
		chiron.dormir();
		chiron.galoper();
		chiron.siffler();
	}
	


}
