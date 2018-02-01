/**
 * Created by BajLu1731402 on 22/01/2018.
 */
public class Contact {

    private String prenom;
    private String nom;
    private Adresse adresse;
    private Occupation occupation;
    private Telephone[] listeDeTelephones = new Telephone[10];

    public Contact() {

    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Telephone[] getListeDeTelephones() {
        return listeDeTelephones;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setListeDeTelephones(Telephone[] listeDeTelephones) {
        this.listeDeTelephones = listeDeTelephones;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
