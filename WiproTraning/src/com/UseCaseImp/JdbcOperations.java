package com.UseCaseImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.UseCase.Employee;

public class JdbcOperations {
	Employee em = new Employee();
	Scanner in = new Scanner(System.in);
	public void values() {
		System.out.println("Enter Employee id");
		int id = in.nextInt();
		System.out.println("Enter Employee name");
		String name = in.next();
		System.out.println("Enter Employee salary");
		int sal= in.nextInt();
		em.setEid(id);
		em.setEname(name);
		em.setSalary(sal);
	}
	public void insert() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","krupa555");
		PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?)");
		ps.setInt(1,em.getEid());
		ps.setString(2,em.getEname());
		ps.setInt(3,em.getSalary());
		int x= ps.executeUpdate();
		if(x>0) {
			System.out.println("record inserted");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void update() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","krupa555");
		PreparedStatement ps = con.prepareStatement("UPDATE Employee SET ENAME=?,ESAL=? WHERE EID=?");
		ps.setInt(3,em.getEid());
		ps.setString(1,em.getEname());
		ps.setInt(2,em.getSalary());
		
		int x= ps.executeUpdate();
		if(x>0) {
			System.out.println("record updated");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void delete(int num) {
		em.setEid(num);
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","krupa555");
		PreparedStatement ps = con.prepareStatement("delete from Employee WHERE EID=?");
		ps.setInt(1,em.getEid());
		
		int x= ps.executeUpdate();
		if(x>0) {
			System.out.println("record Deleted");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void select() {
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","krupa555");
		PreparedStatement ps = con.prepareStatement("select * from Employee");
		
		ResultSet x= ps.executeQuery();
		while(x.next()){
			System.out.println("Employee id "+x.getInt(1)+" Employee name "+x.getString(2)+" Employee salary "+x.getInt(3));
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
