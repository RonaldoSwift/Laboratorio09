
package Entidades;

/**
 *
 * @author Ronaldo
 */
public class Mago extends Personaje {

    private int magia;
    private int sabiduria;
    
    public void lanzarHechizo(Personaje atacado){
        //implementar
    }
    
    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 8);
        atacado.defender(this);
    }
    /**
     * @return the magia
     */
    public int getMagia() {
        return magia;
    }

    /**
     * @param magia the magia to set
     */
    public void setMagia(int magia) {
        this.magia = magia;
    }

    /**
     * @return the sabiduria
     */
    public int getSabiduria() {
        return sabiduria;
    }

    /**
     * @param sabiduria the sabiduria to set
     */
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }
}
