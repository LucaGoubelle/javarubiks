import javarubik.data.Cube;
import javarubik.data.CubeBuilder;
import javarubik.display.CubePrinter;
import javarubik.move.Mover;

import solver7x7.Solver7x7;

public class TestSolver7 {
    public static void main(String[] args) throws Exception {
        int cubeSize = 7;
        CubeBuilder builder = new CubeBuilder();
        Cube cube = builder.build(cubeSize);
        CubePrinter printer = new CubePrinter();
        Solver7x7 solver = new Solver7x7();

        // first we scramble the cube...
        Mover mover = new Mover();
        cube = mover.multiMoves(cube, "???");
        printer.print(cube);

        System.out.println("\n-----------------------------\n");

        // then we solve it...
        cube = solver.solve(cube);
        printer.print(cube);
    }
}
