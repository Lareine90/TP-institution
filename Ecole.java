class Ecole extends Institution {
    private int nbreClasses;
    private String  promoteur;
    private String Type ;

    public Ecole (String NomInst, String PaysInst, String TypeInst, int Annee, int nbreClasses,String promoteur, String Type ){
        super(NomInst, PaysInst, TypeInst, Annee);
        this.nbreClasses=nbreClasses;
        this.promoteur=promoteur;
        this.Type=Type;

    }

    public int getnbreClasses(){
        return nbreClasses;
    }
    public String getPromoteur(){
        return promoteur;
    }
    public String getType(){
        return Type;
    }
    
    public void setnbreClasses (int nbreClasses){
        this.nbreClasses = nbreClasses ;
    }
    public void setPromoteur (String promoteur ){
        this.promoteur = promoteur ;
    }
    public void setType (String Type){
        this.Type = Type ;
    }
    public static void AffichePromoteur(Ecole ecole1,Ecole ecole2, Ecole ecole3){
        System.out.println("Nom promoteur de "+ ecole1.getNomInst ()+ ": " + ecole1.getType());
        System.out.println("Nom du promoteur de "+ ecole2.getNomInst ()+ ": " + ecole2.getType());
        System.out.println("Nom du promoteur de" + ecole2.getNomInst ()+ ": " + ecole2.getType());

    }
    public String DescriptionEcole(){
        int age = AgeInst();
        return "Nom: "+ NomInst+
                "\n Pays: "+ PaysInst +
                "\n Type: "+ TypeInst +
                "\n age de l'institut: "+ age + "ans "+
                "\n nombre de classe : "+ nbreClasses +
                "\n nombre de promotteur"+ promoteur +
                "\n nom du Type(primaire ou secondaire): "+ Type;
    }
    

}