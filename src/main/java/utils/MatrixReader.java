package utils;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

public class MatrixReader {

    public int[][] readMatrixFromInput(){
        return readMatrixFromInput("input.txt");
    }

    public int[][] readMatrixFromInput(String fileName){
        int[][] result = null;

        try {
            File file = FileUtils.getFileFromResource(fileName);
            List<String> inputs = FileUtils.getFileData(file);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return result;
    }



}
