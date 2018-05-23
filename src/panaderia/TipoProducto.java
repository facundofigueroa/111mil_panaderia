/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

/**
 *
 * @author Agustin
 */
public class TipoProducto {
    private String nombre;
    private float precioUnitario;
    private UnidadMedida unidadMedida;
    private float stock;

    public TipoProducto(String nombre, float precioUnitario, UnidadMedida unidadMedida, float stock) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public float getStock() {
        return stock;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }
    
    public void agregarStock(float agregar){
        stock += agregar;
    }
    
    public void disminuirStock(float disminuir){
        stock -= disminuir;
    }
    
    @Override
    public String toString (){
        return "Nombre: "+nombre+" Precio Unitario: "+precioUnitario+" Unidad medida: "+unidadMedida;
    }
    
    
}
