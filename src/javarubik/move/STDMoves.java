package javarubik.move;

import javarubik.data.Cube;

public class STDMoves extends Moves {

    //#########################################################
    //################## U MOVES ##############################
    //#########################################################

    public Cube moveU(Cube cube){
        int size = cube.up.length;
        cube.up = this.rotateUtils.rotate(cube.up);
        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newLeft = this.rotateUtils.genEmptyFace(size);
        String[][] newRight = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);

        for (int i=0;i<size;i++){
            newFront[0][i] = cube.right[0][i];
            newLeft[0][i] = cube.front[0][i];
            newRight[0][i] = cube.back[0][i];
            newBack[0][i] = cube.left[0][i];
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.left = this.rotateUtils.transfert(cube.left, newLeft);
        cube.right = this.rotateUtils.transfert(cube.right, newRight);
        cube.back = this.rotateUtils.transfert(cube.back, newBack);

        return cube;
    }

    public Cube moveUPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveU(cube);
        return cube;
    }

    public Cube moveU2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveU(cube);
        return cube;
    }

    //#########################################################
    //############ D MOVES ####################################
    //#########################################################

    public Cube moveD(Cube cube){
        int size = cube.down.length;
        cube.down = this.rotateUtils.rotate(cube.down);

        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newLeft = this.rotateUtils.genEmptyFace(size);
        String[][] newRight = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);

        for(int i=0;i<size;i++){
            newFront[size-1][i] = cube.left[size-1][i];
            newLeft[size-1][i] = cube.back[size-1][i];
            newRight[size-1][i] = cube.front[size-1][i];
            newBack[size-1][i] = cube.right[size-1][i];
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.left = this.rotateUtils.transfert(cube.left, newLeft);
        cube.right = this.rotateUtils.transfert(cube.right, newRight);
        cube.back = this.rotateUtils.transfert(cube.back, newBack);

        return cube;
    }

    public Cube moveDPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveD(cube);
        return cube;
    }

    public Cube moveD2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveD(cube);
        return cube;
    }

    //#########################################################
    //################## R MOVES ##############################
    //#########################################################

    public Cube moveR(Cube cube){
        int size = cube.right.length;
        cube.right = this.rotateUtils.rotate(cube.right);

        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newUp = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);
        String[][] newDown = this.rotateUtils.genEmptyFace(size);

        for(int i=0;i<size;i++){
            newFront[i][size-1] = cube.down[i][size-1];
            newUp[i][size-1] = cube.front[i][size-1];
            newBack[i][size-1] = cube.up[i][size-1];
            newDown[i][0] = cube.back[i][0];
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.up = this.rotateUtils.transfert(cube.up, newUp);
        cube.back = this.rotateUtils.transfert(cube.back, this.rotateUtils.rotateTwice(newBack));
        cube.down = this.rotateUtils.transfert(cube.down, this.rotateUtils.rotateTwice(newDown));

        return cube;
    }

    public Cube moveRPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveR(cube);
        return cube;
    }

    public Cube moveR2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveR(cube);
        return cube;
    }

    //#########################################################
    //################## L MOVES ##############################
    //#########################################################

    public Cube moveL(Cube cube){
        int size = cube.left.length;
        cube.left = this.rotateUtils.rotate(cube.left);

        String[][] newUp = this.rotateUtils.genEmptyFace(size);
        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newDown = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);

        for(int i=0;i<size;i++){
            newFront[i][0] = cube.up[i][0];
            newDown[i][0] = cube.front[i][0];
            newBack[i][0] = cube.down[i][0];
            newUp[i][size-1] = cube.back[i][size-1];
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.up = this.rotateUtils.transfert(cube.up, this.rotateUtils.rotateTwice(newUp));
        cube.down = this.rotateUtils.transfert(cube.down, newDown);
        cube.back = this.rotateUtils.transfert(cube.back, this.rotateUtils.rotateTwice(newBack));

        return cube;
    }

    public Cube moveLPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveL(cube);
        return cube;
    }

    public Cube moveL2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveL(cube);
        return cube;
    }

    // ########################################################################
    // ############## F MOVES #################################################
    // ########################################################################

    public Cube moveF(Cube cube){
        // to test
        int size = cube.front.length;
        cube.front = this.rotateUtils.rotate(cube.front);

        String[][] newUp = this.rotateUtils.genEmptyFace(size);
        String[][] newLeft = this.rotateUtils.genEmptyFace(size);
        String[][] newRight = this.rotateUtils.genEmptyFace(size);
        String[][] newDown = this.rotateUtils.genEmptyFace(size);

        for(int i=0;i<size;i++){
            newUp[i][size-1] = cube.left[i][size-1];
            newLeft[0][i] = cube.down[0][i];
            newRight[size-1][i] = cube.up[size-1][i];
            newDown[i][0] = cube.right[i][0];
        }

        cube.up = this.rotateUtils.transfert(cube.up, this.rotateUtils.rotate(newUp));
        cube.left = this.rotateUtils.transfert(cube.left, this.rotateUtils.rotate(newLeft));
        cube.right = this.rotateUtils.transfert(cube.right, this.rotateUtils.rotate(newRight));
        cube.down = this.rotateUtils.transfert(cube.down, this.rotateUtils.rotate(newDown));

        return cube;
    }

    public Cube moveFPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveF(cube);
        return cube;
    }

    public Cube moveF2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveF(cube);
        return cube;
    }

    // ########################################################################
    // ############## B MOVES #################################################
    // ########################################################################

    public Cube moveB(Cube cube){
        // not implemented yet
        return cube;
    }

    public Cube moveBPrime(Cube cube){
        for(int i=0;i<3;i++)
            cube = this.moveB(cube);
        return cube;
    }

    public Cube moveB2(Cube cube){
        for(int i=0;i<2;i++)
            cube = this.moveB(cube);
        return cube;
    }

}
