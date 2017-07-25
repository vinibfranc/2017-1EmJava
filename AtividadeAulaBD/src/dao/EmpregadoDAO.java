package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpregadoDAO {
	private Connection con = null;
	private String nome = "";
	
	public String consultarNomeEmpregadoBanco(int cod) {
		con = ConexaoMySQL.getConexaoMySQL();
		
		String sql = "Select * from Empregado where codigoEmp=?";
		
		PreparedStatement prepS;
		try {
			prepS = con.prepareStatement(sql);
			prepS.setInt(1, cod);
			ResultSet res = prepS.executeQuery();
			System.out.println(sql);
			
			while (res.next()) {
				nome = res.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nome;
	
	}
}
