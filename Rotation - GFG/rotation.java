//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] = arr[i];
        }
        Arrays.sort(res);
      for(int i=0; i<arr.length; i++){
           if(arr[i]==res[0]){
               return i;
           }
      }
      return 0;
    }
}