package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class Composite extends Component {

    protected List<Component> children = new ArrayList<>();
    protected Component parent = null;
    /*
     * constructeur
     */
    public Composite(String nom) {
        // TODO Auto-generated constructor stub
        super(nom);
    }
    
    public List<Component> getChildren(){
        return children;
    }
    
    
    /**
     * Ajout component au composite
     * On definit la réference de component comme parent de component ajouté 
     */
    public void add(Component child) {
        children.add(child);
        child.setParent(this);
    }
    /**
     * Méthode overrider
     */
    @Override
    public void print() {
        // Parcours de la liste et  affichage de l'ensemble des enfants
        super.print();
        for(Component child : children)
            child.print();    
    }
    
    
    @Override
    public int getNombreLivres() {
        // TODO Auto-generated method stub
        int nbLivre =0;
        for(Component component : children)
            nbLivre += component.getNombreLivres();
        return nbLivre;
    }

    @Override
    public int getNombrePages() {
        // TODO Auto-generated method stub
        int nbPages = 0;
        for(Component component : children)
            nbPages += component.getNombrePages();
        return nbPages;
    }

}
