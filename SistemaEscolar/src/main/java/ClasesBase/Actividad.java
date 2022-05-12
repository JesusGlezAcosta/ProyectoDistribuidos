/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Felipe Torres
 */
public class Actividad {
    
    private Integer ID_actividad;
    private String nombre;
    private double calificacion;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Actividad() {
    }

    public Actividad(Integer ID_actividad, String nombre, double calificacion, Date fecha_inicio, Date fecha_fin) {
        this.ID_actividad = ID_actividad;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Integer getID_actividad() {
        return ID_actividad;
    }

    public void setID_actividad(Integer ID_actividad) {
        this.ID_actividad = ID_actividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.ID_actividad);
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
        final Actividad other = (Actividad) obj;
        if (!Objects.equals(this.ID_actividad, other.ID_actividad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actividad{" + "ID_actividad=" + ID_actividad + ", nombre=" + nombre + ", calificacion=" + calificacion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + '}';
    }
    
    
}
