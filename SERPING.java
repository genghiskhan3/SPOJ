import java.util.*;
import java.io.*;
class SERPING{
	public static void main(String[] args)throws Exception {
		Parser in = new Parser (System.in);
		StringBuilder string = new StringBuilder();

		String input = in.next();

		while (!input.equals("0")){
			
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(input.length());
			for (int i = 0; i < input.length(); i++){
				list.add(new ArrayList<Integer>());
			}

			for (int i = 1; i < input.length(); i++){
				if (input.charAt(i) == '0'){
					if (list.get(i).size() % 2 != 0){
						for (int k = i; k < list.size(); k += i){
							list.get(k).add(i);
						}
					}
				} else{
					if (list.get(i).size() % 2 == 0){
						for (int k = i; k < list.size(); k += i){
							list.get(k).add(i);
						}
					}
				}
			}

			//int [] answers = new int [input.length()];

			for (int i = 1; i < input.length(); i++){
				ArrayList<Integer> cur = list.get(i);

				if (cur.size() != 0 && cur.get(cur.size() - 1) == i){
					string.append(i + " ");
				}
			}
			string.append("\n");

			input = in.next();
		}
		System.out.print(string);
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
