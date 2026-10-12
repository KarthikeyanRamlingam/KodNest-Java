public class prefix{
    public static void main(String []args)
    {
        int[] arr={10,20,30,40,50};
        int[] pre=new int[arr.length];
        int[] suf=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            pre[i]=sum;
        }
        int sufsum=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            sufsum+=arr[i];
            suf[i]=sufsum;
        }
        for(int x:pre)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:suf)
        {
            System.out.print(x+" ");
        }
    }
}