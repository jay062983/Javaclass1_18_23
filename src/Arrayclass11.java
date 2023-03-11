public class Arrayclass11 {

    public static void main(String[] args) {
        int[][] matrix={{10,20,30},
                        {45,55,66},
                        {30,40,20,10,25}};
        // write a loop to print all elements from this 2D array
        //matrix.length tell us how many 1D arrays are present in this 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
