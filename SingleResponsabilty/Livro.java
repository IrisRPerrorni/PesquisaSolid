package SingleResponsabilty;

public class Livro {
    private Biblioteca biblioteca;

    public Livro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    public void fichaDoLivro(){
        System.out.println("O nome do livro é: " + biblioteca.getNome());
        System.out.println("O autor do livro é: " + biblioteca.getAutor());
        System.out.println("A editora do livro é: " + biblioteca.getEditora());

    }
}
