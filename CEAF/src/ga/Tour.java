
package ga;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Tour extends Individual{
    
    List dna = new ArrayList<>();
    double fitness;
    
    public Tour(){
        
    }

    @Override
    public Individual mutacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double fitness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Individual crossover(Individual individuo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
