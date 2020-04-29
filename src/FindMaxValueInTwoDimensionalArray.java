import java.util.Scanner;
public class FindMaxValueInTwoDimensionalArray {
    public static void showArray(float[][]arr){
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public static float MaxValueInTwoDimensionalArray(float[][]arr){
        float maxValue=arr[0][0];
        int row = 0,column=0;
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>maxValue){
                    maxValue=arr[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        System.out.println("Tại vị trí "+row+", "+column+" có giá trị lớn nhất trong mảng là: ");
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tọa độ x: ");
        int x=scanner.nextInt();
        System.out.println("Nhập tọa độ y: ");
        int y=scanner.nextInt();
        float[][] arr=new float[x][y];
        for (int i=0;i<arr.length;i++){
            System.out.println("Nhập hàng thứ "+(i+1));
            for (int j =0;j<arr[i].length;j++){
                System.out.println("Nhập phần tử thứ "+(j+1));
                arr[i][j]=scanner.nextFloat();
            }
        }
        System.out.println("Mảng đã nhập là: ");
        showArray(arr);
        System.out.println("Giá trị lớn nhất trong mảng là: ");
        System.out.println(MaxValueInTwoDimensionalArray(arr));
    }
}
