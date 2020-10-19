package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class EstrellaConTipo extends Estrella{

    private TipoEstrella tipo;

    public EstrellaConTipo(String nombre, double brillo, double distancia, int planetas, Galaxia galaxia, TipoEstrella tipo){
        //public Estrella(String nombre, double brillo , double distancia, int planetas, Galaxia galaxia){
        super(nombre, brillo, distancia, planetas, galaxia);
        this.tipo =tipo;
    }

    public TipoEstrella getTipoEstrella(){
        return tipo;

    }

    public void setTipoEstrella(TipoEstrella tipoEstrella){
        this.tipo = tipoEstrella;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o ==null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        EstrellaConTipo that =(EstrellaConTipo) o;
        return tipo ==that.tipo;
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),tipo);
    }
    @Override
    public String toString() {
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: " + this.getClass().getSimpleName() +
                ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() +
                '}';
    }

}
