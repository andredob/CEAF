
package ga;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Population {
    
    List population = new ArrayList<Population>();
    List elite = new ArrayList<Population>();
    int popSize;
    
    
    public Population(int popSize){
        createPop(popSize);
        this.popSize = popSize;
    }
    
    public Population reprod(){
        return null;
    }
    
    public void elite(){
        
    }
    
    public void createPop(int size){
        
    }
    
    public void rouletWheel(){
        
    }
    
    
}
