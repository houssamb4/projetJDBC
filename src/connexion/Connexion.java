package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {	
	private static final String url="jdbc:mysql://localhost:3306/gestion_etudiant?useUnicode=true" +"&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String user="root";
	private static final String password="";
	private static Connection cnx;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Pilote chargé");
			cnx=DriverManager.getConnection(url, user, password);
			System.out.println("Connexion à la BD réussie");
			} catch (SQLException e) {
				System.out.println("Erreur de chargement du pilote");
			}
		catch (ClassNotFoundException e) {
			System.out.println("Erreur de chargement du pilote");
		}
		
	}
	public static Connection getCnx() {
		return cnx;
	}
}
