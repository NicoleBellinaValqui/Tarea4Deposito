/**Proyecto Deposito
 * */
package cuentas;
/** Clase CCuenta con los atributos nombre, cuenta, saldo y tipoInteres
 * Esta clase define información de una cuenta con la que se va a trabajar
 * @author nbell
 * @version 1.0
 * @since 23/02/2022
 * */
public class CCuenta {
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/** CCuenta 
 * */
    public CCuenta(){
    }
/** Constructor para los atributos
 * @param nom que indica el nombre del titular de la cuenta
 * @param cue que indica la cuenta con la que se trabaja
 * @param sal que indica el saldo de la cuenta
 * @param tipo que indica el tipo de interes sobre la cuenta
 * */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**Constructor del estado de la cuenta para saber el saldo de la cuenta despues de ciertas acciones
 * @return getSaldo nos devuelve el saldo de la cuenta
 * */
    public double estado()
    {
        return getSaldo();
    }
/**Metodo ingresar que nos devuelve el saldo despues de la accion o en caso contrario nos muestra un mensaje por consola de error
 * @param cantidad nos indica la cantidad a ingresar
 * @throws java.lang.Exception por si la cantidad es negativa
 * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**Metodo retirar que nos devuelve el saldo despues de la accion o en caso contrario nos muestra un mensaje por consola de error
 * @param cantidad nos indica la cantidad a retirar
 * @throws java.lang.Exception por si la cantidad es negativa o supera el saldo actual de la cuenta
 * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
