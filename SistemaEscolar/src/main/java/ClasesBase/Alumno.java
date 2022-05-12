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
public class Alumno {
    private Integer ID_alumno;
    private String nombres;
    private String apellido;
    private String CURP;
    private String grado;
    private char grupo;
    private String turno;
    
    
    public Alumno() {
    }

    public Alumno(Integer ID_alumno, String nombres, String apellido, String CURP, String grado, char grupo, String turno) {
        this.ID_alumno = ID_alumno;
        this.nombres = nombres;
        this.apellido = apellido;
        this.CURP = CURP;
        this.grado = grado;
        this.grupo = grupo;
        this.turno = turno;
    }
    
    public Integer getID_alumno() {
        return ID_alumno;
    }

    public void setID_alumno(Integer ID_alumno) {
        this.ID_alumno = ID_alumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ID_alumno);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.ID_alumno, other.ID_alumno)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "ID_alumno=" + ID_alumno + ", nombres=" + nombres + ", apellido=" + apellido + ", CURP=" + CURP + ", grado=" + grado + '}';
    }
    
    
    
    
}
