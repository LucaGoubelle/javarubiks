package testsSolvers;

import javarubik.data.Cube;
import javarubik.data.CubeBuilder;
import javarubik.display.CubePrinter;
import javarubik.move.Mover;
import solversCube.solver3x3.Solver3x3;

public class TestSolver3 {
    public static void main(String[] args) throws Exception {
        int cubeSize = 3;
        CubeBuilder builder = new CubeBuilder();
        Cube cube = builder.build(cubeSize);
        CubePrinter printer = new CubePrinter();
        Solver3x3 solver = new Solver3x3();

        // first we scramble the cube...
        Mover mover = new Mover();
        cube = mover.multiMoves(cube, "F2 U' F' L2 U' F' L' R D F U D F' R L U' R F2 R' L D2 ");
        printer.print(cube);

        System.out.println("\n-----------------------------\n");

        // then we solve it...
        cube = solver.solve(cube);
        printer.print(cube);
    }
}
