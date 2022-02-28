//link in codiva.io ide >> https://www.codiva.io/p/7226a25a-f5b2-4584-8467-1e6532c849ed

import java.util.*;


class Graph1 {
  	
  	public boolean adj[][];
  	public int vertex;
      
   	public Graph1(int vertex)
    {
    	this.vertex = vertex;
      	adj = new boolean [vertex][vertex];
    }
  
  	//add vertex
  	public void add(int u,int v)
    {
      adj[u][v]=true;
      adj[v][u]=true;
    }
    //remove vertex
  	public void remove(int u,int v)
    {
      adj[u][v]=false;
      adj[v][u]=false;
    }
    //print the adjmatrix
  	public String print()
    {
      StringBuilder stb = new StringBuilder();
      
      for(int i=0;i<vertex;i++)
      {
        stb.append(i+": ");
        for(boolean b:adj[i])
        {
          stb.append((b?1:0)+" ");
        }
       stb.append("\n");
      }
      return stb.toString();
    }
  
  public static void main(String[] args) {
    
    Graph1 g1 = new Graph1(4);
    
    g1.add(1,2);
   	g1.add(3,2);
    
    System.out.println(g1.print());
    
        
  }
}
