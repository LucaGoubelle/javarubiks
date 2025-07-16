package javaminx.move;

import javaminx.data.models.Minx;
import javaminx.exceptions.MinxMoverException;

/**
 * Mother abstract class for minx's mover instances
 * @author: LucaGoubelle
 * */
public abstract class MinxMover {

    public abstract Minx simpleMove(Minx minx, String mv);

    /**
     * execute a sequence of rotations, return the altered puzzle
     * @author: LucaGoubelle
     * */
    public Minx multiMoves(Minx minx, String mvs) throws MinxMoverException {
        try {
            String[] arrMvs = mvs.split(" ");
            for(String mv : arrMvs)
                minx = this.simpleMove(minx, mv);
            return minx;
        } catch(Exception exc) {
            throw new MinxMoverException();
        }
    }
}
