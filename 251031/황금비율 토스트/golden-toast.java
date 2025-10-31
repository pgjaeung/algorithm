import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		LinkedList <Character> list = new LinkedList<>();
		String words = bf.readLine();
		for(int i = 0; i<N; i++) {
			list.add(words.charAt(i));
		}
		
		ListIterator<Character> it = list.listIterator(list.size());
		
		for(int i = 0; i<M; i++) {
			st = new StringTokenizer(bf.readLine());
			switch(st.nextToken()) {
			case "L":
				if(it.hasPrevious()) it.previous();
				break;
			case "R":
				if(it.hasNext()) it.next();
				break;
			case "D":
				if(it.hasNext()) {
					it.next();
					it.remove();
				}
				break;
			case "P":
				char c = st.nextToken().charAt(0);
				it.add(c);
				break;
			}
				
		}
		for(char c: list) bw.write(c);
		bw.newLine();
		bw.flush();
		bw.close();
		bf.close();
	}

}
