package arraylistobjetos;

import Utils.PedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {
    
    
public void engadir(ArrayList<Alumnos>lis){
//String n, dni;
//int nota;
//
//n = PedirDatos.pedirString("nome: ");
//dni = PedirDatos.pedirString("dni:   ");
//nota = PedirDatos.enteiro("nota: ");
//Alumnos al = new Alumnos(n, dni, nota);
Alumnos al = crearAlumno();
lis.add(al);
//lis.add(new Alumnos(PedirDatos.pedirString("nome"), PedirDatos.pedirString("dni: "), PedirDatos.enteiro("notas")));
}

public Alumnos crearAlumno(){
   String n, dni;
   int nota;

n = PedirDatos.pedirString("nome: ");
dni = PedirDatos.pedirString("dni:   ");
nota = PedirDatos.enteiro("nota: ");
Alumnos al = new Alumnos(n, dni, nota); 
    return al;
}

public void ver(ArrayList<Alumnos>lis){
    for(Alumnos al: lis){
        System.out.println(al);
    }
}

public void amosarIterator(ArrayList<Alumnos>lis){
    Iterator it = lis.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
}

public void borrarPosicion(int posicion, ArrayList<Alumnos>lis){
  lis.remove(posicion -1);
}

public void borrarElemento(ArrayList<Alumnos>lis, String dni){
//    for (Alumnos al: lis)
//        if (dni.equalsIgnoreCase(al.getDni())){
//            lis.remove(al);
//            break;
//        }
    Alumnos a = new Alumnos();
    Iterator it = lis.iterator();
    while(it.hasNext()){ 
        a = (Alumnos)it.next();
        if (dni.equalsIgnoreCase(a.getDni()))
            lis.remove(a);
    }
    }

    public void buscar(ArrayList<Alumnos>lis, String dni){
        int atopado =0;
        for (Alumnos al : lis){
            if (dni.equalsIgnoreCase(al.getDni())){
                System.out.println("nome: " + al.getNome()+ "nota: " + al.getNota());
                atopado = 1;
                break;
            }
        }
        if (atopado ==0)
            System.out.println("No se encuentra el elemento");
    }
    
    public void modificarNota(ArrayList<Alumnos>lis, String dni, int nota){
        int atopado = 0;
        for (Alumnos al : lis){
            if (dni.equalsIgnoreCase(al.getDni())){
                al.setNota(nota);
                System.out.println("El alumno: " + al.getNome() + " tiene la siguiente nota " + al.getNota());
                atopado = 1;
                break;
            }
        }
        if (atopado == 0)
            System.out.println("No se encuentra el elemento");
    }

}
