import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> arr = new LinkedList<>();
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push_front":
                    arr.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    arr.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (arr.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(arr.removeFirst()).append('\n');
                    break;
                case "pop_back":
                    if (arr.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(arr.removeLast()).append('\n');
                    break;
                case "size":
                    sb.append(arr.size()).append('\n');
                    break;
                case "empty":
                    sb.append(arr.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    if (arr.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(arr.getFirst()).append('\n');
                    break;
                case "back":
                    if (arr.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(arr.getLast()).append('\n');
                    break;
                default:
                    sb.append("Command False").append('\n');
            }
        }

        System.out.print(sb.toString());
        bf.close();
    }
}