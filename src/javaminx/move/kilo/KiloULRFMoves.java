package javaminx.move.kilo;

import javaminx.data.models.Kilominx;
import javaminx.move.helpers.KilominxRotateUtils;

public class KiloULRFMoves {
    private final KilominxRotateUtils rotateUtils;

    public KiloULRFMoves(){
        this.rotateUtils = new KilominxRotateUtils();
    }

    public Kilominx moveU(Kilominx minx){
        String[] newLeft = this.rotateUtils.genEmptyFace();
        String[] newFront = this.rotateUtils.genEmptyFace();
        String[] newRight = this.rotateUtils.genEmptyFace();
        String[] newBackLeft = this.rotateUtils.genEmptyFace();
        String[] newBackRight = this.rotateUtils.genEmptyFace();

        for(int i = 0; i < 2; i++){
            newLeft[i] = minx.front[i];
            newRight[i] = minx.backRight[i];
            newFront[i] = minx.right[i];
            newBackLeft[i] = minx.left[i];
            newBackRight[i] = minx.backLeft[i];
        }

        minx.left = this.rotateUtils.transfert(minx.left, newLeft);
        minx.right = this.rotateUtils.transfert(minx.right, newRight);
        minx.front = this.rotateUtils.transfert(minx.front, newFront);
        minx.backLeft = this.rotateUtils.transfert(minx.backLeft, newBackLeft);
        minx.backRight = this.rotateUtils.transfert(minx.backRight, newBackRight);

        return minx;
    }

    public Kilominx moveUPrime(Kilominx minx){
        for(int i=0;i<4;i++)
            minx = this.moveU(minx);
        return minx;
    }

    public Kilominx moveU2(Kilominx minx){
        for(int i=0;i<2;i++)
            minx = this.moveU(minx);
        return minx;
    }

    public Kilominx moveL(Kilominx minx){
        //TODO: implement this
        return minx;
    }

    public Kilominx moveLPrime(Kilominx minx){
        for(int i=0;i<4;i++)
            minx = this.moveL(minx);
        return minx;
    }

    public Kilominx moveL2(Kilominx minx){
        for(int i=0;i<2;i++)
            minx = this.moveL(minx);
        return minx;
    }

    public Kilominx moveR(Kilominx minx){
        //TODO: implement this
        return minx;
    }

    public Kilominx moveRPrime(Kilominx minx){
        for(int i=0;i<4;i++)
            minx = this.moveR(minx);
        return minx;
    }

    public Kilominx moveR2(Kilominx minx){
        for(int i=0;i<2;i++)
            minx = this.moveR(minx);
        return minx;
    }

    public Kilominx moveF(Kilominx minx){
        //TODO: implement this
        return minx;
    }

    public Kilominx moveFPrime(Kilominx minx){
        for(int i=0;i<4;i++)
            minx = this.moveF(minx);
        return minx;
    }

    public Kilominx moveF2(Kilominx minx){
        for(int i=0;i<2;i++)
            minx = this.moveF(minx);
        return minx;
    }
}
