package javarubik.move;

import javarubik.data.Cube;
import javarubik.move.helpers.RotateUtils;

import java.util.Optional;

public class WMoves {

    private final RotateUtils rotateUtils;

    public WMoves(){
        this.rotateUtils = new RotateUtils();
    }
    // U
    public Cube moveUw(Cube cube, Optional<Integer> nbLayers){
        int size = cube.up.length;
        int layers = nbLayers.orElse(2);
        cube.up = this.rotateUtils.rotate(cube.up);
        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newLeft = this.rotateUtils.genEmptyFace(size);
        String[][] newRight = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);

        for(int j=0;j<layers;j++){
            for (int i=0;i<size;i++){
                newFront[j][i] = cube.right[j][i];
                newLeft[j][i] = cube.front[j][i];
                newRight[j][i] = cube.back[j][i];
                newBack[j][i] = cube.left[j][i];
            }
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.left = this.rotateUtils.transfert(cube.left, newLeft);
        cube.right = this.rotateUtils.transfert(cube.right, newRight);
        cube.back = this.rotateUtils.transfert(cube.back, newBack);

        return cube;
    }

    public Cube moveUwPrime(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<3;i++)
            cube = this.moveUw(cube, nbLayer);
        return cube;
    }

    public Cube moveUw2(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<2;i++)
            cube = this.moveUw(cube, nbLayer);
        return cube;
    }

    // D

    public Cube moveDw(Cube cube, Optional<Integer> nbLayer){
        int size = cube.down.length;
        int layers = nbLayer.orElse(2);
        cube.down = this.rotateUtils.rotate(cube.down);

        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newLeft = this.rotateUtils.genEmptyFace(size);
        String[][] newRight = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);

        for(int j=0;j<layers;j++){
            for(int i=0;i<size;i++){
                newFront[size-(1+j)][i] = cube.left[size-(1+j)][i];
                newLeft[size-(1+j)][i] = cube.back[size-(1+j)][i];
                newRight[size-(1+j)][i] = cube.front[size-(1+j)][i];
                newBack[size-(1+j)][i] = cube.right[size-(1+j)][i];
            }
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.left = this.rotateUtils.transfert(cube.left, newLeft);
        cube.right = this.rotateUtils.transfert(cube.right, newRight);
        cube.back = this.rotateUtils.transfert(cube.back, newBack);

        return cube;
    }

    public Cube moveDwPrime(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<3;i++)
            cube = this.moveDw(cube, nbLayer);
        return cube;
    }

    public Cube moveDw2(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<2;i++)
            cube = this.moveDw(cube, nbLayer);
        return cube;
    }

    // R

    public Cube moveRw(Cube cube, Optional<Integer> nbLayer){
        int size = cube.right.length;
        int layers = nbLayer.orElse(2);
        cube.right = this.rotateUtils.rotate(cube.right);

        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newUp = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);
        String[][] newDown = this.rotateUtils.genEmptyFace(size);

        for(int j=0;j<layers;j++){
            for(int i=0;i<size;i++){
                newFront[i][size-(1+j)] = cube.down[i][size-(1+j)];
                newUp[i][size-(1+j)] = cube.front[i][size-(1+j)];
                newBack[i][size-(1+j)] = cube.up[i][size-(1+j)];
                newDown[i][j] = cube.back[i][j];
            }
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.up = this.rotateUtils.transfert(cube.up, newUp);
        cube.back = this.rotateUtils.transfert(cube.back, this.rotateUtils.rotateTwice(newBack));
        cube.down = this.rotateUtils.transfert(cube.down, this.rotateUtils.rotateTwice(newDown));

        return cube;
    }

    public Cube moveRwPrime(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<3;i++)
            cube = this.moveRw(cube, nbLayer);
        return cube;
    }

    public Cube moveRw2(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<2;i++)
            cube = this.moveRw(cube, nbLayer);
        return cube;
    }

    // L

    public Cube moveLw(Cube cube, Optional<Integer> nbLayer){
        int size = cube.left.length;
        int layers = nbLayer.orElse(2);
        cube.left = this.rotateUtils.rotate(cube.left);

        String[][] newUp = this.rotateUtils.genEmptyFace(size);
        String[][] newFront = this.rotateUtils.genEmptyFace(size);
        String[][] newDown = this.rotateUtils.genEmptyFace(size);
        String[][] newBack = this.rotateUtils.genEmptyFace(size);

        for(int j=0;j<layers;j++) {
            for (int i = 0; i < size; i++) {
                newFront[i][j] = cube.up[i][j];
                newDown[i][j] = cube.front[i][j];
                newBack[i][j] = cube.down[i][j];
                newUp[i][size - (1+j)] = cube.back[i][size - (1+j)];
            }
        }

        cube.front = this.rotateUtils.transfert(cube.front, newFront);
        cube.up = this.rotateUtils.transfert(cube.up, this.rotateUtils.rotateTwice(newUp));
        cube.down = this.rotateUtils.transfert(cube.down, newDown);
        cube.back = this.rotateUtils.transfert(cube.back, this.rotateUtils.rotateTwice(newBack));

        return cube;
    }

    public Cube moveLwPrime(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<3;i++)
            cube = this.moveLw(cube, nbLayer);
        return cube;
    }

    public Cube moveLw2(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<2;i++)
            cube = this.moveLw(cube, nbLayer);
        return cube;
    }

    public Cube moveFw(Cube cube, Optional<Integer> nbLayer){
        // to test
        int size = cube.front.length;
        int layers = nbLayer.orElse(2);
        cube.front = this.rotateUtils.rotate(cube.front);

        String[][] newUp = this.rotateUtils.genEmptyFace(size);
        String[][] newLeft = this.rotateUtils.genEmptyFace(size);
        String[][] newRight = this.rotateUtils.genEmptyFace(size);
        String[][] newDown = this.rotateUtils.genEmptyFace(size);

        for(int j=0;j<layers;j++){
            for(int i=0;i<size;i++){
                newUp[i][size-(1+j)] = cube.left[i][size-(1+j)];
                newLeft[j][i] = cube.down[j][i];
                newRight[size-(1+j)][i] = cube.up[size-(1+j)][i];
                newDown[i][j] = cube.right[i][j];
            }
        }

        cube.up = this.rotateUtils.transfert(cube.up, this.rotateUtils.rotate(newUp));
        cube.left = this.rotateUtils.transfert(cube.left, this.rotateUtils.rotate(newLeft));
        cube.right = this.rotateUtils.transfert(cube.right, this.rotateUtils.rotate(newRight));
        cube.down = this.rotateUtils.transfert(cube.down, this.rotateUtils.rotate(newDown));

        return cube;
    }

    public Cube moveFwPrime(Cube cube, Optional<Integer> nbLayer){
        for(int i=0;i<3;i++)
            cube = this.moveFw(cube, nbLayer);
        return cube;
    }

    public Cube moveFw2(Cube cube,  Optional<Integer> nbLayer){
        for(int i=0;i<2;i++)
            cube = this.moveFw(cube, nbLayer);
        return cube;
    }
}
