public class Lectura {
public static void main(String[] args){
	long tiempoInicio = System.currentTimeMillis();
	Tercerpunto a = new Tercerpunto();
	a.lecturatxt();
	 long totalTiempo = System.currentTimeMillis() - tiempoInicio;
	    System.out.println("El tiempo de demora es :" + totalTiempo + " miliseg");

}
}
