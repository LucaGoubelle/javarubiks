package javaminx.move.helpers;

public class MegaminxRotateUtils {
    public String[][] genEmptyFace(){
        return new String[][]{
                {"","","","","", "","","","",""},
                {""}
        };
    }

    public String[][] copyFace(String[][] face){
        return new String[][]{
                {
                    face[0][0], face[0][1], face[0][2], face[0][3], face[0][4],
                        face[0][5], face[0][6], face[0][7], face[0][8], face[0][9],
                },
                { face[1][0] }
        };
    }

    public String[][] rotate(String[][] face){
        String[][] newFace = this.genEmptyFace();

        newFace[0][0] = face[0][8];
        newFace[0][1] = face[0][9];
        newFace[0][2] = face[0][0];
        newFace[0][3] = face[0][1];
        newFace[0][4] = face[0][2];
        newFace[0][5] = face[0][3];
        newFace[0][6] = face[0][4];
        newFace[0][7] = face[0][5];
        newFace[0][8] = face[0][6];
        newFace[0][9] = face[0][7];

        newFace[1][0] = face[1][0];

        return newFace;
    }

    public String[][] rotateAsync(String[][] face){
        String[][] newFace = this.genEmptyFace();

        newFace[0][0] = face[0][2];
        newFace[0][1] = face[0][3];
        newFace[0][2] = face[0][4];
        newFace[0][3] = face[0][5];
        newFace[0][4] = face[0][6];
        newFace[0][5] = face[0][7];
        newFace[0][6] = face[0][8];
        newFace[0][7] = face[0][9];
        newFace[0][8] = face[0][0];
        newFace[0][9] = face[0][1];

        newFace[1][0] = face[1][0];

        return newFace;
    }

    public String[][] rotateTwice(String[][] face){
        for(int i=0;i<2;i++)
            face = this.rotate(face);
        return face;
    }

    public String[][] rotateTwiceAsync(String[][] face){
        for(int i=0;i<2;i++)
            face = this.rotateAsync(face);
        return face;
    }

    public String[][] transfert(String[][] face, String[][] newFace){
        for(int i=0;i<face[0].length;i++)
            face[0][i] = (!newFace[0][i].isEmpty()) ? newFace[0][i] : face[0][i];
        face[1][0] = (!newFace[1][0].isEmpty()) ? newFace[1][0] : face[1][0];
        return face;
    }

}
