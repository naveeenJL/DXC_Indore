package json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class Dxcemployee{
	String empid,empname;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

public class jsondbexample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Dxcemployee> mlist=new ArrayList<Dxcemployee>();
		
		File mFile=new File("C:\\Users\\lenovo\\Downloads\\dxc_employee.json");
		FileReader mReader=new FileReader(mFile);
		
		JSONParser mJsonparser= new JSONParser();
		JSONObject mJsonObject= (JSONObject) mJsonparser.parse(mReader);
		
		JSONArray employeearray=(JSONArray) mJsonObject.get("DXC_Employee");
		for(int i=0;i<employeearray.size();i++)
		{
			Dxcemployee mObject=new Dxcemployee();
			JSONObject mJsoninnerobject=(JSONObject) employeearray.get(i);
			mObject.setEmpid((String)mJsoninnerobject.get("id"));
			mObject.setEmpname((String) mJsoninnerobject.get("name"));
			
			mlist.add(mObject);
			
		}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeedb?serverTimezone=UTC", "nav","1234");
		
		for(int i=0;i<mlist.size();i++)
		{
			Dxcemployee mObject=mlist.get(i);
			PreparedStatement pstmt= con.prepareStatement("insert into employee values(?,?)");
			pstmt.setString(1, mObject.getEmpname());
			pstmt.setString(2, mObject.getEmpid());
			pstmt.executeUpdate();
			pstmt.close();
		}
		System.out.println("inserted succesfully");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next())
			System.out.println("emplyee name:" +rs.getString(1)+ "employee ID: " +rs.getString(2));
		con.close();
		
	}

}
