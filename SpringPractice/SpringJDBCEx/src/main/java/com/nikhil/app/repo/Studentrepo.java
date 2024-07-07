package com.nikhil.app.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nikhil.app.Student;

@Repository
public class Studentrepo {
	
	private JdbcTemplate jdbc;
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student std1) {
		String sql="insert into student(rollno,name,marks) values(?,?,?)";
		int ar=jdbc.update(sql,std1.getRollNo(),std1.getName(),std1.getMarks());

		System.out.println(ar+" rows affected");
	}

	public List<Student> findAll() {
		
		RowMapper<Student> mapper=new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s=new Student();
				s.setRollNo(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setMarks(rs.getInt("marks"));
				
				return s;
			}
		};
		
		String sql="SELECT * FROM student";
		return jdbc.query(sql, mapper);
	}

}
