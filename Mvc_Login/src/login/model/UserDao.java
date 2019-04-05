package login.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import login.db.Provider;
import login.db.Users;

public class UserDao 
{
	public static int save(Users u)
	{
		int status=0;
		try
		{
			Connection con=Provider.getConnection();
			PreparedStatement ps=con.prepareStatement(  
					"insert into  loginWebserver values(?,?)");  
			ps.setString(1,u.getEmail());  
			ps.setString(2,u.getPassword()); 
			status=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}

}
