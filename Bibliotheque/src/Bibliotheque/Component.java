package Bibliotheque;

import java.util.Collections;

public abstract class Component {
    

        protected  String nom; // nom de l'�l�ment
        // r�f�rence du parent dans l'enfant pour �tablir une hierarchie
        protected Component parent = null; 

      //Constructeur
        public Component(String nom) {
            super();
            this.nom = nom;
        }

        /*      Affiche une cha�ne de caract�res contenant :
        Une tabulation refl�tant le niveau de profondeur de l'�l�ment dans la hi�rarchie.
        Le nom de l'�l�ment
        Le nombre de livres contenus dans l'�l�ment (ou ses descendants)
        Le nombre de pages des livres contenus dans l'�l�ment (ou ses descendants)
         */     
        public void print() {
                System.out.println(String.join("", Collections.nCopies(getLevel(), "  ")) 
                                + nom + " : " + getNombreLivres() + " livres, " +  getNombrePages() + " pages"  );

        }

        /**
         * Permet d'ajouter un composant
         * @param c le component � ajouter
         */
        public void add(Component c){

        }

        //GETTERS & SETTERS
        public abstract int getNombreLivres();

        public abstract int getNombrePages();


        public Component getParent(){
                return parent; 
        }

        public void setParent(Component parent){
                this.parent = parent; 
        }

        /**
         * d�termine le niveau de profondeur du component en fonction du niveau de son parent
         * @return le niveau du component
         */
        public int getLevel(){
                return parent == null ? 0 : parent.getLevel() + 1;
        }
    }


