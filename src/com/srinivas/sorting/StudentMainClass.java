package com.srinivas.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList=new ArrayList();
		studentList.add(new Student(100,"Srinivas","Sanaka","10th"));
		studentList.add(new Student(104,"Gnaneswar","Kota","3rd"));
		studentList.add(new Student(102,"Hasini","Kota","4th"));
		studentList.add(new Student(103,"NagaLakshmi","Kota","9th"));
		Stream stream1=studentList.stream();
		studentList.stream().forEach(System.out::println);
		System.out.println("-----------------------------------");
		studentList.add(new Student(105,"Nagaraji","Sanaka","12th"));
		studentList.stream().forEach(System.out::println);
		System.out.println("-----------------------------------");
		Stream stream2=studentList.stream();
//		if(studentList.stream().anyMatch((s1)->s1.studentID==106))
//		{
//			System.out.println("Before Sorting");
//			System.out.println(studentList);
//			System.out.println("After Sorting");
//			studentList.stream().sorted((s1,s2)->s1.studentID-s2.studentID).forEach(System.out::println);
//			studentList.stream().filter((s1)->s1.studentID>102).collect(Collectors.toList());
//			for(Student student:studentList)
//				System.out.println(student+" "+student.getStudentFName());
////			Collections.sort(studentList, new SortByStudentId());
////			System.out.println(studentList);
//		}else
//		{
//			System.out.println("Expected Result Not existed");
//		}
//		Stream s3=Stream.concat(stream1, stream2);
//		s3.forEach(System.out::println);
		System.out.println("-----------------------------------");
		Stream.concat(stream1, stream2).distinct().forEach(System.out::println);
		System.out.println("-----------------------------------");
		 List<String> list = Arrays.asList("5.6", "7.4", "4","1", "2.3");
		 list.stream().flatMap(num->Stream.of(Double.parseDouble(num)+4.0)).forEach(System.out::println);
		
	}

}
