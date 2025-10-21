
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Integer> arr= new ArrayList<>();
		int n = Integer.parseInt(bf.readLine());
		for(int i = 0; i<n; i++) {
			String temp = bf.readLine();
			int val = 0;
			st = new StringTokenizer(temp);
			String cmd = st.nextToken();
			if(st.hasMoreTokens()) val = Integer.parseInt(st.nextToken());
			if(cmd.equals("push_back")) arr.add(val);
			else if(cmd.equals("get")) System.out.println(arr.get(val-1));
			else if(cmd.equals("size")) System.out.println(arr.size());
			else if(cmd.equals("pop_back")) arr.remove(arr.size()-1);
		}
	}
}
