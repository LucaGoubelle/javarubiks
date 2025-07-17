package testsSolvers;

import javarubik.data.Cube;
import javarubik.data.CubeBuilder;
import javarubik.display.CubePrinter;
import javarubik.move.Mover;
import solversCube.solver6x6.Solver6x6;

public class TestSolver6 {
    public static void main(String[] args) throws Exception {
        int cubeSize = 6;
        CubeBuilder builder = new CubeBuilder();
        Cube cube = builder.build(cubeSize);
        CubePrinter printer = new CubePrinter();
        Solver6x6 solver = new Solver6x6();

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
