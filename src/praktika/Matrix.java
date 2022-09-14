package praktika;

import java.util.Random;

public class Matrix {
    Double[][] matrix;
    int rows;
    int columns;

    //Конструктор
    public Matrix(int rows, int columns) {
        this.matrix = new Double[rows][columns];
    }

    public void fillMatrix(){
        Random rnd = new Random();
        //дальше было впадлу делать
    }

    public Matrix additionMartix(Matrix matrix){
        return matrix;
    }
}