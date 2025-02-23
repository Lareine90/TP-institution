class Universite extends Institution {
    private int nbrefac;
    private String SE;
    private String recteur ;

    public Universite (String NomInst, String PaysInst, String TypeInst, int Annee, int nbrefac,String SE, String recteur ){
        super(NomInst, PaysInst, TypeInst, Annee);
        this.nbrefac=nbrefac;
        this.SE=SE;
        this.recteur=recteur;

    }

    public int getnbrefac(){
        return nbrefac;
    }
    public String getSE(){
        return SE;
    }
    public String getrecteur(){
        return recteur;
    }
    
    public void setnbrefac (int nbrefac){
        this.nbrefac = nbrefac ;
    }
    public void setSE (String SE ){
        this.SE = SE ;
    }
    public void setrecteur (String recteur){
        this.recteur = recteur ;
    }
    public static void AfficheRec(Universite univ1,Universite univ2){
        System.out.println("recteur de "+ univ1.getNomInst ()+ ": " + univ1.getrecteur());
        System.out.println("recteur de "+ univ2.getNomInst ()+ ": " + univ2.getrecteur());

    }
    public String Description(){
        int age = AgeInst();
        return "Nom: "+ NomInst+
                "\n Pays: "+ PaysInst +
                "\n Type: "+ TypeInst +
                "\n age de l'institut: "+ age + "ans "+
                "\n nombre de faculte : "+ nbrefac +
                "\n systeme d'education(LMD ou classique): "+ SE +
                "\n nom du recteur: "+ recteur;
    }
    

}