package Bibliotheque;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Component node1 = new Composite("Bibliothèque 1");
        Component node1_1 = new Composite("Pièces 1");
        Component node1_1_1 = new Composite("Etagère 1_1");
        Component node1_1_1_1 = new Livre("Livre 1", 200);
        Component node1_1_1_2 = new Livre("Livre 2", 375);
        Component node1_1_1_3 = new Livre("Livre 3", 250);
        Component node1_1_2 = new Composite("Etagère 1_2");
        Component node1_1_2_1 = new Livre("Livre 4", 404);
        Component node1_1_2_2 = new Livre("Livre 5", 500);
        Component node1_2 = new Composite("Pièces 2");
        Component node1_2_1 = new Composite("Etagère 2_1");
        Component node1_2_1_1 = new Livre("livre 6", 75);
        Component node1_2_1_2 = new Livre("livre 7", 75);
        Component node1_2_2 = new Composite("Etagère 2_2");
        Component node1_2_2_1 = new Livre("livre 8", 75);
        Component node1_2_3 = new Composite("Etagère 2_3");
        Component node1_2_3_1 = new Livre("livre 9", 75);
        Component node1_2_3_2 = new Livre("livre 10", 600); 
        
      //Pièce 1
        node1.add(node1_1);
        //Etagere 1_1
        node1_1.add(node1_1_1);
        node1_1_1.add(node1_1_1_1);
        node1_1_1.add(node1_1_1_2);
        node1_1_1.add(node1_1_1_3);

        //Etagère 1_2
        node1_1.add(node1_1_2);
        node1_1_2.add(node1_1_2_1);
        node1_1_2.add(node1_1_2_2);


        //Pièce 2
        node1.add(node1_2);
        //Etagere 2_1
        node1_2.add(node1_2_1);
        node1_2_1.add(node1_2_1_1);
        node1_2_1.add(node1_2_1_2);

        //Etagere 2_2
        node1_2.add(node1_2_2);
        node1_2_2.add(node1_2_2_1);

        //Etagere 2_3
        node1_2.add(node1_2_3);
        node1_2_3.add(node1_2_3_1);
        node1_2_3.add(node1_2_3_2);



        // Affiche la hierarchie
        node1.print();
    }

}
