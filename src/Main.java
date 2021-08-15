
public class Main {
	 public static void main(String[] args) {
		    System.out.println("The list before sorting");
		    int[]list=new int[]{6,4,2,1,5,8,7,3,10};
		     print(list);
		    //SelectionSort(list);
		    //BubbleSort(list);
		     QuickSort(list,0,list.length-1);
		    System.out.println("The list after sorting");
		    print(list);
		    
		  }

		 static int[] SelectionSort(int[] list)
		  {      int min; 
		         int temp;
		         int mini;  
		     for( int j=0;j<list.length;j++)
		     {
		       min=list[j];  
		       mini=j ;
		       for(int i=j;i<list.length;i++) 
		          {
		           
		           if(list[i]<min)
		           {     min=list[i];
		                 mini=i;
		                
		           }
		           }
		     if (min<list[j])
		     {
		      temp=list[j];
		      list[j]=list[mini];
		      list[mini]=temp;
		     }
		     }

		    return list;
		}

		static int[] BubbleSort( int[]list){
		   int temp;
		   for (int i=0;i<list.length-1;i++)
		   {  for (int j=0;j<list.length-1-i;j++)
		     {  
		        if(list[j]>list[j+1]){
		           temp=list[j];
		           list[j]=list[j+1];
		           list[j+1]=temp;

		     }

		     }
		    
		   }
		 return list;
		}
		
        static int[] MergeSort( int[]list) {
			
        	
			
			return list;
		}
        
        
        
        
		static int[] QuickSort( int[]list,int start,int end) {
			if(end==start)
			   return list;
			else {
				int i=start-1,j=start,pivot=end,temp;
				while(j!=pivot) {
					if(list[j]<=list[pivot])
					{
						i++;
						temp=list[j];
						list[j]=list[i];
						list[i]=temp;
					}
					j++;
				}
				i++;
				temp=list[pivot];
				list[pivot]=list[i];
				list[i]=temp;
				
				 if(i-1 > start)
				   return QuickSort(list,start,i-1);
				 if(start < end)
				   return QuickSort(list,i+1,end);
				 				
			}
			return list;
			
		}
		
		
		 static void print(int []list){
		  for(int i=0;i<list.length;i++){
		     System.out.print(list[i]+" ");
		  }
		  System.out.println();
		}
		  

}
