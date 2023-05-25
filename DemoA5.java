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








public class DemoA5 {
    public static void main(String[] args) {
        Calc obj=new Calc();
        int nums[]={1,2,3,4,5,6};
        int result = obj.add(nums);
        System.out.println(result);

    }
    
}
