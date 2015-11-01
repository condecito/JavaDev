/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cf.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Edwin
 */
@Entity
@Table(name = "fincas", catalog = "cafecontrol", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Fincas.findAll", query = "SELECT f FROM Fincas f"),
    @NamedQuery(name = "Fincas.findByIdfincas", query = "SELECT f FROM Fincas f WHERE f.idfincas = :idfincas"),
    @NamedQuery(name = "Fincas.findByNombrefinca", query = "SELECT f FROM Fincas f WHERE f.nombrefinca = :nombrefinca"),
    @NamedQuery(name = "Fincas.findByDescripcion", query = "SELECT f FROM Fincas f WHERE f.descripcion = :descripcion")})
public class Fincas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfincas")
    private Integer idfincas;
    @Column(name = "nombrefinca")
    private String nombrefinca;
    @Column(name = "descripcion")
    private String descripcion;

    public Fincas() {
    }

    public Fincas(Integer idfincas) {
        this.idfincas = idfincas;
    }

    public Integer getIdfincas() {
        return idfincas;
    }

    public void setIdfincas(Integer idfincas) {
        Integer oldIdfincas = this.idfincas;
        this.idfincas = idfincas;
        changeSupport.firePropertyChange("idfincas", oldIdfincas, idfincas);
    }

    public String getNombrefinca() {
        return nombrefinca;
    }

    public void setNombrefinca(String nombrefinca) {
        String oldNombrefinca = this.nombrefinca;
        this.nombrefinca = nombrefinca;
        changeSupport.firePropertyChange("nombrefinca", oldNombrefinca, nombrefinca);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfincas != null ? idfincas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fincas)) {
            return false;
        }
        Fincas other = (Fincas) object;
        if ((this.idfincas == null && other.idfincas != null) || (this.idfincas != null && !this.idfincas.equals(other.idfincas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cf.GUI.Fincas[ idfincas=" + idfincas + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
