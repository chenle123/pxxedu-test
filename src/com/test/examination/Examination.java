package com.test.examination;

/**
 * @ClassName Examination
 * @Description TODO
 * @Author bianliang
 * @Date 2020/5/9 15:59
 * @Version 1.0
 */

public class Examination {

    public int getMaxSnest(int[][] envelopes){

        int[] a = new int[envelopes.length];
        int[] b = new int[envelopes.length];

        for(int i=0;i<envelopes.length;i++){
            a[i] = envelopes[i][0];
            b[i] = envelopes[i][1];
        }

        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] =temp;

                    int temp1 = b[j-1];
                    b[j-1] = b[j];
                    b[j] = temp1;
                }else if(a[j-1] == a[j]){
                    if(b[j-1]<b[j]){
                        int temp = b[j-1];
                        b[j-1] = b[j];
                        b[j] = temp;
                    }
                }
            }
        }

        int maxEmbeded = 0;
        for(int i=0;i<b.length;i++){
            int startValue = b[i];
            int embededCount = 1;
            for(int j=i+1;j<b.length;j++){

                if(startValue<b[j]){
                   embededCount++;
                   startValue = b[j];
                }
            }

            if(embededCount>maxEmbeded){
                maxEmbeded = embededCount;
            }

        }

        return maxEmbeded;
    }

    public static void main(String[] args){

        Examination e = new Examination();
        int[][] testData1 = new int[][]{{5,4},{6,4},{6,7},{2,3},{3,4},
                {4,5},{5,6}};

        System.out.println(e.getMaxSnest(testData1));

        int[][] testData2 = {{5,4},{6,4},{6,7},{2,3},{1,5}};
        System.out.println(e.getMaxSnest(testData2));


        int[][] testData3 = new int[][]{{1,3},{2,2},{10,30},{20,20}
        ,{21,21},{22,22}};
        System.out.println(e.getMaxSnest(testData3));

        int[][] testData4 = new int[][]{{1,3},{2,2},{10,30},{20,20},{21,21},{22,22}};

        System.out.println(e.getMaxSnest(testData4));

        int[][] testData5 = new int[][]{{1,10},{2,11},{10,1},{11,2}};
        System.out.println(e.getMaxSnest(testData5));
    }
}
