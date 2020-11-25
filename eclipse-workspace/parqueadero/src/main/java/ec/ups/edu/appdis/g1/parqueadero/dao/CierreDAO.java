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

import java.util.Date;
import java.util.List;

import ec.ups.edu.appdis.g1.parqueadero.modelo.CierreDiaHora;


public class CierreDAO {
	
	
	@Inject
	private Connection con;
	
	public List<CierreDiaHora> getCierreDia(Date dia){
		return null;
	}
	
	public boolean contabilizar() {
		return true;
	}
}
