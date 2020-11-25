package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;


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
	
	public VehiculoDAO (){

	}

	
	public boolean insert(Vehiculo entity) throws SQLException {
		String sql = "Insert INTO Vehiculo (placa, marca, color) VALUES(?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, entity.getPlaca());
		ps.setString(2, entity.getMarca());
		ps.setString(3, entity.getColor());
		ps.executeUpdate();
		ps.close();
		return true;
	}

	public boolean update(Vehiculo entity) throws SQLException {
		String sql = "Update Vehiculo ( marca, color) VALUES(?,?,?) where placa=" + entity.getPlaca();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, entity.getMarca());
		ps.setString(3, entity.getColor());
		ps.executeUpdate();
		ps.close();
		return true;
	}

	public Vehiculo read(String placa) throws SQLException {

		String sql = "SELECT * FROM Vehiculo where placa=" + placa;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return null;
	}


	public boolean delete(String placa) throws SQLException {
		String sql = "DELETE FROM Vehiculo WHERE placa = " + placa;

		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return true;
	}
	
}
