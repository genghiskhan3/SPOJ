import java.util.*;
import java.io.*;
class EZDIJKST{
	public static void main(String[] args) throws Exception{
		Parser in = new Parser (System.in);
		StringBuilder string = new StringBuilder();

		int tests = in.nextInt();

		for (int t = 0; t < tests; t++){
			int vertices = in.nextInt();
			int edges = in.nextInt();

			Vertex [] graph = new Vertex [vertices + 1];

			for (int i = 1; i <= vertices; i++){
				graph[i] = new Vertex(i);
			}

			for (int i = 0; i < edges; i++){
				int a = in.nextInt();
				int b = in.nextInt();
				int d = in.nextInt();

				graph[a].neighbors.add(new Edge(b, d));
			}

			int start = in.nextInt();
			int end = in.nextInt();

			int answer = dijkstra(graph, start, end);

			if (answer != -1){
				string.append(answer+"\n");
			} else{
				string.append("NO\n");
			}
		}

		System.out.print(string);
	}

	public static int dijkstra(Vertex [] graph, int start, int ending){
		Vertex current = graph[start];
		current.minDistance = 0;

		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
		pq.add(current);

		while(!pq.isEmpty()){
			current = pq.remove();

			if (current.id == ending){
				break;
			}

			for (Edge edge : current.neighbors){
				Vertex end = graph[edge.end];
				int dist = edge.distance;

				int newDistance = current.minDistance + dist;

				if (newDistance < end.minDistance){
					pq.remove(end);
					end.minDistance = newDistance;
					pq.add(end);
				}
			}
		}

		if (graph[ending].minDistance != Integer.MAX_VALUE){
			return graph[ending].minDistance;
		} else{
			return - 1;
		}
	}

	public static class Vertex implements Comparable<Vertex>{
		int minDistance, id;
		List<Edge> neighbors;

		public Vertex(int id){
			this.id = id;
			this.minDistance = Integer.MAX_VALUE;
			this.neighbors = new ArrayList<Edge>();
		}

		public int compareTo(Vertex v){
			return this.minDistance - v.minDistance;
		}
	}

	public static class Edge {
		int end, distance;

		public Edge(int end, int distance){
			this.end = end;
			this.distance = distance;
		}
	}

	public static class Parser
	{
	   final private int BUFFER_SIZE = 1 << 16;
	 
	   private DataInputStream din;
	   private byte[] buffer;
	   private int bufferPointer, bytesRead;
	 
	   public Parser(InputStream in)
	   {
	      din = new DataInputStream(in);
	      buffer = new byte[BUFFER_SIZE];
	      bufferPointer = bytesRead = 0;
	   }
	 
	   public long nextLong() throws Exception
	   {
	      long ret = 0;
	      byte c = read();
	      while (c <= ' ') c = read();
	      boolean neg = c == '-';
	      if (neg) c = read();
	      do
	      {
	         ret = ret * 10 + c - '0';
	         c = read();
	      } while (c > ' ');
	      if (neg) return -ret;
	      return ret;
	   }
	   
	   //reads in the next string
	   public String next() throws Exception
	   {
	      StringBuilder ret =  new StringBuilder();
	      byte c = read();
	      while (c <= ' ') c = read();
	      do
	      {
	         ret = ret.append((char)c);
	         c = read();
	      } while (c > ' ');
	      return ret.toString();
	   }
	 
	   public int nextInt() throws Exception
	   {
	      int ret = 0;
	      byte c = read();
	      while (c <= ' ') c = read();
	      boolean neg = c == '-';
	      if (neg) c = read();
	      do
	      {
	         ret = ret * 10 + c - '0';
	         c = read();
	      } while (c > ' ');
	      if (neg) return -ret;
	      return ret;
	   }
	   
	   private void fillBuffer() throws Exception
	   {
	      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	      if (bytesRead == -1) buffer[0] = -1;
	   }
	 
	   private byte read() throws Exception
	   {
	      if (bufferPointer == bytesRead) fillBuffer();
	      return buffer[bufferPointer++];
	   }
	}
}
