package arraylistobjetos;

import Utils.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;



public class ArrayListObjetos {

    public static void main(String[] args) {
        
        ArrayList<Alumnos> lista = new ArrayList<>();
        Metodos obx = new Metodos();
        
        String op;
        
        do{
             op = PedirDatos.pedirString("****MENU****\n1-> engadir\n2-> ver\n3-> borrar\n4-> Borrar elemento\n5-> ordenar\n6-> buscar" +
                     "\n7-> Modificar");
        switch(op){
            case "engadir": obx.engadir(lista);
                   break;
            case "ver": obx.ver(lista);
        break;   
            case "borrar": obx.borrarPosicion(PedirDatos.enteiro("Introduce la posicion a borrar: "), lista);
        break;
            case "borrar elemento": obx.borrarElemento(lista, PedirDatos.pedirString("Introduce el DNI"));
        break;
            case "ordenar": Collections.sort(lista);
        break;
            case "buscar": obx.buscar(lista, PedirDatos.pedirString("Introduce el DNI"));
        break;
            case "modificar": obx.modificarNota(lista, PedirDatos.pedirString("Introduce el DNI"), PedirDatos.enteiro("Introduce la nueva nota"));
        }   
        }while (!"sair".equalsIgnoreCase(op));
        }
}
