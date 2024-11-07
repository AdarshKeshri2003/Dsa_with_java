import java.util.ArrayList;

public class recursion8{
static ArrayList<String> getSSQ(String s){
    ArrayList<String> ans = new ArrayList<String>();
    // base case
    if (s.length() ==0){
        ans.add("");
        return ans;

    }
    char curr = s.charAt(0);
    ArrayList<String> smallAns = getSSQ(s.substring(1));//["bc","b","c",""]
     for(String ss: smallAns){
        ans.add(ss);
        ans.add(curr + ss);
     }
     return ans;
}
//Q Given a string wite a method to print all its subsequences
static void printSSQ(String s, String currAns){//s = abc
    if(s.length()==0){
        System.out.println(currAns);
        return;
    }
    char curr = s.charAt(0);//a
    String remString = s.substring(1);//bc

    // curr char -> choosen to be a part of the currAns
    printSSQ(remString,currAns + curr);// bc,a
    // curr char -> not choosen to be a part of the currAns
    printSSQ(remString,currAns);//bc,""
}

// Q Given an array of integers, print sum of all its subsets in it. Output sums can be printed in any orders .
/*
input arr[] = {2,3}
 * output = 0,2,3,5
 * input arr[] = {2,4,5}
 * output = 0,2,4,5,6,7,9,11
 */
static void subsetsum(int[] a,int index,int sum){
    if(index >=a.length){
        System.out.println(sum);
        return;
    }
    //curr index + sum
    subsetsum(a,index+1,sum + a[index]);

    //curr ans
    subsetsum(a, index +1, sum);
}
    public static void main(String[] args){
        ArrayList<String> ans = getSSQ("abc");
        for(String ss: ans){
            System.out.println(ss);}
            System.out.println("Print SSQ");
            printSSQ("abc","");
        int[] array= {2,4,5};
        subsetsum(array, 0, 0);
    }
}