package dao;

//Classes necess�rias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//In�cio da classe de conex�o//
public class ConexaoMySQL {
	public static String status = "N�o conectou...";

	// M�todo Construtor da Classe//
	public ConexaoMySQL()
	{}

	// M�todo de Conex�o//
	public static Connection getConexaoMySQL(){
		Connection connection = null; //atributo do tipo Connection
		try {
			// Carregando o JDBC Driver padr�o
			String driverName = "com.mysql.jdbc.Driver";
			//Faz o registro do driver jdbc (n�o obrigat�rio a partir do JDBC 4).
			Class.forName(driverName);
			// Configurando a nossa conex�o com um banco de dados//
			String serverName = "localhost"; //caminho do servidor do BD
			String mydatabase ="meubanco"; //nome do seu banco de dados
			String username = "root"; //nome de um usu�rio de seu BD 
			String password = "luciano"; //sua senha de acesso
			String url = "jdbc:mysql://"+serverName+":3306/"+mydatabase;
			connection = DriverManager.getConnection(url, username, password);
			
			
			//Testa sua conex�o//  
			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			}
			else {
				status = ("STATUS--->N�o foi possivel realizar conex�o");
			}
			
			return connection;
			
		}
	    catch (ClassNotFoundException e) { //Driver n�o encontrado
	    	 System.out.println("O driver expecificado nao foi encontrado.");
	    	 return null;
	    }
	    catch (SQLException e) {
	    	//N�o conseguindo se conectar ao banco
	    	System.out.println("Nao foi possivel conectar ao Banco de Dados.");

	    	return null;
	    }

	}

	// M�todo que retorna o status da sua conex�o//
	public static String statusConection() {
		return status;
	}

	// M�todo que fecha sua conex�o//
	public static boolean FecharConexao() {

		try {

			ConexaoMySQL.getConexaoMySQL().close();

			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	// M�todo que reinicia sua conex�o//
	public static Connection ReiniciarConexao() {
		FecharConexao();
		return ConexaoMySQL.getConexaoMySQL();
	}
	
	
	public static void main(String[] args)
	{
		
		ConexaoMySQL.getConexaoMySQL();
		System.out.println(ConexaoMySQL.status);
		
	}
	

}
