package RMIPackage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierImpl extends UnicastRemoteObject implements Dossier {
     String suivi;
	protected DossierImpl() throws RemoteException {
		}

	@Override
	public String getSuivi() throws RemoteException {
		// TODO Auto-generated method stub
		return suivi;
	}

	public void setSuivi(String s) throws RemoteException {
		suivi= s;
	}
	
}
