package view;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import controller.Controle1;
import controller.IControle1;

public class Main {

	public static void main(String[] args) {
		
		IControle1 arqCont = new Controle1();
		String path = "C:\\Temp";
		String nome = "generic_food.csv";
		
		try {
			arqCont.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	}
