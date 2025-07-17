package javaminx.move;

import javaminx.move.kilo.KilominxMover;
import javaminx.move.mega.MegaminxMover;
import javaminx.move.mk.MasterKilominxMover;

public class MinxMoverFactory {

    /**
     * return a minx mover instance based on the puzzleType string parametter
     * @author: LucaGoubelle
     * */
    public MinxMover make(String puzzleType){
        return switch (puzzleType) {
            case "kilominx" -> new KilominxMover();
            case "megaminx" -> new MegaminxMover();
            case "masterKilominx" -> new MasterKilominxMover();
            default -> new MegaminxMover();
        };
    }

}
