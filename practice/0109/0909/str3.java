public class str3{
    public static void main(String []args)
    {
        String s1="java";
        char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        String res=new String(arr);
        System.out.println(res);
    }
}