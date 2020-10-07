import java.io.Console;
class myfun
{
   public static class ABVar
   {  int A, B;  }
   
   static String Inverse(String s)
   {
      int k=s.length(); int i; String z="";
      //for(i=k-1; i>=0; i=i-1) { z=z+s.substring(i,i+1); } 
	  for(i=0; i<=k-1; i=i+1) { z=s.substring(i,i+1)+z; }
      return( z );
   } 

   static String Keyin( String msg )
   {
      Console in = System.console();
	  String s = in.readLine(msg);
	  return(s);
   }

   static int Random(int n)
   {  return( (int)(Math.random()*n) ); }
   
   static int Random(int n, int m)
   {  return( n+Random(m-n+1) ); } 
   
   static void RandNumbers(int[] a, int n, int m, int cnt)   
   {         
       int i,j,k;
 	   a[0]=Random(n,m); 
	   for(i=1; i<cnt; i=i+1)
	   { 
	      do
		  {
	         a[i]=Random(n,m); 
			 k=0;
		     for(j=0; j<i; j=j+1)
		     {  if( a[i]==a[j] ){ k=1; break; } }  
		  }while(k==1);		 
	   }   	
   }
   
   static boolean CheckSame(String s)
   {
      boolean fg; int i; String z,p;
      fg=false;
	  for(i=0; i<(s.length()-1); i=i+1)
	  {
	     z=s.substring(i,i+1); p=s.substring(i+1,s.length());
	     if( p.indexOf(z)>=0 ) { fg=true; break; }	      
	  }   
      return( fg ); 
   }
   
   static String Answer1()
   {
       int ans=0;
	   int[] m=new int[4];	   
	   do
	   { myfun.RandNumbers(m,0,9,4);
	   }while(m[0]==0);
	   ans=m[0]*1000+m[1]*100+m[2]*10+m[3];   
       return( String.valueOf(ans) );
   }
   
   static String Answer2()
   {   
      String ans, z, p; int i, k; 	  
	  do
      {	   
	      ans=String.valueOf( myfun.Random(1000,9999) );
		  k=0;
	      for(i=0; i<3; i=i+1)
	      {
	        z=ans.substring(i,i+1); p=ans.substring(i+1,4);
	        if( p.indexOf(z)>=0 ) { k=1; break; }	      
	      }
	  }while(k==1);   
	  return(ans);
   }
   
   static int CountAB(String ans, String gus)
   {
       int A=0; int B=0; int i,k; String z;
	   for(i=0; i<4; i=i+1)
	   {
	      z=gus.substring(i,i+1);
		  k=ans.indexOf(z);
		  if( k>=0 ) {  if(k==i) { A=A+1; } else { B=B+1; }  }
	   }	         
       return( A*10+B );
   }
   
   static ABVar CountAB2(String ans, String gus)
   {
       ABVar pp = new ABVar();
	   pp.A=0; pp.B=0; int i,k; String z;
	   for(i=0; i<4; i=i+1)
	   {
	      z=gus.substring(i,i+1);
		  k=ans.indexOf(z);
		  if( k>=0 ) {  if(k==i) { pp.A=pp.A+1; } else { pp.B=pp.B+1; }  }
	   }	         
       return( pp );
   }
}   