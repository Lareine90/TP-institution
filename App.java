import java.util.*;
public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            Institution institution= new Institution("AAA", "BBB", "PRIVE", 2010);

            Universite univ1 = new Universite("XXX", "YYY", "PUBLIC", 2000, 4, "LMD", "ZZZ");
            Universite univ2 = new Universite("QQQ", "RRR", "PRIVE", 2009, 5, "Classique", "SSS");

            Ecole ecole1 = new Ecole("MAMA MULEZI" , "RDC", "PRIVE", 200, 30, "DAVID","PRIMAIRE");
            Ecole ecole2= new Ecole("LE VOLCAN", "RDC", "PRIVE", 2014, 34, "SDFGH", "SCONDAIRE");
            Ecole ecole3= new Ecole("DFG", "OUGANDA", "PUBLIC", 2016, 30, "GHJK", "sECONDAIRE");

            System.out.println("DESCRIPTION DE L'INSTITUTION ");
            System.out.println("******************************");
            System.out.println(institution.Description());

            System.out.println("DESCRIPTION D'UNE UNIVERSITE");
            System.out.println("****************************");
            
            System.out.println(univ1.Description());

            System.out.println("DESCRIPTION D'UNE ECOLE");
            System.out.println("***********************");
            
            System.out.println("LES PROMOTEURS DE 3 ECOLES ");
            System.out.println("***************************");
            Ecole.AffichePromoteur(ecole1, ecole2, ecole3);

            System.out.println("LES RECTEURS DE 2 UNIVERSITES ");
            System.out.println("***************************");
            Universite.AfficheRec(univ1, univ2);
            


    }
}
