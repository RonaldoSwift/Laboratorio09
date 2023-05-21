
package Entidades;

/**
 *
 * @author Ronaldo
 */
public abstract class Personaje {
    private String nombre;
    private int vida;
    private int nivel;
    
    //cuando se utiliza la palabra abstrac puedes 
    //declarar metodos abstractos que no tienen cuerpo
    
    public void ataqueEspecialCombox2(Personaje atacado){
        this.atacar(atacado);
    }
    
    public abstract void atacar(Personaje atacado);
    
    public void defender(Personaje atacante){
        this.vida = this.vida+3;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
