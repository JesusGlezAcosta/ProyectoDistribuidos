/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import java.util.Objects;

/**
 *
 * @author Felipe Torres
 */
public class Materia {
   
    private Integer ID_materia;
    private String nombre;
    private String horario;
    private String descripcion;

    public Materia() {
    }

    public Materia(Integer ID_materia, String nombre, String horario, String descripcion) {
        this.ID_materia = ID_materia;
        this.nombre = nombre;
        this.horario = horario;
        this.descripcion = descripcion;
    }
    
    public Integer getID_materia() {
        return ID_materia;
    }

    public void setID_materia(Integer ID_materia) {
        this.ID_materia = ID_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ID_materia);
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
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.ID_materia, other.ID_materia)) {
            return false;
        }
        return true;
    }
    
    
    
}
