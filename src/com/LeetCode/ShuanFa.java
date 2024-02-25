package com.LeetCode;

public class ShuanFa {
    public static void main(String[] args) {
        int array[][] = new int[11][11];
        array[1][2]=1;
        array[2][3]=2;
        for(int[] row:array)
        {
            for(int data: row)
            {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        int sum=0;
        for (int i =0;i<11;i++)
        {
            for(int j=0;j<11;j++)
            {
                if(array[i][j]!=0)
                {
                    sum++;
                }
            }
        }
        int sparsearray[][] =new int [sum+1][3];
        sparsearray[0][0]=11;
        sparsearray[0][1]=11;
        sparsearray[0][2]=sum;

        int count=0;
        for (int i =0;i<11;i++)
        {
            for(int j=0;j<11;j++)
            {
                if(array[i][j]!=0)
                {
                    count++;
                    sparsearray[count][0]=i;
                    sparsearray[count][1]=j;
                    sparsearray[count][2]=array[i][j];
                }
            }
        }
        System.out.println("以下为稀疏数值---");
//        for(int i=0;i<sum+1;i++)
//        {
//            for(int j=0;j<sparsearray.length;j++)
//            {
//                System.out.printf("%d\t",sparsearray[i][j]);
//            }
//            System.out.println();
//        }
        for(int i=0;i<sparsearray.length;i++)
        {
            System.out.printf("%d\t%d\t%d\t\n",sparsearray[i][0],sparsearray[i][1],sparsearray[i][2]);
        }
        System.out.println();

    }
}
