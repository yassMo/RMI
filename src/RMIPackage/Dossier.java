package RMIPackage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Dossier extends Remote{
	public String getSuivi() throws RemoteException;
	public void setSuivi(String s) throws RemoteException;

}
