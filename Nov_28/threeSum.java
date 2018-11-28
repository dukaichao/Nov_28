package cn.dkc.Nov_28;

import java.util.ArrayList;
import java.util.List;

public class threeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> list = new ArrayList<List<Integer>>();
		 for(int i = 0;i<nums.length-2;i++) {
			 for(int j = i+1;j<nums.length - 1;j++) {
				 for(int k = j+1;k<nums.length;k++) {
					 if(nums[i]+nums[j]+nums[k] == 0) {
						 for(int m = 0;m<list.size();m++) {
							 if(list.get(m).contains(nums[i])&&list.get(m).contains(nums[j])&&list.get(m).contains(nums[k])&&(nums[i]!=0||nums[j]!=0||nums[k]!=0)) {
								 list.remove(m);
								 break;
							 }
						 }
						 List<Integer> l = new ArrayList<Integer>();
						 l.add(nums[i]);
						 l.add(nums[j]);
						 l.add(nums[k]);
						 if(!list.contains(l)) {
							 list.add(l);
						 }
					 }
				 }
			 }
		 }
		 return list;
	 }
	 public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] arr = {0,-6,0,-14,2,0,-9,5,-9,-8,-7,12,-4,14,-6,6,0,5,-2,6,-7,1,10,-10,-5,3,-2,-3,-13,-6,1,-6,3,9,-5,12,-6,-7,2,0,1,11,-11,4,2,-2,-5,-13,11,0,9,11,-13,-4,-13,-11,14,-8,1,8,1,9,-13,-11,3,-11,9,12,-2,-4,-11,6,14,-7,-5,1,-1,-3,-4,-5,12,12,13,6,-7,-15,10,14,14,-12,8,0,13,2,-3,1,-1,-9,-9,12,-6,-5,-5,-6,4,5,2,10,-13,13,12,6};
		list = new threeSum().threeSum(arr);
		for(List<Integer> l:list) {
			System.out.println(l);
		}
		/* List<List<Integer>> list = new ArrayList<List<Integer>>();
		 List<Integer> l = new ArrayList<Integer>();
		 l.add(0);
		 l.add(0);
		 l.add(0);
		 System.out.println(list.contains(l));*/
	}
}
