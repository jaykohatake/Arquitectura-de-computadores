import java.util.Scanner;
import java.io.File;
public class Tercerpunto {
	
	
	public void lecturatxt(){
	
	int i = 0;
	while( i < 1000){
	Scanner archivo=null;
	try{
	archivo = new Scanner(new File("numeros.txt"));
}
	catch(Exception e){
		System.out.println("archivo no encontrado");
	}
	
	
	
	 float num=0;
			 float num2=0;
			float num3=0;
			float num4 =0;
			float num5 = 1;
			float num6 = 1;
			
			
	while(archivo.hasNextFloat()){
		num = archivo.nextFloat();
		num2 = archivo.nextFloat();
		
		num3= num + num2;
		num4 = num - num2;
		num5 = num * num2;
		num6 = num / num2;
		System.out.println("la suma total es de" + num3);
		System.out.println("la resta total es de" + num4);
		System.out.println("la multiplicacion total es de" + num5);
		System.out.println("la division total es de" + num6);
}
	archivo.close();
	i++;
	}
	
}
   

	}