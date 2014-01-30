package RMIPackage;

import java.io.Serializable;

public class Espece implements Serializable {
	String race;
	int ageMoyen;
	public int getAgeMoyen() {
		return ageMoyen;
	}
	public void setAgeMoyen(int ageMoyen) {
		this.ageMoyen = ageMoyen;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	
	public Espece (){}
	public Espece (String s, int a){
		race= s;
		ageMoyen= a;
	}
	public void afficheEspece(){
		System.out.println("la race de l'espece est: "+race +"et son age est: "+ageMoyen);
	}

}
