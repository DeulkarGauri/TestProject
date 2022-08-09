package com.array;
// program to count frequency of array elements
public class FrequencyOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a [] = new int[] {1,2,3,4,2,3,3,2,1,1,5};
// create array to store repeated number

int b [] = new int[a.length];
int visited = -1;  
for(int i = 0; i < a.length; i++){  
    int count = 1;  
    for(int j = i+1; j < a.length; j++){  
        if(a[i] == a[j]){  
    
        	count++;
        	
        	b[j] =  visited;
        	
	}

}
    if(b[i] != visited)  
        b[i] = count;  
    
}
System.out.println("___________________________");
System.out.println("frequency of element");
System.out.println("___________________________");
for(int i = 0; i < b.length; i++){  
    if(b[i] != visited)  
System.out.println("    " + a[i] + "    |    " + b[i]);
}


System.out.print("___________________________");
	}
    }
