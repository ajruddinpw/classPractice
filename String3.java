public class String3 {
    public static void main(String[] args) {
        // String s1="pwskill";
        // String s2=new String("pwskill");
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));
    //     String s1="pwjava";
    //     String s2="pwjava";
    //     String s3="pwJAVA";
    //     System.out.println(s1==s2);
    //     System.out.println(s1==s3);
    //   System.out.println(  s1.equals(s2));
    //    System.out.println( s1.equals(s3));
    String s1="pwskill";
    String s2=new String("PWSKILL");
    String s3=new String("pwskill");
    System.out.println(s1==s2);
    System.out.println(s2==s3);
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s2.equals(s3));
    }
    
}
