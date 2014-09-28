import java.util.*;
class PT07Y {
	public static void main (String [] args) throws Exception{
		Scanner in = new Scanner (System.in);
		int nodes = scan(in);
		int edges = scan(in);
		if (nodes != edges + 1){
			System.out.println("NO");
		}
		else{
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i <= nodes; i++){
				list.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < edges; i++){
				int a = scan(in);
				int b = scan(in);
				list.get(a).add(b);
				list.get(b).add(a);
			}
			Queue <Integer> queue = new LinkedList<Integer>();
			queue.add(1);
			boolean [] visited = new boolean [nodes + 1];
			visited[1] = true;
			int current = 0;
			while (!queue.isEmpty()){
				current = queue.remove();
				ArrayList<Integer> neighbors = list.get(current);
				for (int n = 0; n < neighbors.size(); n++){
					int neighbor = neighbors.get(n);
					if (!visited[neighbor]){
						visited[neighbor] = true;
						queue.add(neighbor);
					}
				}
			}
			boolean tree = true;
			for (int x = 1; x < visited.length; x++){
				if (!visited[x]){
					tree = false;
					break;
				}
			}
			if (tree){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	
	public static int scan(Scanner in) throws Exception{
		return Integer.parseInt(in.next());
	}
}

