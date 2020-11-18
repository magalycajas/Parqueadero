package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.CierreDiaHora;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

public class CierreDAO {
	
	@Inject
	private Connection con;

	
	public CierreDAO() {

	}
	
	
	public List<CierreDiaHora> getCierreDia(Date dia) throws SQLException{
		String sql="INSERT INTO CierreDia (fecha, hora,)"
				+ "VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, dia.getDate());
		ps.setInt(2, dia.getHours());
		ps.executeUpdate();
		ps.close();
		
		return null;
	}
	public boolean contabilizar() {
		return true;
	}
}
