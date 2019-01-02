/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

/**
 *
 * @author andre
 */
public class World {

    private static World singleton;

    public static synchronized World getInstance() {
        if (singleton == null) {
            singleton = new World();
        }
        return singleton;
    }
}
