package RMIPackage;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Animal extends Remote {
	public void afficherNom() throws RemoteException ;
	public String getNom() throws RemoteException;
	public DossierImpl getFiche()throws RemoteException;
	public Espece getEspece()throws RemoteException;

}
