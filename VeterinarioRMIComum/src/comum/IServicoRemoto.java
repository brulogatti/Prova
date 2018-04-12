package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote {
	
	public void incluir(Veterinario v) throws RemoteException;
	
	List<Veterinario> listarVeterinario() throws RemoteException; 

}

