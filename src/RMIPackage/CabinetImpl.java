package RMIPackage;

import java.awt.List;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class CabinetImpl extends UnicastRemoteObject implements Cabinet{
     ArrayList<Animal> l;//= new ArrayList <Animal>();
	protected CabinetImpl() throws RemoteException {
	   l= new ArrayList <Animal>();	
	}
	public Animal getAnimal(String nom){
		for( Animal e: l){
			try {
				if(e.getNom().equals(nom))
					{return e;}
			} catch (RemoteException e1) {
				
				e1.printStackTrace();
			}
		}
		return null;
	}
	public void addAnimal(Animal a){
		l.add(a);
	}
	public int getNbrAnimal(){
		return l.size();
	};
	public void afficherAnimals(){
		for(Animal e: l)
			try {
				e.afficherNom();
			} catch (RemoteException e1) {
				
				e1.printStackTrace();
			}
	};
	public void Synthese(Espece e){
		e.afficheEspece();
		
	};

}
