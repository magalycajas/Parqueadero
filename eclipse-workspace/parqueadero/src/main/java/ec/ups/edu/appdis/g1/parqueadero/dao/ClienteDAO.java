package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
@Stateless

public class ClienteDAO {
	@Inject
	private Connection con;
	public ClienteDAO() {
		
	}
	public boolean insert(Ticket entity) {
		String sql="Insert INTO Cliente (dni, email, nombre, tipoDocumento"+"VALUES(?,?,?,?";
		//PreparedStatement ps=con.preparedStatement(sql);
		
		return true;
	}
	public boolean update(Ticket entity) {
		return true;
	}
	public Ticket read(int id) {
		return null;
	}
	public boolean delete(int id) {
		return true;
	}
}
