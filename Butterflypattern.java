import java.util.*;
public class Main {
    
    static int k=1;
    
    public static void print(int stop){
        
        for(int i=1;i<=stop;i++){
            
            if(i==stop)
            System.out.print(k++);
            
            else
            System.out.print((k++)+"-");
        }
    }
    
    public static void printRev(int stop,int t){
        
        for(int i=1;i<=stop;i++,t--){
            
            if(i==stop)
            System.out.print(t);
            
            else
            System.out.print(t+"-");
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int l=(n/2)+1,k1=n-2;
		
	   
		
		for(int i=0;i<n/2;i++){
		    
	        System.out.print("-".repeat(i*3));
	        
	        if(i%2==0){
	            print(l);
	            System.out.print("-".repeat(k1));
	            printRev(l,k-1);
	        }
	        
	        else{
	            
	            printRev(l,l+k-1);
	            System.out.print("-".repeat(k1));
	            print(l);
	        }
	        
	        l--;k1-=2;
	        System.out.println();
	   
		}
		
		System.out.println("-".repeat(3*(n/2))+"0");
		l=2;k1=1;k=1;
		
		for(int i=(n/2)-1,t=1;i>=0;i--,t++){
		    
		    System.out.print("-".repeat(3*i));
		    
		    if(t%2==0){
		        print(l);
		        System.out.print("-".repeat(k1));
		        printRev(l,k-1);
		    }
		    
		    //System.out.print("-".repeat(k1));
		    
		    else{
		        printRev(l,l+k-1);
		        System.out.print("-".repeat(k1));
		        print(l);
		    }
		    
		    l++;k1+=2;
		    System.out.println();
		}
		

	}
}
