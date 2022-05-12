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
public class Profesor {
    
    private Integer ID_profesor;
    private String nombre;
    private String apellido;
    private ArrayList<Grupo> grupos;
    private ArrayList<Materia> materias;

    public Profesor() {
    }

    public Profesor(Integer ID_profesor, String nombre, String apellido, ArrayList<Alumno> Alumnos, ArrayList<Materia> materias) {
        this.ID_profesor = ID_profesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupos = grupos;
        this.materias = materias;
    }

    public Integer getID_profesor() {
        return ID_profesor;
    }

    public void setID_profesor(Integer ID_profesor) {
        this.ID_profesor = ID_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.ID_profesor);
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
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.ID_profesor, other.ID_profesor)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
