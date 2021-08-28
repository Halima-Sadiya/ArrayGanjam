package javaapplication1;


public class Ganjam {
    public static void main(String[] args) {
        
    int [][]myarray= new int[10][10];
		int numrows= myarray.length; 
		int numcols=myarray[0].length;
		
		for (int row =0;row<numrows;row++) {
			for (int col=0;col<numcols;col++) {
				myarray[row][col] = row*numcols + col + 1;
			}
		}
		
	    for (int row=0;row<numrows;row++) {
	    	for(int col=0;col<numcols;col++) {
	    		System.out.print(" "+myarray[row][col]);
	    	}
	    	
	    	System.out.println();
	    }
            
            //---------Even or Odd-----------
            
            System.out.println();
            System.out.println("The even numbers are given below :");
            System.out.println();
           
            for(int i=0;i<numrows;i++){
                for(int j=0;j<numcols;j++){
                    if(myarray[i][j]%2==0){
                        System.out.println(myarray[i][j]+" is a Even number");
                    }
                }
                
            }  
            System.out.println();
            System.out.println("The Odd numbers are given below : ");
            System.out.println();
            for(int i=0;i<numrows;i++){
                for(int j=0;j<numcols;j++){
                    if(myarray[i][j]%2!=0){
                        System.out.println(myarray[i][j]+" is a Odd number");
                    }
                }
                
            } 
            
            System.out.println();
            
            //-------------Prime Number ----------------
            
            
                
            }
       
        }    
            

        
    
