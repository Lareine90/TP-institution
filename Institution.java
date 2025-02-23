    public class Institution {
        protected String NomInst;
        protected String PaysInst;
        protected String TypeInst;
        protected int Annee;

        public Institution (String NomInst, String PaysInst, String TypeInst, int Annee){
            this.NomInst=NomInst;
            this.PaysInst=PaysInst;
            this.TypeInst=TypeInst;
            this.Annee=Annee;
        }
    
        public String getNomInst(){
            return NomInst;
        }
        public String getPaysInst(){
            return PaysInst;
        }
        public String getTypeInst(){
            return TypeInst;
        }
        public int getAnnee(){
            return Annee;
        }

        public void setNomInst (String NomInst){
            this.NomInst = NomInst ;
        }
        public void setPaysInst (String PaysInst){
            this.PaysInst = PaysInst ;
        }
        public void setTypeInst (String TypeInst){
            this.TypeInst = TypeInst ;
        }
        public void setAnne (int Annee){
            this.Annee = Annee ;
        }

        public int AgeInst(){
            int AnneeActuel = java.time.Year.now().getValue();
            return AnneeActuel-Annee;
    
        }
        public String Description(){
            int age = AgeInst();
            return "Nom: "+ NomInst+
                    "\n Pays: "+ PaysInst +
                    "\n Type: "+ TypeInst +
                    "\n age de l'institut "+ age + "ans ";
        }
    }