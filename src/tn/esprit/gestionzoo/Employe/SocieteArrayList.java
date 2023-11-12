package tn.esprit.gestionzoo.Employe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe emp1, Employe emp2) {
                int compareNom = emp1.getNom().compareTo(emp2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }

                int compareDepartement = emp1.getNomDepartement().compareTo(emp2.getNomDepartement());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }

                return Integer.compare(emp1.getGrade(), emp2.getGrade());
            }
        });
    }
}
