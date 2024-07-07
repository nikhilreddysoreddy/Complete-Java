import java.sql.Connection;
import java.sql.PreparedStatement;
public class Model {
	private String name;
	private String email;
	private String pass;
	private String cpass;
	private Connection connect=null;
	private PreparedStatement pstmt=null;
	int ra;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	
	public int register() {
		try 
		{
			connect=JdbcUtil.getConnection();
			pstmt=connect.prepareStatement("INSERT INTO personalinfo(uname,email,pass,cpass) values(?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2,email);
			pstmt.setString(3,pass);
			pstmt.setString(4, cpass);
			
			ra=pstmt.executeUpdate();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ra;
	}
}
