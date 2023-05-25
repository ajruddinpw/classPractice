import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
//unchecked and checked exception
public class Checked_unchec {
    public static void main(String[] args) {
        int res=9/0;//run karne pe error a a raha hai ,compiler force nahi kar raha hai 

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String str=br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
