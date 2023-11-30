package Ejercicio3;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
	int num;
	String nombre;
	double sueldo;
	double sueldoMaximo;
	GregorianCalendar fecha_alta;
	
	public Empleado(int num, String nombre,double sueldo, double sueldoMaximo){
		this.num=num;
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.fecha_alta=new GregorianCalendar();
		this.sueldoMaximo=sueldoMaximo;
	}
	public int getNumero() {
        return num;
    }

    public void setNumero(int numero) {
        this.num = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getsueldo() {
        return sueldo;
    }

    public void setsueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getsueldoMaximo() {
        return sueldoMaximo;
    }

    public void setsueldoMaximo(double sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + " numero=" + num + ", suedo=" + sueldo + "Fecha de alta: " + fecha_alta.get(Calendar.DATE) + "/" + (fecha_alta.get(Calendar.MONTH)+1) + "/" + fecha_alta.get(Calendar.YEAR) +"]";
	}
	
}

