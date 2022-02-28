//codiva.io ide link :
// https://www.codiva.io/p/7226a25a-f5b2-4584-8467-1e6532c849ed


import java.util.*;
class graph3al2 {
  
  //add edge methode
  public static void addEdge(ArrayList<ArrayList<Integer>> al,int u,int v)
  {
   	al.get(u).add(v);
    al.get(v).add(u);
  }
  
  //printgraph
  public static void printgraph(ArrayList<ArrayList<Integer>>al)
  {
	for(int i=0;i<al.size();i++)
    {
      System.out.print("\n vertex "+i+":");
      for(int j=0;j<al.get(i).size();j++)
      {
        System.out.print("->"+al.get(i).get(j));
      }
      System.out.println();
    }
  }
  
  
  //main methode
  public static void main(String[] args)
  {
   //create a graph 
    int v=5;
    ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>(v); 
    
    for(int i=0;i<v;i++)
    {
      al.add(new ArrayList<Integer>());
    }
    
    //call add edge
    addEdge(al,0,1);
    addEdge(al,0,2);
    addEdge(al,0,3);
    addEdge(al,1,2);
    
    printgraph(al);
  }
}
