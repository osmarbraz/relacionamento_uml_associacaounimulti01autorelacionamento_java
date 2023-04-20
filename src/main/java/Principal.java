
public class Principal {

    public static void main(String args[]) {
        ClasseA a = new ClasseA();
        ClasseA pai = new ClasseA();
        a.setPai(pai); //Sua chamada é opcional pois a multiplicidade é 0 ou 1
    }
}
