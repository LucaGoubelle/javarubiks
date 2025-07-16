package javarubik.move;

import javarubik.data.Cube;
import javarubik.move.helpers.RotateUtils;

public class AxisMoves {

    private final RotateUtils rotateUtils;

    public AxisMoves(){
        this.rotateUtils = new RotateUtils();
    }
    public Cube moveY(Cube cube){
        cube.up = this.rotateUtils.rotate(cube.up);
        cube.down = this.rotateUtils.rotateAsync(cube.down);

        String[][] newFront = this.rotateUtils.copyMatrix(cube.right);
        String[][] newLeft = this.rotateUtils.copyMatrix(cube.front);
        String[][] newRight = this.rotateUtils.copyMatrix(cube.back);
        String[][] newBack = this.rotateUtils.copyMatrix(cube.left);

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.left = this.rotateUtils.transfert(cube.left, newLeft);
        cube.right = this.rotateUtils.transfert(cube.right, newRight);
        cube.back = this.rotateUtils.transfert(cube.back, newBack);

        return cube;
    }

    public Cube moveYPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveY(cube);
        return cube;
    }

    public Cube moveY2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveY(cube);
        return cube;
    }

    public Cube moveX(Cube cube){
        cube.right = this.rotateUtils.rotate(cube.right);
        cube.left = this.rotateUtils.rotateAsync(cube.left);

        String[][] newFront = this.rotateUtils.copyMatrix(cube.down);
        String[][] newUp = this.rotateUtils.copyMatrix(cube.front);
        String[][] newBack = this.rotateUtils.rotateTwice(this.rotateUtils.copyMatrix(cube.up));
        String[][] newDown = this.rotateUtils.rotateTwice(this.rotateUtils.copyMatrix(cube.back));

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.up = this.rotateUtils.transfert(cube.up, newUp);
        cube.back = this.rotateUtils.transfert(cube.back, newBack);
        cube.down = this.rotateUtils.transfert(cube.down, newDown);

        return cube;
    }

    public Cube moveXPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveX(cube);
        return cube;
    }

    public Cube moveX2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveX(cube);
        return cube;
    }

    public Cube moveZ(Cube cube){
        cube.front = this.rotateUtils.rotate(cube.front);
        cube.back = this.rotateUtils.rotateAsync(cube.back);

        String[][] newUp = this.rotateUtils.rotate(this.rotateUtils.copyMatrix(cube.left));
        String[][] newRight = this.rotateUtils.rotate(this.rotateUtils.copyMatrix(cube.up));
        String[][] newLeft = this.rotateUtils.rotate(this.rotateUtils.copyMatrix(cube.down));
        String[][] newDown = this.rotateUtils.rotate(this.rotateUtils.copyMatrix(cube.right));

        cube.up = this.rotateUtils.transfert(cube.up, newUp);
        cube.right = this.rotateUtils.transfert(cube.right, newRight);
        cube.left = this.rotateUtils.transfert(cube.left, newLeft);
        cube.down = this.rotateUtils.transfert(cube.down, newDown);

        return cube;
    }

    public Cube moveZPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveZ(cube);
        return cube;
    }

    public Cube moveZ2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveZ(cube);
        return cube;
    }
}
