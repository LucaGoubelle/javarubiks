package javaminx.move.helpers;

import java.util.Arrays;

public class KilominxRotateUtils {
    public String[] genEmptyFace(){
        String[] face = new String[5];
        Arrays.fill(face, "");
        return face;
    }

    public String[] copyFace(String[] face){
        String[] newFace = new String[5];
        for(int i=0;i<face.length;i++)
            newFace[i] = face[i];
        return newFace;
    }

    public String[] rotate(String[] face){
        String[] newFace = genEmptyFace();
        newFace[0] = face[4];
        newFace[1] = face[0];
        newFace[2] = face[1];
        newFace[3] = face[2];
        newFace[4] = face[3];
        return newFace;
    }

    public String[] rotateAsync(String[] face){
        String[] newFace = genEmptyFace();
        newFace[0] = face[1];
        newFace[1] = face[2];
        newFace[2] = face[3];
        newFace[3] = face[4];
        newFace[4] = face[0];
        return newFace;
    }

    public String[] rotateTwice(String[] face){
        String[] newFace = rotate(face);
        return rotate(newFace);
    }

    public String[] transfert(String[] face, String[] newFace){
        for(int i=0;i< face.length;i++)
            face[i] = (!newFace[i].equals("")) ? newFace[i] : face[i] ;
        return face;
    }
}
