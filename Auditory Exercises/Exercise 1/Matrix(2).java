import java.util.Scanner;

//Separated methods Average + Sum

public class Matrix
{
    public static double Sum(double [][]matrix)
    {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        double sum = 0.0;
        for (int i=0;i<numRows; i++) //number of rows
        {
            //elements in the first row are equal to the length of the column in the matrix
            for (int j = 0; j<numColumns; j++) //number of columns
            {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static double Average(double [][]matrix)
    {
        double sum = 0.0;
        int numRows = matrix.length;
        int numColumns = matrix[0].length;
        for (int i=0; i<numRows; i++)
        {
            for (int j=0; j<numColumns; j++)
            {
                sum += matrix[i][j];
            }
        }
        return sum / (numRows * numColumns);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int m = scanner.nextInt();

        double [][]matrix = new double[n][m];

        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print("Matrix["+ i +"]" + "[" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of all elements in the matrix is: " + Sum(matrix));
        System.out.println("Average number of the matrix: " + Average(matrix));
    }
}
