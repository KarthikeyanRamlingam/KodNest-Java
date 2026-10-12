public class Bookapp{
    private int page;
    public void setdata(int x)
    {
        if(x>0)
        {
            page=x;
        }
    }
    public int getdata()
    {
        return page;
    }
}