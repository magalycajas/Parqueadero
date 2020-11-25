package ec.ups.edu.appdis.g1.parqueadero.dao;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;



public class VehiculoDAO {
	@Inject
	private Connection con;
	
private Vehiculo vehiculo;
	
	public boolean insert(Vehiculo vehiculo) throws SQLException {
		String sql="INSERT INTO TBL_VEHICULO (placa,marca,color)"
				+ "VALUES (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vehiculo.getPlaca());
		ps.setString(2, vehiculo.getMarca());
		ps.setString(3, vehiculo.getColor());
		ps.executeUpdate();
		ps.close();
		
		return true;
	}
	
	public boolean update(Vehiculo vehiculo) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE TBL_VEHICULO SET PLACA=?,MARCA=?,COLOR=? WHERE PLACA=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vehiculo.getPlaca());
		ps.setString(2, vehiculo.getMarca());
		ps.setString(3, vehiculo.getColor());
		System.out.println(vehiculo.getPlaca());

		rowActualizar = ps.executeUpdate() > 0;
		ps.close();
		con.close();
		return rowActualizar;
	}
	
	
	public Vehiculo read(String  placa) throws SQLException {
		String sql = "SELECT * FROM Vehiculo where placa=" + placa;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return null;
	}

	public boolean delete(String  placa) throws SQLException {
		String sql = "DELETE FROM Vehiculo WHEREplaca = " + placa;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return true;
	}
	


	
}
