package net.athera.atherasurvival.util.interfaces;

import net.athera.atherasurvival.util.Baseplayer;

public interface IDbManagement {

    /**
     * Checks if a user exists in db
     * @param bp
     */
    public boolean UserExists(Baseplayer bp);

    /**
     * Creates a new user
     * @param bp
     */
    public void CreateUser(Baseplayer bp);
    

}
