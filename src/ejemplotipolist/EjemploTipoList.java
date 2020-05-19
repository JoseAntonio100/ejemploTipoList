/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class EjemploTipoList {

    public EjemploTipoList(){
        Principal();
    }
    
    public void Principal(){
        
        List <Datos> lista = new ArrayList<>();
        Datos datos = new Datos();
        
        datos.setNombre("victor");
        datos.setEdad(40);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre("Fernando");
        datos.setEdad(25);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre("Javier");
        datos.setEdad(20);
         lista.add (datos);
         
        lista.forEach(elemento ->{
            System.out.println("Nombre" + elemento.getNombre());
            System.out.println("Edad" + elemento.getEdad());
            
        });
        System.out.println("otra forma de recorrer los datos");
        
        for (Datos contenido : lista){
            System.out.println("Nombre" + contenido.getNombre());
            System.out.print("Edad" + contenido.getEdad());
        }
        datos  new Datos();
        datos.setNombre("Gustavo");
        datos.setEdad(19);
        
        lista.add(datos);
        
        System.out.println("\n\n tercer forma de visualizar el contenido");
          
        
        lista.stream().forEach(valores ->{
            System.out.println("Nombre" + valores.getNombre());
            System.out.print("Edad" + valores.getEdad());
            
            if (valores.getNombre().equals("Fernando")){
                System.out.print("se encontro el dato...");
            }
        });
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EjemploTipoList ejemploTipoList = new EjemploTipoList();
    }
    
}
