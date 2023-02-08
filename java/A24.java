public class A24 {
    public static void main(String[] args) {
        int rows=2;
        int column=2;
        int[][]x=new int[rows][column];
        int[][]y=new int[rows][column];
        int [][]z=new int[rows][column];
        x[0]=new int[]{3,4};
        x[1]=new int[]{6,7};
        y[0]=new int[]{8,9};
        y[1]=new int[]{7,3};
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++)
            {
                z[i][j]=x[i][j]+y[i][j];
           }
        }
        for(int k=0;k<rows;k++)
        {
            for(int l=0;l<column;l++)
            {
                System.out.println(z[k][l]);
            }
        }



    }
}
