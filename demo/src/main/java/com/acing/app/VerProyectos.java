package com.acing.app;

import javax.swing.JFrame;

import com.acing.proyectoDAOMock;
import com.acing.iu.ProyectosListado;


public class VerProyectos {

	public static void main(String[] args) {

	
		proyectoDAOMock proyectosMock=new proyectoDAOMock();
		
		proyectosMock.findAll()
			.forEach(p -> System.out.println(p.toString()));
	
		JFrame tablaP= new ProyectosListado(proyectosMock.findAll());
		tablaP.setVisible(true);
		
		
		
			

	}

}
