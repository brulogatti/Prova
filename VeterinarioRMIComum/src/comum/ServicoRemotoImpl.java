package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {
	
	public ServicoRemotoImpl() throws RemoteException {
	}
	
	private static List<Veterinario> lstVeterinario = new ArrayList<>();

	private static final long serialVersionUID = -8435067385780577932L;

	
	public void incluir(Veterinario v) throws RemoteException {
		lstVeterinario.add(v);
		
	}

	
	public List<Veterinario> listarVeterinario() throws RemoteException {
		return lstVeterinario;
	}

}
