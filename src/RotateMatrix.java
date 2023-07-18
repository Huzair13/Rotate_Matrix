import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int sizeRow=scanner.nextInt();
        System.out.println("Enter the number of columns in the array");
        int sizeColumn=scanner.nextInt();
        int array[][]=new int[sizeRow][sizeColumn];

        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        int roatateMatrixArray[][]=rotateMatrix(array,sizeRow,sizeColumn);

        for(int i=0;i<sizeRow;i++){
            for(int j=0;j<sizeColumn;j++){
                System.out.print(roatateMatrixArray[i][j]+" ");
            }
            System.out.println("");
        }

    }

    private static int[][] rotateMatrix(int[][] array, int sizeRow, int sizeColumn) {

        //Transpose of the matrix
        int temp=0;
        for(int i=0;i<sizeRow;i++){
            for(int j=0;j<sizeColumn;j++){
                if(i<j){
                    temp=array[i][j];
                    array[i][j]=array[j][i];
                    array[j][i]=temp;
                }
            }
        }

        //Row Wise Reverse of the matrix
        for(int i=0;i<sizeRow;i++){
            int start=0;
            int end=sizeColumn-1;
            int temp2=0;
            while(start<=end){
                temp2=array[i][start];
                array[i][start]=array[i][end];
                array[i][end]=temp2;
                end--;
                start++;
            }
        }
        return array;
    }
}