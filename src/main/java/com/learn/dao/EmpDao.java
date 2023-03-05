package com.learn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.learn.bean.Employee;
import com.learn.utils.DatabaseUtil;

public class EmpDao {

	public List<Employee> getAllEmployees(int start, int total)
	{
		List<Employee> employess = new ArrayList<>();
		DatabaseUtil dbUtil = new DatabaseUtil();
		
		String query="select * from employee limit"+(start)+","+total;
		
		try(Connection conn =dbUtil.getConnection();
				Statement s=conn.createStatement();
				ResultSet r=s.executeQuery(query);) {
		
		while(r.next())
		{
			Employee e=new Employee();
			e.setId(r.getInt("Id"));
			e.setName(r.getString("name"));
			e.setSalary(r.getInt("salary"));
		}
		} catch (Exception e) {
		System.out.println(e.getMessage());	
		}
		
		
		
		return employess;
		
	}
}
