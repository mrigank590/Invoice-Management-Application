package com.highradius.servlets;
import java.util.ArrayList;

import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;


public class DataLoadingServlet {
	
	InvoiceDaoImpl invoiceDaoImpl=new InvoiceDaoImpl();
	
	public ArrayList<Invoice> getInvoice() throws ClassNotFoundException {
		
		return (ArrayList<Invoice>) invoiceDaoImpl.getInvoice();
		
	}

	
	public static void main(String args[]) throws ClassNotFoundException {
		
		DataLoadingServlet dataLoadingServlet=new DataLoadingServlet();
		
		System.out.println("Data loading Serverlet Demo");
		ArrayList<Invoice> list =dataLoadingServlet.getInvoice();	
		
		for (int i=0;i<list.size();i++) {
			System.out.println(" "+ list.get(i));
		}
		
	
	}
}