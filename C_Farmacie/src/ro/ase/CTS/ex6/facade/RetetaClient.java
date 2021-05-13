package ro.ase.CTS.ex6.facade;

import java.util.ArrayList;
import java.util.List;

public class RetetaClient {
	private String numeClient;
	private List<String> listaMedicamenteList;

	public RetetaClient(String numeClient,List<String> listaMedicamenteList) {
		super();
		this.numeClient=numeClient;
		this.listaMedicamenteList = new ArrayList<String>();
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	public List<String> getListaMedicamenteList() {
		return listaMedicamenteList;
	}

	public void setListaMedicamenteList(List<String> listaMedicamenteList) {
		this.listaMedicamenteList = listaMedicamenteList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RetetaClient [numeClient=");
		builder.append(numeClient);
		builder.append(", listaMedicamenteList=");
		builder.append(listaMedicamenteList);
		builder.append("]");
		return builder.toString();
	}
	
	

}
