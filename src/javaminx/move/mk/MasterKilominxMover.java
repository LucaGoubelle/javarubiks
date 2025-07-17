package javaminx.move.mk;

import javaminx.data.models.Minx;
import javaminx.move.MinxMover;

public class MasterKilominxMover extends MinxMover {

    @Override
    public Minx simpleMove(Minx minx, String mv) {
        return switch (mv) {
            case "U" -> minx;
            case "U'" -> minx;
            case "U2" -> minx;

            case "F" -> minx;
            case "F'" -> minx;
            case "F2" -> minx;

            case "L" -> minx;
            case "L'" -> minx;
            case "L2" -> minx;

            case "R" -> minx;
            case "R'" -> minx;
            case "R2" -> minx;

            case "DL" -> minx;
            case "DL'" -> minx;
            case "DL2" -> minx;

            case "DR" -> minx;
            case "DR'" -> minx;
            case "DR2" -> minx;

            case "y" -> minx;
            case "y'" -> minx;
            case "y2" -> minx;

            case "z" -> minx;
            case "z'" -> minx;
            case "z2" -> minx;

            default -> minx;
        };
    }
}
