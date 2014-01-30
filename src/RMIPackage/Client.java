package RMIPackage;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client implements Runnable {
	private Client(){}
	public static void main(String[]args)
	{ String host= (args.length<1)? null : args[0];
		try{
			Client c=new Client();
			new Thread(c).start();
			
			if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new RMISecurityManager());
	        }
			Registry r= LocateRegistry.getRegistry(host);
            Animal stubA = (Animal) r.lookup("animal1"); 	
			stubA.afficherNom();
			//exercice 4
			stubA.getFiche().setSuivi("le dossier de suivi de l'animal1");
			System.out.println("voila le dossier de suivi de l'animal1: "+stubA.getFiche().getSuivi());
	        //version2
			Cabinet stubC=(Cabinet) r.lookup("cabinet1");
			stubC.getNbrAnimal();
			stubC.afficherAnimals();
	
	}catch (Exception e){
		System.err.println("Server exception: " +e.toString());
		e.printStackTrace();}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
