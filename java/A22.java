public class A22 {
    public static void main(String[] args) {
        int[][]x= new int[4][];
        x[0]= new int[]{1, 2, 3};
        x[1]=new int[]{2,3};
        x[2]=new int[]{2};
        x[3]=new int[]{9,8,7,6,5};
        for(int i=0;i<x.length;i++)
        {
            for (int j=0;j<x[i].length;j++){
                System.out.println(x[i][j]);
            }
        }
    }
}

