public class Calc 
{
    private int r = 0;
    public int add(int x, int y) { return x+y; }
    public int sub(int x, int y) { return x-y; }
    public int inc(int d) { r+=d; }
    public int getResult() { return r; }
}
