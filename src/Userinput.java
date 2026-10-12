import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Userinput
{
    public static void main(String[] args) throws Exception
    {
        int n=0;
        System.out.println("Enter a number");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            n = Integer.parseInt(br.readLine());
        }

        System.out.println(n);
    }
}