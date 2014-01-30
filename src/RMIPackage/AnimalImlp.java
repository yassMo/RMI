package RMIPackage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;;

public class AnimalImlp extends UnicastRemoteObject implements Animal 
{
 DossierImpl fiche;	
 String nom;
 String nomMaitre;
 Espece espece;
 
 public AnimalImlp() throws RemoteException {}
 public AnimalImlp(String n, String nm) throws RemoteException {n=nom;nm=nomMaitre;}
 public AnimalImlp(String n, String nm,Espece e) throws RemoteException {n=nom;nm=nomMaitre;espece= e;}
 public void afficherNom() {
	 System.out.println("le nom de l'animal est"+nom+"ayant comme maitre"+nomMaitre);
 }
 
 public DossierImpl getFiche() {
	return fiche;
}
 public String getNom() {
	return nom;
}
 public void setNom(String nom) {
	this.nom = nom;
}
 public String getNomMaitre() {
	return nomMaitre;
}
	public Espece getEspece() {
		return espece;
	}
 public void setNomMaitre(String nomMaitre) {
	this.nomMaitre = nomMaitre;
}
 
}
