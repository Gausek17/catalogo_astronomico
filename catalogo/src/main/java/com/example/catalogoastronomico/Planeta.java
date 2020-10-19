package com.example.catalogoastronomico;

import java.util.Objects;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */
public class Planeta extends Astro {
    private boolean habilitado;
    private Estrella estrella;

    public boolean isHabilitado(){
        return habilitado;
    }
    public void setHabilitado(boolean habilitado){
        this.habilitado = habilitado;
    }
    public Estrella getEstrella(){
        return  estrella;
    }
    public void setEstrella(Estrella estrella){
        this.estrella = estrella;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planeta planeta = (Planeta) o;
        return habilitado == planeta.habilitado &&
                Objects.equals(estrella, planeta.estrella);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habilitado, estrella);
    }

    @Override
    public String toString(){
        return "objeto-Astro {" +
                "nombre: " + this.getNombre() +
                ", tipo: " + this.getClass().getSimpleName() +
                ", brillo: " + this.getBrillo() +
                ", distancia: " + this.getDistancia() +
                '}';
    }

}
