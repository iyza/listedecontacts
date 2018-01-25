/**
 * Created by BajLu1731402 on 22/01/2018.
 */
public class Adresse {

    private String numeroDePorte;
    private String rue;
    private String appartement;
    private String ville;
    private String province;
    private String pays;

    public void setNumeroDePorte(String numeroDePorte) {
        this.numeroDePorte = numeroDePorte;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setAppartement(String appartement) {
        this.appartement = appartement;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNumeroDePorte() {
        return numeroDePorte;
    }

    public String getRue() {
        return rue;
    }

    public String getAppartement() {
        return appartement;
    }

    public String getVille() {
        return ville;
    }

    public String getProvince() {
        return province;
    }

    public String getPays() {
        return pays;
    }
}
