package javaminx.move.kilo;

import javaminx.data.models.Kilominx;
import javaminx.move.helpers.KilominxRotateUtils;

public class KiloAxisMoves {

    private final KilominxRotateUtils rotateUtils;

    public KiloAxisMoves(){
        this.rotateUtils = new KilominxRotateUtils();
    }

    public Kilominx moveY(Kilominx minx){
        minx.up = this.rotateUtils.rotate(minx.up);
        minx.down = this.rotateUtils.rotateAsync(minx.down);

        String[] newFront = this.rotateUtils.copyFace(minx.right);
        String[] newLeft = this.rotateUtils.copyFace(minx.front);
        String[] newRight = this.rotateUtils.copyFace(minx.backRight);
        String[] newBackLeft = this.rotateUtils.copyFace(minx.left);
        String[] newBackRight = this.rotateUtils.copyFace(minx.backLeft);

        String[] newDownLeft = this.rotateUtils.copyFace(minx.downRight);
        String[] newDownRight = this.rotateUtils.copyFace(minx.absRight);
        String[] newAbsRight = this.rotateUtils.copyFace(minx.back);
        String[] newBack = this.rotateUtils.copyFace(minx.absLeft);
        String[] newAbsLeft = this.rotateUtils.copyFace(minx.downLeft);

        minx.front = this.rotateUtils.transfert(minx.front, newFront);
        minx.right = this.rotateUtils.transfert(minx.right, newRight);
        minx.left = this.rotateUtils.transfert(minx.left, newLeft);
        minx.backLeft = this.rotateUtils.transfert(minx.backLeft, newBackLeft);
        minx.backRight = this.rotateUtils.transfert(minx.backRight, newBackRight);

        minx.downLeft = this.rotateUtils.transfert(minx.downLeft, newDownLeft);
        minx.downRight = this.rotateUtils.transfert(minx.downRight, newDownRight);
        minx.back = this.rotateUtils.transfert(minx.back, newBack);
        minx.absLeft = this.rotateUtils.transfert(minx.absLeft, newAbsLeft);
        minx.absRight = this.rotateUtils.transfert(minx.absRight, newAbsRight);

        return minx;
    }

    public Kilominx moveYPrime(Kilominx minx){
        for(int i=0;i<4;i++)
            minx = this.moveY(minx);
        return minx;
    }
}
