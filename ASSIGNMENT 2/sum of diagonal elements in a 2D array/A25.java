public class A25 {
    public static void main(String[] args) {
        int[][]x= new int[3][];
        x[0]= new int[]{1, 2, 3};
        x[1]=new int[]{2,3,7};
        x[2]=new int[]{6,8,9};
        int sum = 0;
        int sum1=0;
        for(int i=0;i<x.length;i++)
        {
            for (int j=0;j<x[i].length;j++){
                if(i==j)
                {

                    sum=sum+x[i][j];

                }
                if ((i + j) == (x.length - 1))
                    sum1=sum1+x[i][j];
            }
        }
        System.out.println("first diagonal is "+ sum);
        System.out.println("2nd diagonal is " + sum1);
    }
}
