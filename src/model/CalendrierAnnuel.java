package model;

public class CalendrierAnnuel {

	private int[] calendrier;
	
	public CalendrierAnnuel() {
		calendrier = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	}
	
	public boolean estLibre(int jour, int mois) {
	
		return true;
	}
	
	public boolean reserver(int jour, int mois) {
		if(!estLibre(jour, mois))
			return false;
		
		return true;
	}
	
	
	private static class Mois {

		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		
		private boolean estLibre(int jour) {
			
			return true;
		}
		
		private void reserver(int jour) {
			try {
				
			} catch (illegalStateException e) {
				return e;
			}
		}
		
	}
	
	
}
