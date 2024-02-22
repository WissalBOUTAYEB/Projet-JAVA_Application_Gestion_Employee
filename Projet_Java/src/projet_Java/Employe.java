package projet_Java;
import java.util.Date;

public class Employe {
	
	private String nom;
	private double Salaire_par_Heure;
	private Date date_Embauche;
	
    public Employe(String nom,double Salaire_par_Heure,Date date_Embauche) {
		
		this.nom=nom;
		this.Salaire_par_Heure=Salaire_par_Heure;
		this.date_Embauche=date_Embauche;
	}
 

	public String getnom() {
		return nom;
	}
	
	public double getSalaire_par_Heure() {
		return Salaire_par_Heure;
	}
	public Date getdate_Embauche() {
		return date_Embauche;
		
	}
	
	public void setnom(String nom) {
		this.nom=nom;
	}
	
	public void setSalaire(double Salaire_par_Heure) {
		this.Salaire_par_Heure=Salaire_par_Heure;
	}
	
	public void setdate_Embauche(Date date_Embauche) {
		this.date_Embauche=date_Embauche;
	}
	
	public void afficher_Employee_Information() {
		
		System.out.println("le Nom de l'employee est"+getnom());
		System.out.println("le Salaire est  est"+getSalaire_par_Heure());
		System.out.println("la Date de l'Embauche est "+getdate_Embauche());
		
	}
	
	
	
	
	
	 public static void main(String[] args) {
		 
		 Employe Test= new  Employe("wissal",300,new Date(12/4/2026));
		 Test.afficher_Employee_Information();
		 
	 
	 }

	 
	 
	 
}
