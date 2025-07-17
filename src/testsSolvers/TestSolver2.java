package testsSolvers;

import javarubik.data.Cube;
import javarubik.data.CubeBuilder;
import javarubik.display.CubePrinter;
import javarubik.move.Mover;
import solversCube.solver2x2.Solver2x2;

public class TestSolver2 {
    public static void main(String[] args) throws Exception {
        int cubeSize = 2;
        CubeBuilder builder = new CubeBuilder();
        Cube cube = builder.build(cubeSize);
        CubePrinter printer = new CubePrinter();
        Solver2x2 solver = new Solver2x2();

        // first we scramble the cube...
        Mover mover = new Mover();
        cube = mover.multiMoves(cube, "D2 F' D' R L2 U D' B2 U ");
        printer.print(cube);

        System.out.println("\n-----------------------------\n");

        // then we solve it...
        cube = solver.solve(cube);
        printer.print(cube);

    }
}
