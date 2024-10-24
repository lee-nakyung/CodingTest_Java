import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
       
        int A = Integer.parseInt(st.nextToken()); //2
        int B = Integer.parseInt(st.nextToken()); //1
        int V = Integer.parseInt(st.nextToken()); //5
        
        int day = (V-B)/(A-B);
        
        
        if((V-B)%(A-B)!=0) {
        	day++;
        }
        
        System.out.println(day);
        
    }
    
}




