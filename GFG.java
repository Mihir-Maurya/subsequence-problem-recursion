/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
   
   //count subsequence with sum k
   private static int countSWithSK(int indx,int a[],int n,int sum,int curSum){
      if(indx==n){
        if(curSum==sum)
        return 1;
        else 
        return 0;
      }
      
      
     int l = countSWithSK(indx+1,a,n,sum,curSum+a[indx]);
     
     int r = countSWithSK(indx+1,a,n,sum,curSum);
     
      
   return r+l;
   }

   //print anyone subsequence with sum k
    private static boolean printOSWithSK(int indx,int a[],ArrayList<Integer> list,int n,int sum,int curSum){
      if(indx==n){
      
        if(curSum==sum){
      for(int i:list)
      System.out.print(i+" ");
      return true;
      }else
      return false;
      }
      
      list.add(a[indx]);
     if(printOSWithSK(indx+1,a,list,n,sum,curSum+a[indx]))
      return true;
      list.remove(list.size()-1);
     if(printOSWithSK(indx+1,a,list,n,sum,curSum))
      return true;
      
   return false;
   }

   
   //print subsequence whose sum is K
   private static void printSWithSK(int indx,int a[],ArrayList<Integer> list,int n,int sum,int curSum){
      if(indx==n){
      
        if(curSum==sum){
      for(int i:list)
      System.out.print(i+" ");
      
      System.out.println();
      }
      return;
      }
      
      list.add(a[indx]);
     printSWithSK( indx+1,a,list,n,sum,curSum+a[indx]);
      list.remove(list.size()-1);
     printSWithSK( indx+1,a,list,n,sum,curSum);
      
   
   }
   //print subsequence
   private static void printSub(int indx,int a[],ArrayList<Integer> list,int n){
      if(indx==n){
      for(int i:list)
      System.out.print(i+" ");
      
      System.out.println();
      
      return;
      }
      
      list.add(a[indx]);
      printSub( indx+1,a,list,n);
      list.remove(list.size()-1);
      printSub(indx+1,a,list,n);
      
   
   }
 
	// private static  void reverse(int i,int j,int a[]){
    //   if(i>j){
    //       return ;
    //   }
      
    //   int temp = a[i];
    //   a[i]=a[j];
    //   a[j]=temp;
    //   reverse(i+1,j-1,a);
    //  }
    
    private static void reverse(int i,int a[]){
        if(i>=a.length/2)
        return;
        int temp = a[i];
        a[i]=a[a.length-i-1];
        a[a.length-i-1]=temp;
        reverse(i+1,a);
    }
    
    //check whether string is palindrome or not
    
    private static boolean isPalindrome(String s,int i){
      
      if(i>=s.length()/2)
      return true;
      if(s.charAt(i) != s.charAt(s.length()-1-i))return false;
      
      return isPalindrome(s,i+1);
      
    }
	public static void main(String[] args) {
 
   int a[] = {1,2,1};
   int n = a.length;
   ArrayList<Integer> list = new ArrayList<>();
   System.out.println(countSWithSK(0, a,n,2,0));
 
 /*
  int n = 10;
  int a[] = new int[n+1];
  a[0]=0;
  a[1]=1;
  
  for(int i=2;i<=n;i++)
    a[i]=a[i-1]+a[i-2];
    
    System.out.print(a[n]);
 
 */
 //String s ="ABvA";
 //System.out.println(isPalindrome(s,0));
/*
	 int a[]={1,2,1};
	 
	 int i = 0;
	 int j=a.length-1;
	 reverse(i,a);
	    for(int e:a)
	    System.out.print(e+" ");
	    */
	}
 }
 
