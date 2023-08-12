package com.srinivas.sorting;

import java.util.Comparator;

public class SortByStudentId implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		return st1.getStudentID()-st2.getStudentID();
	}

}
