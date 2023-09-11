/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadodetodosa;

import java.util.Comparator;


/**
 *
 * @author nahue
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;
    private int stock; 
    private Rubro rubro;

    public Producto(int codigo, String descripcion, float precio, int stock, Rubro rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }        
}

class Ordenamientos{
    public static Comparator<Producto> porCodigo=new Comparator<Producto>() {
        @Override
        public int compare(Producto prod1, Producto prod2) {
            return ((Integer)prod1.getCodigo()).compareTo((Integer)prod2.getCodigo());
        }
    };
    
    public static Comparator<Producto> porNombre=new Comparator<Producto>() {
        @Override
        public int compare(Producto prod1, Producto prod2) {
            return prod1.getDescripcion().compareTo(prod2.getDescripcion());
        }
    };
    
    public static Comparator<Producto> porRubro=new Comparator<Producto>() {
        @Override
        public int compare(Producto prod1, Producto prod2) {
            return prod1.getRubro().compareTo(prod2.getRubro());
        }
    };
    
    public static Comparator<Producto> porPrecio=new Comparator<Producto>() {
        @Override
        public int compare(Producto prod1, Producto prod2) {
            return ((Float)prod1.getPrecio()).compareTo((Float)prod2.getPrecio());
        }
    };
}