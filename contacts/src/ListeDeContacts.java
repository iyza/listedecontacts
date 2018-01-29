import java.util.Scanner;

/**
 * Created by BajLu1731402 on 22/01/2018.
 */
public class ListeDeContacts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean menu = true;
        boolean changeInfo = true;
        boolean changeRue = true;
        boolean changeProvince = true;
        boolean changePays = true;
        boolean infoValide = false;
        boolean texteDisparait = false;
        boolean texteDisparait2 = false;
        int choix;
        int choix2;
        int choix3;
        String information;
        String majuscule;
        Contact contact[] = new Contact[20];
        int contacts = 0;

        for (int i=0;i<20;i++) {
            contact[i] = new Contact();
        }

        line();line();line();
        System.out.println("====================================");
        System.out.println("BIENVENUE A VOTRE LISTE DE CONTACTS");
        System.out.println("====================================");
        line();line();line();

        System.out.println("Que voulez vous faire?");

        while (menu) {
            changeInfo = true;
            infoValide = false;

            line();line();
            System.out.println("Il vous reste " + (20-contacts) + " espaces dans votre liste de contacts.");
            line();
            System.out.println(" 1 - Ajouter un contact");
            System.out.println(" 2 - Modifier un contact");
            System.out.println(" 3 - Afficher les contacts");
            System.out.println(" 4 - Quitter");
            line();
            System.out.println("PS : essaie de ne pas utiliser des espaces :)");
            line();
            choix = sc.nextInt();
            line();line();

            switch (choix) {
                case 1 :
                    Adresse adresse = new Adresse();
                    Occupation occupation = new Occupation();
                    Entreprise entreprise = new Entreprise();
                    while (changeInfo) {
                        System.out.println("Quel est le prenom de votre contact :");
                        information = sc.next();
                        line();
                        information = information.toLowerCase();
                        for (int i=0;i<information.length();i++) {
                            if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                line();
                                System.out.println("Vous avez entrez des characters invalides (lettres seulement).");
                                line();
                                i = 999;
                                infoValide = false;
                            }
                            else {
                                infoValide = true;
                            }
                        }
                        if (infoValide) {
                            majuscule = information.substring(0,1).toUpperCase() + information.substring(1);
                            contact[contacts].setPrenom(majuscule);
                            changeInfo = false;
                        }
                    }
                    changeInfo = true;
                    while (changeInfo) {
                        System.out.println("Quel est le nom de votre contact :");
                        information = sc.next();
                        line();
                        information = information.toLowerCase();
                        for (int i=0;i<information.length();i++) {
                            if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                line();
                                System.out.println("Vous avez entrez des characters invalides (lettres seulement).");
                                line();
                                i = 999;
                                infoValide = false;
                            }
                            else {
                                infoValide = true;
                            }
                        }
                        if (infoValide) {
                            majuscule = information.substring(0,1).toUpperCase() + information.substring(1);
                            contact[contacts].setNom(majuscule);
                            changeInfo = false;
                        }
                    }
                    changeInfo = true;
                    while (changeInfo) {
                        System.out.println("Quelle information voulez vous enregistrer?");
                        if (!texteDisparait) {
                            System.out.println(" 1 - Numero de porte et rue");
                            System.out.println(" 2 - Numero d'appartement et rue");
                        }
                        if (!texteDisparait2) {
                            System.out.println(" 3 - Ville, province et pays");
                        }
                        System.out.println(" 4 - C'est tout");
                        choix2 = sc.nextInt();
                        line();
                        switch (choix2) {
                            case 1:
                                if (!texteDisparait) {
                                    // num de maison
                                    System.out.println("Quel est le numero de maison de " + contact[contacts].getPrenom() + " " + contact[contacts].getNom() + "?");
                                    information = sc.next();
                                    for (int i = 0; i < information.length(); i++) {
                                        if (information.charAt(i) < '0' || information.charAt(i) > '9') {
                                            line();
                                            System.out.println("Vous avez entrez des characters invalides (numberos seulement).");
                                            line();
                                            i = 999;
                                            infoValide = false;
                                        } else {
                                            infoValide = true;
                                        }
                                    }
                                    if (infoValide) {
                                        adresse.setNumeroDePorte(information);

                                        // rue
                                        while (changeRue) {
                                            System.out.println("Quel est le nom de la rue de votre contact?");
                                            information = sc.next();
                                            line();
                                            information = information.toLowerCase();
                                            for (int i=0;i<information.length();i++) {
                                                if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                                    line();
                                                    System.out.println("Vous avez entrez des characters invalides (lettres, chiffres et espaces seulement).");
                                                    line();
                                                    i = 999;
                                                    infoValide = false;
                                                }
                                                else {
                                                    infoValide = true;
                                                }
                                            }
                                            if (infoValide) {
                                                adresse.setRue(information);
                                                texteDisparait = true;
                                                changeRue = false;
                                            }
                                        }

                                    }
                                }
                                else System.out.println("Choix invalide.");
                                break;

                            case 2:
                                if (!texteDisparait) {
                                    System.out.println("Quel est le numero de l'appartement de " + contact[contacts].getPrenom() + " " + contact[contacts].getNom() + "?");
                                    information = sc.next();
                                    for (int i = 0; i < information.length(); i++) {
                                        if ((information.charAt(i) < '0' || information.charAt(i) > '9') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                            line();
                                            System.out.println("Vous avez entrez des characters invalides (numeros seulement).");
                                            line();
                                            i = 999;
                                            infoValide = false;
                                        } else {
                                            infoValide = true;
                                        }
                                    }
                                    if (infoValide) {
                                        adresse.setAppartement(information);
                                        texteDisparait = true;
                                    }
                                }
                                else System.out.println("Choix invalide.");
                                break;

                            case 3:
                                System.out.println("Dans quelle ville se situe votre contact?");
                                information = sc.next();
                                for (int i = 0; i < information.length(); i++) {
                                    if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                        line();
                                        System.out.println("Vous avez entrez des characters invalides (lettres seulement).");
                                        line();
                                        i = 999;
                                        infoValide = false;
                                    } else {
                                        infoValide = true;
                                    }
                                }
                                if (infoValide) {
                                    adresse.setVille(information);

                                    while (changeProvince) {
                                        System.out.println("Dans quelle province se situe votre contact?");
                                        information = sc.next();
                                        for (int i = 0; i < information.length(); i++) {
                                            if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                                line();
                                                System.out.println("Vous avez entrez des characters invalides (lettres seulement).");
                                                line();
                                                i = 999;
                                                infoValide = false;
                                            } else {
                                                infoValide = true;
                                            }
                                        }
                                        if (infoValide) {
                                            adresse.setProvince(information);
                                            changeProvince = false;

                                            while (changePays) {
                                                System.out.println("Dans quelle pays se situe votre contact?");
                                                information = sc.next();
                                                for (int i = 0; i < information.length(); i++) {
                                                    if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                                        line();
                                                        System.out.println("Vous avez entrez des characters invalides (lettres seulement).");
                                                        line();
                                                        i = 999;
                                                        infoValide = false;
                                                    } else {
                                                        infoValide = true;
                                                    }
                                                }
                                                if (infoValide) {
                                                    adresse.setPays(information);
                                                    changePays = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;

                            case 4:
                                changeInfo = false;
                                break;

                            default:
                                System.out.println("Choix invalid.");
                        }
                    }
                    contact[contacts].setAdresse(adresse);
                    changeInfo = true;
                    while (changeInfo) {
                        System.out.println("Quel est le poste de travail de " + contact[contacts].getPrenom() + " " + contact[contacts].getNom() + "?");
                        information = sc.next();
                        for (int i = 0; i < information.length(); i++) {
                            if ((information.charAt(i) < 'a' || information.charAt(i) > 'z') && information.charAt(i) != '-' && information.charAt(i) != ' ') {
                                line();
                                System.out.println("Vous avez entrez des characters invalides (lettres seulement).");
                                line();
                                i = 999;
                                infoValide = false;
                            } else {
                                infoValide = true;
                            }
                        }
                        if (infoValide) {
                            occupation.setPoste(information);
                            changeInfo = false;
                        }
                    }
                    occupation.setEntreprise(entreprise);
                    contact[contacts].setOccupation(occupation);
                    changeInfo = true;

                    break;

                case 2 :



                    break;

                case 3 :
                    System.out.println("Voici la liste de vos contacts :");
                    line();line();
                    for (int i=0;i<(contacts+1);i++) {
                        System.out.println(" " + (contacts+1) + " - " + contact[i].getPrenom() + " " + contact[i].getNom());
                        System.out.println("Rue et numero de porte : " + contact[i].getAdresse().getRue() + " " + contact[i].getAdresse().getNumeroDePorte());
                        System.out.println("Apartement : " + contact[i].getAdresse().getAppartement());
                        System.out.println("Ville, province et pays : " + contact[i].getAdresse().getVille() + ", " + contact[i].getAdresse().getProvince() + ", " + contact[i].getAdresse().getPays());
                    }

                    break;

                case 4 :
                    System.out.println("A la prochaine!");
                    System.exit(0);
                    break;

                default :
                    System.out.println("Choix invalide, voulez choisir un nombre entre 1 et 4");
                    break;
            }
        }
    }

    private static void line() {
        System.out.println();
    }

}
