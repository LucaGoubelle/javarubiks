package testsSolvers;

import javarubik.data.Cube;
import javarubik.data.CubeBuilder;
import javarubik.display.CubePrinter;
import javarubik.move.Mover;
import solversCube.solver5x5.Solver5x5;

public class TestSolver5 {
    public static void main(String[] args) throws Exception {
        int cubeSize = 5;
        CubeBuilder builder = new CubeBuilder();
        Cube cube = builder.build(cubeSize);
        CubePrinter printer = new CubePrinter();
        Solver5x5 solver = new Solver5x5();

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
