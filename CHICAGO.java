import java.util.*;
import java.io.*;

class CHICAGO{
	public static void main(String[] args) throws Exception{
		Parser in = new Parser(System.in);
		StringBuilder string = new StringBuilder();
		int vertices = in.nextInt();

		while (vertices != 0){
			int edges = in.nextInt();

			//double [][] cost = new double [vertices + 1][vertices + 1];
			Vertex [] graph = new Vertex [vertices + 1];

			for (int i = 1; i < vertices + 1; i++){
				graph[i] = new Vertex(i); 
			}

			for (int i = 0; i < edges; i++){
				int a = in.nextInt();
				int b = in.nextInt();
				double c = (double)in.nextInt() / 100.0;

				graph[a].neighbors.add(new Edge(b, c));
				graph[b].neighbors.add(new Edge(a, c));
			}

			int start = 1;
			int end = vertices;

			double answer = dijkstra(graph, start, end);
			double hold = answer * 100;
			string.append(String.format("%.6f percent\n", hold));

			vertices = in.nextInt();
		}

		System.out.print(string.toString());
	}


	public static double dijkstra(Vertex [] graph, int start, int finish){
		Vertex current = graph[start];
		current.minDistance = 1.0;

		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>();
		pq.add(current);

		while (!pq.isEmpty()){
			current = pq.remove();

			if (current.id == finish){
				break;
			}

			for (Edge edge : current.neighbors){
				Vertex end = graph[edge.end];
				double dist = edge.distance;
				double newDistance = current.minDistance * dist;

				if (newDistance > end.minDistance){
					pq.remove(end);
					end.minDistance = newDistance;
					pq.add(end);
				}
			}
		}

		return graph[finish].minDistance;

	}

	public static class Vertex implements Comparable<Vertex>{
		int id;
		double minDistance;
		List<Edge> neighbors;

		public Vertex(int id){
			this.id = id;
			this.minDistance = Double.MIN_VALUE;
			this.neighbors = new ArrayList<Edge>();
		}

		public int compareTo(Vertex v){
			return(int) ((v.minDistance - this.minDistance) * 100);
		}
	}

	public static class Edge{
		int end;
		double distance;

		public Edge(int end, double distance){
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
