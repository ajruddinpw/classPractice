//Anonymous Array:
class Calc{
public int add(int nums[])
{
    int result=0;
    for(int n:nums)
    {
        result=result+n;

    }
    return result;
}

}




public class DemoA6 {
    public static void main(String[] args) {
Calc obj=new Calc();
int result=obj.add(new int[]{1,2,3,4,5,6});
System.out.println(result);        
    }
    
}
