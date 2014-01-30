package RMIPackage;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {
	public Serveur(){}
	public static void main(String[]args)
	{try{
		 /*if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new RMISecurityManager());
	            System.out.println("Security manager installed.");
	        } else {
	            System.out.println("Security manager already exists.");
	        }*/
	Espece e = new Espece("chien", 4);
	AnimalImlp a = new AnimalImlp("lolo","hamid",e);
	CabinetImpl c= new CabinetImpl();
	c.addAnimal(a);
	Registry r= LocateRegistry.createRegistry(1099);
	//Registry r= LocateRegistry.getRegistry();
	if(r == null){ System.err.println("Rmiregistry not found");}
	else {
		r.rebind("animal1", a);
		r.bind("cabinet1",c);
		System.err.println("Server ready");
	}
	
	}catch (Exception e){
		System.err.println("Server exception: " +e.toString());
		e.printStackTrace();}
	}

}
