package projet_Java;
import java.util.List;
import java.util.ArrayList;


import java.util.Date;

public class Gestionnaire_Employee extends Employe  {
	private List <Employe> liste_Des_Employes;
	public Gestionnaire_Employee(String nom,double Salaire_par_Heure,Date date_Embauche) {
		super(nom,Salaire_par_Heure,date_Embauche);
		
		this.liste_Des_Employes=new ArrayList<>();
		
		
}
	
	// implimenter la fonction pour Ajouter Un Employee
	public void Ajouter_Employee(Employe mon_employe) {
		liste_Des_Employes.add(mon_employe);
		
	}
	
	//implimenter la fonction pour Supprimer Un Employee de Notre List
	public void Supprimer_Employee(Employe mon_employe) {
		liste_Des_Employes.remove(mon_employe);
	}
	
	// implimenter la fonction pour Afficher les Employees
	public void Afficher_Employee() {
		
		for (Employe mon_employe:liste_Des_Employes) {
			       
			System.out.println("Nom est "+getnom());
			System.out.println("Salaire par Heure  est "+getSalaire_par_Heure());
			System.out.println("Nom est "+getdate_Embauche());
			                    // Pour Iterer sur les Employees dans La list
		}
		
	}

	public static void main(String[] args) {
		
		// Test de notre Function
		Gestionnaire_Employee Employee1=new Gestionnaire_Employee("Wissal",3000,new Date(10/3/2023));
		Gestionnaire_Employee Employee2=new Gestionnaire_Employee("Meryam",2500,new Date(10/3/2021));
		Gestionnaire_Employee Employee3=new Gestionnaire_Employee("yasser",3500,new Date(10/3/2022));
		Gestionnaire_Employee Employee4=new Gestionnaire_Employee("Rajae",4000,new Date(10/3/2020));
		Employee1.Ajouter_Employee(Employee1);
		Employee2.Ajouter_Employee(Employee4);
		Employee2.Afficher_Employee();
		Employee2.Supprimer_Employee(Employee2);
		Employee2.Afficher_Employee();

	}

}
