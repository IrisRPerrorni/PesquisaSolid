package SubstituicaoDeLiskov;

public class Main {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();

        imprimenome(obj1);
        imprimenome(obj2);
    }
    public static void imprimenome(ClassA obj){
        System.out.println(obj.getNome());
    }
}
