package com.company.BS;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class Insertion3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersect_2(arr1,arr2)));

    }
    //Return type is Integer Array
    static public Integer[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
               if(nums1[i] == nums2[j]) {
                   list.add(nums1[i]);
                   nums2[j] = -1;
                   break;
               }
            }
        }
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

        return arr;
    }

   //return type is int Array
    static public int[] intersect_2(int[] nums1, int[] nums2) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] g = new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            g[i] = list.get(i);
        }
        return g;
    }

    //Optimise
    static public int[] intersect_3(int[] nums1, int[] nums2) {
        //Not Considering Sorting as It increase Time
        //  Arrays.sort(nums1);
        // Arrays.sort(nums2);
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] g = new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            g[i] = list.get(i);
        }
        return g;
    }
}
