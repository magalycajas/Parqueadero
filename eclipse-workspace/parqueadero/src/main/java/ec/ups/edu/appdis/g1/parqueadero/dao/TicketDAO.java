package ec.ups.edu.appdis.g1.parqueadero.dao;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;
import java.util.Date;

public class TicketDAO {
	
	@Inject
	private Connection con;
	
	
	public boolean insert(Ticket entity) throws SQLException{

		String sql="INSERT INTO Ticket (Codigo, FechaIngreso, FechaSalida, Tiempo, Valor, Vehiculo)"
				+ "VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getCodigo());
		ps.setDate(2, (java.sql.Date)entity.getFechaIngreso());
		ps.setDate(3, (java.sql.Date)entity.getFechaSalida());
		ps.setInt(4, entity.getTiempo());
		ps.setDouble(5, entity.getValor());
		ps.setString(6, null);
		ps.executeUpdate();
		ps.close();
		return true;	
		
	}
	public boolean update(Ticket entity) throws SQLException{
		boolean rowActualizar = false;
	
		String sql = "Update Ticket (FechaIngreso, FechaSalida, Tiempo, Valor, Vehiculo) VALUES(?,?,?,?,?) where codigo=" + entity.getCodigo();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getCodigo());
		ps.setDate(2, (java.sql.Date)entity.getFechaIngreso());
		ps.setDate(3, (java.sql.Date)entity.getFechaSalida());
		ps.setInt(4, entity.getTiempo());
		ps.setDouble(5, entity.getValor());
		ps.setString(6, null);
		ps.executeUpdate();
		ps.close();
		return true;
	}
	
	public Ticket read(int id) throws SQLException {
		String sql = "SELECT * FROM Factura where codigo=" + id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return null;
	}

	public boolean delete(int id) throws SQLException {
		String sql = "DELETE FROM Ticket WHERE codigo = " + id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return true;
	}

	
}
