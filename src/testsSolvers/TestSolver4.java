package testsSolvers;

import javarubik.data.Cube;
import javarubik.data.CubeBuilder;
import javarubik.display.CubePrinter;
import javarubik.move.Mover;
import solversCube.solver4x4.Solver4x4;

public class TestSolver4 {
    public static void main(String[] args) throws Exception {
        int cubeSize = 4;
        CubeBuilder builder = new CubeBuilder();
        Cube cube = builder.build(cubeSize);
        CubePrinter printer = new CubePrinter();
        Solver4x4 solver = new Solver4x4();

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
