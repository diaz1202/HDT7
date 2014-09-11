/**
   * Logica.java 
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 30 Estructura de Datos
   * autor: Ricardo Franco, 13261
   * autor: Alejandro Diaz, 13082
   * autor: Samuel Maldonado, 13153
   * Programa  de la hoja de trabajo 7
   * 
   *
   */

import java.io.*;
import java.util.*;

public class Logica{
	
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	String[] datos;
	Vector<String> datos1;
	Vector<Association<String,String>> Parejas;
	BinaryTree<Association<String,String>> nodo;
	String nodoKey;
	String datoKey;
	String salida;
	
	public Logica(){
		BinaryTree<Association<String,String>> nodo = new BinaryTree<Association<String,String>>();
		BinaryTree<Association<String,String>> hijoIzquierdo = new BinaryTree<Association<String,String>>();
		BinaryTree<Association<String,String>> hijoDerecho = new BinaryTree<Association<String,String>>();
		Parejas = new Vector<Association<String,String>>();
		datos1 = new Vector<String>();
		Traducciones();
		
	}

	//se lee el archivo de texto
	//se forman las asociaciones y se guardan en un vector
	public void Traducciones(){
		try{
			archivo = new File("C:\\Users\\Samuel\\Documents\\Samuel\\UVG\\2do año\\2do semestre\\Dropbox\\Algoritmos y estructura de datos\\Eclipse\\Hoja de Trabajo 7\\src\\Diccionario.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			// se lee linea por linea, cada una se separa en dos palabras y ambas se agregan a un vector
			
			while((linea=br.readLine()) != null){
				datos = linea.split(",");
				for (int i=0;i<datos.length;i++){
					System.out.println(datos[i]);			//prueba
					datos1.add(datos[i]);
				}
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(null != fr){
					fr.close();
				}
			}catch (Exception e2){
				e2.printStackTrace();
			}
		}
		
		for (int i=0;i<datos1.size();i++,i++){
			String ingles = datos1.get(i);
			String espanol = datos1.get(i+1);
			Parejas.add(new Association<String, String>(ingles, espanol));
		}
	}
	
	public void traducir(){
		for (int i=0;i<texto.size();i++){
			salida = traducir(nodo,texto.get(i));
		}
		System.out.println(salida);
	}
	
	public void insertar(){
		nodoKey = nodo.getKey();
		datoKey = Parejas.get();
		if (nodo != nodo.left())
			insertar();
		if (nodo == nodo.left())
			nodo.setRight(new BinaryTree<Association<String, String>>());
		if (nodo != nodo.right())
			insertar();
		if (nodo == nodo.right())
			nodo.setRight(new BinaryTree<Association<String, String>>());	
	}
}

// REFERENCIAS:

// http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
// http://www.ehowenespanol.com/dividir-cadena-separada-comas-java-como_236433/


