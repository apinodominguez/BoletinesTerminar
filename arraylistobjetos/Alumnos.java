package arraylistobjetos;

import java.util.ArrayList;
import java.util.Objects;

public class Alumnos implements Comparable{
    private String nome;
    private String dni;
    private int nota;

    public Alumnos() {
    }

    public Alumnos(String nome, String dni, int nota) {
        this.nome = nome;
        this.dni = dni;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nome=" + nome + ", dni=" + dni + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Object o) {
        Alumnos a = (Alumnos)o;
        if(this.nome.compareToIgnoreCase(a.nome)>0)
            return 1;
        else if(this.nome.compareToIgnoreCase(a.nome)<0)
            return -1;
        else
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
                  
}
