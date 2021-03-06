package sample.Test;

import org.junit.Test;
import sample.Model.Arete;
import sample.Model.Sommet;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mathieu on 06/02/2017.
 */
public class AreteTest {
    @Test
    public void testAjoutArete() throws Exception {
        Sommet depart = new Sommet(true,1,1);
        Sommet arriveeF = new Sommet(false,2,2);
        Sommet arrivee = new Sommet(true,3,3);

        Arete arete = new Arete(true,depart,arriveeF);
        assertEquals(arete.id(),-1);
        assertEquals(arete.valide(),false);

        Arete arete2 = new Arete(true,depart,arrivee);
        assertEquals(arete2.valide(),true);
        assertEquals(arete2.id(),0);
    }

    @Test
    public void testSuppressionArete() throws Exception {
        Sommet depart = new Sommet(true,4,4);
        Sommet arrivee = new Sommet(true,4,4);

        Arete arete = new Arete(true,depart,arrivee);
        assertEquals(arete.valide(),true);

        arete.supprimer();
        assertEquals(arete.valide(),false);
        assertEquals(arete.id(),-1);
    }
}