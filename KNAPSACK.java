import java.util.*;
import java.io.*;

class KNAPSACK{

   private static int numOfvalues, size;
   private static int [][] memo;
   private static int [] weight;
   private static int [] values;


   private static int value(int id, int rw){
      if (id == numOfvalues){
         return 0;
      }
      if (rw == 0){
         return 0;
      }
      if (memo[id][rw] != -1){
         return memo[id][rw];
      }
      if (weight[id] > rw){
         return value(id + 1, rw);
      }

       memo[id][rw] = Math.max(value(id + 1, rw), values[id] + value(id + 1, rw - weight[id]));
       return memo[id][rw];
   }


   public static void main(String[] args) throws Exception {
      Parser in = new Parser (System.in);

      size = in.nextInt();

      numOfvalues = in.nextInt();

      memo = new int [numOfvalues + 1][size + 1];

      for (int [] array : memo){
         Arrays.fill(array, -1);
      }

      weight = new int [numOfvalues + 1];
      values = new int [numOfvalues + 1];

      for (int t = 0; t < numOfvalues; t++){
         int itemSize = in.nextInt();
         int itemValue = in.nextInt();

         weight[t] = itemSize;
         values[t] = itemValue;
      }

      int answer = value(0, size);

      System.out.println(answer);


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

