package javaminx.move.kilo;

import javaminx.data.models.Kilominx;
import javaminx.data.models.Minx;
import javaminx.move.MinxMover;

public class KilominxMover extends MinxMover {
    private final KiloAxisMoves kiloAxisMoves;
    private final KiloULRFMoves kiloULRFMoves;

    public KilominxMover(){
        this.kiloAxisMoves = new KiloAxisMoves();
        this.kiloULRFMoves = new KiloULRFMoves();
    }
    
    @Override
    public Kilominx simpleMove(Minx minx, String mv){
        return switch (mv) {
            case "U" -> this.kiloULRFMoves.moveU((Kilominx)minx);
            case "U'" -> this.kiloULRFMoves.moveUPrime((Kilominx)minx);
            case "U2" -> this.kiloULRFMoves.moveU2((Kilominx)minx);

            case "L" -> this.kiloULRFMoves.moveL((Kilominx)minx);
            case "L'" -> this.kiloULRFMoves.moveLPrime((Kilominx)minx);
            case "L2" -> this.kiloULRFMoves.moveL2((Kilominx)minx);

            case "R" -> this.kiloULRFMoves.moveR((Kilominx)minx);
            case "R'" -> this.kiloULRFMoves.moveRPrime((Kilominx)minx);
            case "R2" -> this.kiloULRFMoves.moveR2((Kilominx)minx);

            case "F" -> this.kiloULRFMoves.moveF((Kilominx)minx);
            case "F'" -> this.kiloULRFMoves.moveFPrime((Kilominx)minx);
            case "F2" -> this.kiloULRFMoves.moveF2((Kilominx)minx);

            case "y" -> this.kiloAxisMoves.moveY((Kilominx)minx);
            case "y'" -> this.kiloAxisMoves.moveYPrime((Kilominx)minx);
            default -> (Kilominx)minx;
        };
    }

}
