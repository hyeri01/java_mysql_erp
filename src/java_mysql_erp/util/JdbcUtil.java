package java_mysql_erp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	public static Connection getConnection() {
		Connection con = null;
		String proPath = "mysql_db.properties";

		Properties props = new Properties();
		try (InputStream is = ClassLoader.getSystemResourceAsStream(proPath);) {
			props.load(is);

			/*
			 * for(java.util.Map.Entry<Object, Object> e : props.entrySet()) {
			 * System.out.printf("%s - %s\n", e.getKey(), e.getValue()); }
			 */

			String url = props.getProperty("url");
			con = DriverManager.getConnection(url, props);
//			String user = props.getProperty("user");
//			String password = props.getProperty("password");
//			con = DriverManager.getConnection(url, user, password);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

}
