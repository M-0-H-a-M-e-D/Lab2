public class Lab2 {
    public boolean checkEvenOrOdd(int x)
    {
        return x % 2 == 0;
    }
    public int[] MaxandMin(int[] x)
    {
        int n=x.length;
        int max=-99999999;
        int min=99999999;

        for(int i=0;i<n;i++)
        {
            if(x[i]>max)
                max=x[i];

            if(x[i]<min)
                min=x[i];
        }

        return new int[]{max, min};
    }
}
