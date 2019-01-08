package Bibliotheque;

import java.util.Collections;

public class Livre extends Component {

    protected int nombrePages;
    


    public Livre(String nom, int nombrePages) {
        super(nom);
        //this.nom = nom;
        // TODO Auto-generated constructor stub
        this.nombrePages = nombrePages;
    }

    @Override
    public int getNombreLivres() {
        // TODO Auto-generated method stub
        return 1;
    }

    @Override
    public int getNombrePages() {
        // TODO Auto-generated method stub
        return nombrePages;
    }
    
    @Override
    public void print() {
        System.out.println(String.join(" ", Collections.nCopies(getLevel(), " ")) + nom + ":" + nombrePages + "pages");
    }

}
