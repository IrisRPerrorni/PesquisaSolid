package SingleResponsabilty;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Harry Potter","JK", "Saraiva");
        Livro livro = new Livro(biblioteca);
        livro.fichaDoLivro();
    }
}
