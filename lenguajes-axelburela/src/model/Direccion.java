package model;

public class Direccion {
     private String calle;
     private String colonia;
     private String municipio;

    public Direccion() {
    }
    /**
     * Este constructor sirve para crear una diección.
     * @param calle El primer parámetro es el valor de la calle.
     * @param colonia El segundo parámetro es el valor de la colonia.
     * @param municipio El tercer parámetro es el valor del municpio.
     */
    public Direccion(String calle, String colonia, String municipio) {
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
    }
     
    /**
     * @return Este método te regresa el valor
     * que tiene el atributo calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle En este método debes de poner dentro del 
     * paréntesis el valor que quieras o que desees que tiene calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    

   
}
