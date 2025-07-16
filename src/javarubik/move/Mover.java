package javarubik.move;

import java.util.Optional;
import javarubik.data.Cube;
import javarubik.exceptions.CubeMoveException;

public class Mover {

    private final AxisMoves axisMoves;
    private final Moves moves;
    private final WMoves wmoves;

    public Mover(){
        this.axisMoves = new AxisMoves();
        this.moves = new Moves();
        this.wmoves = new WMoves();
    }

    /**
     * Apply a rotation on the passed cube based on the 'move' param
     * @author: LucaGoubelle
     * */
    public Cube simpleMove(Cube cube, String move){
        return switch (move) {
            case "U" -> this.moves.moveU(cube);
            case "U'" -> this.moves.moveUPrime(cube);
            case "U2" -> this.moves.moveU2(cube);
            case "Uw" -> this.wmoves.moveUw(cube, Optional.empty());
            case "Uw'" -> this.wmoves.moveUwPrime(cube, Optional.empty());
            case "Uw2" -> this.wmoves.moveUw2(cube, Optional.empty());
            case "Uww" -> this.wmoves.moveUw(cube, Optional.of(3));
            case "Uww'" -> this.wmoves.moveUwPrime(cube, Optional.of(3));

            case "D" -> this.moves.moveD(cube);
            case "D'" -> this.moves.moveDPrime(cube);
            case "D2" -> this.moves.moveD2(cube);
            case "Dw" -> this.wmoves.moveDw(cube, Optional.empty());
            case "Dw'" -> this.wmoves.moveDwPrime(cube, Optional.empty());
            case "Dw2" -> this.wmoves.moveDw2(cube, Optional.empty());
            case "Dww" -> this.wmoves.moveDw(cube, Optional.of(3));
            case "Dww'" -> this.wmoves.moveDwPrime(cube, Optional.of(3));

            case "R" -> this.moves.moveR(cube);
            case "R'" -> this.moves.moveRPrime(cube);
            case "R2" -> this.moves.moveR2(cube);
            case "Rw" -> this.wmoves.moveRw(cube, Optional.empty());
            case "Rw'" -> this.wmoves.moveRwPrime(cube, Optional.empty());
            case "Rw2" -> this.wmoves.moveRw2(cube, Optional.empty());
            case "Rww" -> this.wmoves.moveRw(cube, Optional.of(3));
            case "Rww'" -> this.wmoves.moveRwPrime(cube, Optional.of(3));

            case "L" -> this.moves.moveL(cube);
            case "L'" -> this.moves.moveLPrime(cube);
            case "L2" -> this.moves.moveL2(cube);
            case "Lw" -> this.wmoves.moveLw(cube, Optional.empty());
            case "Lw'" -> this.wmoves.moveLwPrime(cube, Optional.empty());
            case "Lw2" -> this.wmoves.moveLw2(cube, Optional.empty());
            case "Lww" -> this.wmoves.moveLw(cube, Optional.of(3));
            case "Lww'" -> this.wmoves.moveLwPrime(cube, Optional.of(3));

            case "F" -> this.moves.moveF(cube);
            case "F'" -> this.moves.moveFPrime(cube);
            case "F2" -> this.moves.moveF2(cube);
            case "Fw" -> this.wmoves.moveFw(cube, Optional.empty());
            case "Fw'" -> this.wmoves.moveFwPrime(cube, Optional.empty());
            case "Fw2" -> this.wmoves.moveFw2(cube, Optional.empty());

            case "y" -> this.axisMoves.moveY(cube);
            case "y'" -> this.axisMoves.moveYPrime(cube);
            case "y2" -> this.axisMoves.moveY2(cube);

            case "x" -> this.axisMoves.moveX(cube);
            case "x'" -> this.axisMoves.moveXPrime(cube);
            case "x2" -> this.axisMoves.moveX2(cube);

            case "z" -> this.axisMoves.moveZ(cube);
            case "z'" -> this.axisMoves.moveZPrime(cube);
            case "z2" -> this.axisMoves.moveZ2(cube);

            default -> cube;
        };
    }

    /**
     * Apply mutliples moves on the passed cube based on the 'moves' param
     * @author: LucaGoubelle
     * */
    public Cube multiMoves(Cube cube, String moves) throws CubeMoveException {
        try {
            String[] moveArr = moves.split(" ");
            for(String move : moveArr)
                cube = this.simpleMove(cube, move);
            return cube;
        } catch (Exception exc) {
            throw new CubeMoveException();
        }
    }
}
