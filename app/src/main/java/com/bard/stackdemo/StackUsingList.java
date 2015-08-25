package com.bard.stackdemo;
/*
Question - Implement an integer stack using java ArrayList
			Stack should have the following functions and follow LIFO (Last In First Out)
	Functions - void push(int a)
			  - int pop()
			  - boolean isEmpty()
Author - Neerad Kumar G
*/			

import java.util.ArrayList;
class StackUsingList{
	public ArrayList<Integer> data = new ArrayList<>();
	public void push(int a){
		data.add(a);
	}
	public int pop(){
		int size = data.size();
		int temp = data.get(size-1);
		data.remove(size-1);
		return temp;
	}
	public boolean isEmpty(){
		return (data.size() == 0);
	}

}