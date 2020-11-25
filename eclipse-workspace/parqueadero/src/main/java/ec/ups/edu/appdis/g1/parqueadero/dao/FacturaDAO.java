package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;

public class FacturaDAO {
	
	@Inject
	private Connection con;
	

	public FacturaDAO() {

	}
	
	public boolean insert(Factura entity) throws SQLException {
		String sql = "Insert INTO Factura (numero, fechaEmision, valorTotal, Ticket, cliente) VALUES(?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getNumero());

		ps.setDate(2, (java.sql.Date)entity.getFechaEmision());
		ps.setDouble(3, entity.getValorTotal());
		ps.setString(4, null);
		ps.setString(5, null);
		ps.executeUpdate();
		ps.close();
		return true;
	}

	public boolean update(Factura entity) throws SQLException {
		String sql = "Update Factura (fechaEmision, valorTotal, Ticket, cliente) VALUES(?,?,?,?) where numero=" + entity.getNumero();
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setDate(2, (java.sql.Date)entity.getFechaEmision());
		ps.setDouble(3, entity.getValorTotal());
		ps.setString(4, null);
		ps.setString(5, null);
		ps.executeUpdate();
		ps.close();
		return true;
	}

	public Factura read(int id) throws SQLException {
		String sql = "SELECT * FROM Factura where numero=" + id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return null;
	}

	public boolean delete(int id) throws SQLException {
		String sql = "DELETE FROM Factura WHERE numero = " + id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return true;
	}
	
}
