package Version1;

import java.io.PrintStream;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Estudiante var1 = new Estudiante();
      Estudiante var2 = new Estudiante();
      Estudiante var3 = new Estudiante();
      var1.setNombre("Ana");
      var1.setEdad(20);
      var1.setMatricula("A001");
      var2.setNombre("Luis");
      var2.setEdad(22);
      var2.setMatricula("B002");
      var3.setNombre("Marta");
      var3.setEdad(21);
      var3.setMatricula("C003");
      PrintStream var10000 = System.out;
      String var10001 = var1.getNombre();
      var10000.println("Estudiante 1: " + var10001 + ", " + var1.getEdad() + ", " + var1.getMatricula());
      var10000 = System.out;
      var10001 = var2.getNombre();
      var10000.println("Estudiante 2: " + var10001 + ", " + var2.getEdad() + ", " + var2.getMatricula());
      var10000 = System.out;
      var10001 = var3.getNombre();
      var10000.println("Estudiante 3: " + var10001 + ", " + var3.getEdad() + ", " + var3.getMatricula());
   }
}
