/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Felipe Torres
 */
public class Grupo {
    
    private Integer ID_grupo;
    private char nombre;
    private ArrayList<Alumno> alumnos;

    public Grupo() {
    }

    public Grupo(Integer ID_grupo, char nombre, ArrayList<Alumno> alumnos) {
        this.ID_grupo = ID_grupo;
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public Integer getID_grupo() {
        return ID_grupo;
    }

    public void setID_grupo(Integer ID_grupo) {
        this.ID_grupo = ID_grupo;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.ID_grupo);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.ID_grupo, other.ID_grupo)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "grupo{" + "ID_grupo=" + ID_grupo + ", nombre=" + nombre + ", alumnos=" + alumnos + '}';
    }
    
    
    
}
