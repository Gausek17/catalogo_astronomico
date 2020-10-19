package com.example.catalogoastronomico;

/**
 *
 * @author (IOT)
 * @version (2020)
 *
 */

public enum TipoEstrella {
    ENANA_AMARILLA("Enana Amarilla", "https://es.wikipedia.org/wiki/Estrella_de_tipo-G_de_la_secuencia_principal"),
    ENANA_BLANCA("Enana Blanca", "https://es.wikipedia.org/wiki/Enana_blanca"),
    GIGANTE_ROJA("Gigante Roja", "https://es.wikipedia.org/wiki/Gigante_roja"),
    SUBGIGANTE_BLANCA("Subgigante Blanca", "https://es.wikipedia.org/wiki/Subgigante");

    private final String tipos;
    private final String url;

    TipoEstrella(String tipos, String url){
        this.tipos = tipos;
        this.url = url;
}

    public String getTipos(){ return tipos;}
    public String getUrl(){return url;}


}
