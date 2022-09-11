public class DatesEtCompagnie {


    public static void main(String[] args) {
        int annee = 16;
        if(estBissextile(annee)) {
            System.out.println("L'année "+annee+" est bissextile");
        } else {
            System.out.println("L'année "+annee+" n'est pas bissextile");
        }
    }


    /**
     *  @param annee une année
     *  @return vrai si l'année est bissextile, faux sinon
     */
    public static boolean estBissextile(int annee) {
        if ( annee%4==0 && annee%100!=0 || annee%400==0 )
        return true;
        else
        return false;
    }
    /**
 *  Détermine le nombre de jours dans un mois d'une année donnée
 *  @param mois
 *      mois
 *  @param annee
 *      année
 *  @return le nombre de jours dans le mois
 */
public static int nbJours(int mois, int annee) {
    if (mois==1 || mois==3 || mois==5 || mois==7 || mois==9 || mois==11 )
    return 31;
    if (mois==4 || mois==6 || mois==8 || mois==10 || mois==12)
    return 30;
    if (mois==2 && (annee%4==0 && annee%100!=0 || annee%400==0))
    return 29;
    else
    return 28 ;
}
/**
 *  Détermine si une date est valide
 *  @param jour
 *      jour de la date
 *  @param mois
 *      mois de la date
 *  @param annee
 *      année de la date
 *  @return vrai si la date est valide, faux sinon
 */
public static boolean estValide(int jour, int mois, int annee) {
    if (jour<1 || jour>31 || mois<1 || mois>12 || annee<1582) {
    return false;
    }
    return true ;
}
}

