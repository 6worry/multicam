package test;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/spring-config.xml")
@WebAppConfiguration
public class ConnectionPoolTest {
	@Autowired
	DataSource ds;
	@Autowired
	SqlSession sqlsession;
	@Autowired
	JdbcTemplate template;
	
	@Test
	public void test() {
		assertNotNull(ds);
		Connection con;
		
		try {
			con = ds.getConnection();
			System.out.println(con);
			System.out.println(sqlsession);
			System.out.println(template);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
