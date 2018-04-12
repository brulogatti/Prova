package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comum.IServicoRemoto;
import comum.Veterinario;

public class AppPrincipal {

	public static void main(String[] args) {
		try {
			IServicoRemoto objVeterinario = (IServicoRemoto) Naming.lookup("rmi://localhost:6868/veterinario");
			
			Veterinario v1 = new Veterinario();
			
			v1.setId(1);
			v1.setNome("Julio");
			v1.setCpf("555.666.777-88");
			
			Veterinario v2 = new Veterinario();
			
			v2.setId(2);
			v2.setNome("Caio");
			v2.setCpf("333.444.555-66");
			
			//Inclusão do Veterinário
			objVeterinario.incluir(v1);
			objVeterinario.incluir(v2);
			
			//Consulta do Vaterinário
			for (Veterinario veterinario : objVeterinario.listarVeterinario()) {
				System.out.println("\nID: " + veterinario.getId());
				System.out.println("Nome: " + veterinario.getNome());
				System.out.println("CPF: " + veterinario.getCpf());

			}
		}catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
}

	}

}
