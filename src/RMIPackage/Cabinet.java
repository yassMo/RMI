package RMIPackage;

import java.rmi.Remote;

public interface Cabinet extends Remote {
	public Animal getAnimal(String nom);
	public int getNbrAnimal();
	public void afficherAnimals();
	public void Synthese(Espece e);
	public void addAnimal(Animal a);
}
