import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(19,20);
        Tiempo2 t4 = new Tiempo2(23,50,59);
        Tiempo2 t5 = new Tiempo2(32,67,120);
        Tiempo2 t6 = new Tiempo2(t4);

        System.out.println("Se construyó con: ");
        System.out.println("t1: todos los argumentos predeterminados");
        System.out.printf("  %s\n", t1.aStringUniversal());
        System.out.printf("  %s\n", t1.toString());

        System.out.println("t2: se específico hora; minuto y segundo predeterminados ");
        System.out.printf("  %s\n", t2.aStringUniversal());
        System.out.printf("  %s\n", t2.toString());

        System.out.println("t3: se especificaron nhora y minutp; segundp predeterminado ");
        System.out.printf("  %s\n", t3.aStringUniversal());
        System.out.printf("  %s\n", t3.toString());

        System.out.println("t4: se especificaron hora, minuto y segundo");
        System.out.printf("  %s\n", t4.aStringUniversal());
        System.out.printf("  %s\n", t4.toString());

        System.out.println("t5: se espacificaron todos los valores inavalidos");
        System.out.printf("  %s\n", t5.aStringUniversal());
        System.out.printf("  %s\n", t5.toString());

        System.out.println(" t6: se específico el objeto t4 de Tiempo2");
        System.out.printf("  %s\n", t6.aStringUniversal());
        System.out.printf("  %s\n", t6.toString());
    }
}