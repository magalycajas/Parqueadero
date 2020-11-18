package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

@Stateless

public class ClienteDAO {

	@Inject
	private Connection con;

	public ClienteDAO() {

	}

	public boolean insert(Cliente entity) throws SQLException {
		String sql = "Insert INTO Cliente (dni, email, nombre, tipoDocumento) VALUES(?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, entity.getDni());
		ps.setString(2, entity.getEmail());
		ps.setString(3, entity.getNombre());
		ps.setInt(4, entity.getTipoDocumento());
		ps.executeUpdate();
		ps.close();
		return true;
	}

	public boolean update(Cliente entity) {
		return true;
	}

	public Cliente read(int id) {
		return null;
	}

	public boolean delete(int id) {
		return true;
	}
}
