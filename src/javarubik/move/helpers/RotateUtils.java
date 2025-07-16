package javarubik.move.helpers;

public class RotateUtils {

    public String[][] copyMatrix(String[][] matrix){
        int size = matrix.length;
        String[][] newMatrix = new String[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                newMatrix[i][j] = matrix[i][j];
        return newMatrix;
    }

    public String[][] genEmptyFace(int size){
        String[][] face = new String[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                face[i][j] = "";
        return face;
    }

    public String[][] rotate(String[][] face){
        int size = face.length;
        String[][]  newFace = genEmptyFace(size);
        for(int i=0;i<size;i++){
            int cnt = size - 1;
            for(int j=0;j<size;j++) {
                newFace[i][j] = face[cnt][i];
                cnt--;
            }
        }
        return newFace;
    }

    public String[][] rotateAsync(String[][] face){
        for(int i=0;i<3;i++)
            face = rotate(face);
        return face;
    }

    public String[][] rotateTwice(String[][] face){
        for(int i=0;i<2;i++)
            face = rotate(face);
        return face;
    }

    public String[][] transfert(String[][] face, String[][] newFace){
        int size = face.length;
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                face[i][j] = (!newFace[i][j].equals("")) ? newFace[i][j] : face[i][j];
        return face;
    }
}
