
package ga;

/**
 *
 * @author andre
 */
public abstract class Individual {
    public abstract Individual mutacao();
    public abstract double fitness();
    public abstract Individual crossover(Individual individuo);
}
