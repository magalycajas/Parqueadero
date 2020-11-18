package ec.ups.edu.appdis.g1.parqueadero.negocio;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

public class ClienteON {
	public boolean registrarCliente(Cliente entity) {
		return true;
	}
	
	public Cliente buscarCliente(String cedula) {
		return null;
	}
	
	public boolean validarCedula(String cedula) {
		return true;
	}
	
	public boolean validarCorreo(String correo) {
		return true;
	}
}
