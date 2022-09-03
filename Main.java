// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2
// [1,0,2,6,99,4,8,9] = 11  
// [2,4]  Target = 6, Answer =0,1

import java.util.*;

class Main {
  public static void main(String[] args) {
    /*
      
    */

    String ind = findTarget1(new int[]{2,4}, 6);
    
  System.out.println(ind); 
  }

  public static String findTarget(int [] array, int target){
// [1,9,2,19] 
// {2,-6,1,-16}

    for(int i=0; i<array.length ; i++){
        
      for(int j=i+1; j<array.length ; j++){
          //if(target-array[i]==array[j])
          if(array[i] + array [j] == target){
            return String.format("%d, %d", i, j);
          }
    }
  }
  return null;
  }

   public static String findTarget1(int [] array, int target){
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
     for(int i=0; i<array.length ; i++){
       map.put(array[i], i);
     }
    
    for(int i=0; i<array.length ; i++){
       int diff = target-array[i];        
       if(map.contains(diff))
       {
         return String.format("%d, %d", i, map.get(diff));
       }
    }

  return null;
  }
  
}