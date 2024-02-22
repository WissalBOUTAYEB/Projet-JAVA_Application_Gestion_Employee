package projet_Java;

import java.util.Date;

public class Gestion_Des_Salaires extends Employe {
	
	private int  primes;
	private int nombre_des_heures_de_Travaille;
	private String role;
	
  public Gestion_Des_Salaires(String nom,double Salaire_par_Heure,Date date_Embauche,int primes,int nombre_des_heures_de_Travaille,String role ){
		
		super(nom,Salaire_par_Heure,date_Embauche);
		
		this.primes=primes;
		this.nombre_des_heures_de_Travaille=nombre_des_heures_de_Travaille;
		this.role=role;
		
		
	}
	
	public int getprimes() {
		return primes;
	}
	
	public int getnombre_des_heures_de_Travaille() {
		return nombre_des_heures_de_Travaille;
	}
	
	public String getrole() {
		return role;
	}
	public void setprimes(int primes) {
		this.primes=primes;
		
	}
	public void setnombre_des_heures_de_Travaille(int nombre_des_heures_de_Travaille) {
		
		this.nombre_des_heures_de_Travaille=nombre_des_heures_de_Travaille;
	}
	
	public void setrole(String role) {
		
		this.role=role;
	}
	
	// calcul de la Salaire 
	
	public double Calculer_Salaire() {
		return getSalaire_par_Heure()*getnombre_des_heures_de_Travaille() + getprimes();
	}
	
	

	public static void main(String[] args) {
		
		// Test 
		Gestion_Des_Salaires Test=new Gestion_Des_Salaires("Wissal",2000,new Date(17/12/2027),170,6,"chef_de_Projet");
		System.out.println(Test.Calculer_Salaire());

	}

}
