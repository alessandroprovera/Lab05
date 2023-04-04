package it.polito.tdp.DAO;

public class TestDB {

	public static void main(String[] args) {
		
		DizionarioDAO d = new DizionarioDAO();
		
		if(d.esisteParola("ciiiio"))
			System.out.println("true");
		else
			System.out.println("false");

	}

}
