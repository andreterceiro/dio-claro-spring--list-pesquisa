import java.text.MessageFormat;

public class Livro {
    /**
     * Título do livro
     */
    private String titulo;

    /**
     * Autor do livro
     */
    private String autor;

    /**
     * Ano de publicação do livro
     */
    private int anoPublicacao;

    /**
     * Construtor
     */
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Getter de this.titulo
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Getter de this.autor
     */
    public String getAutor() {
        return this.autor;
    }
    
    /**
     * Getter de this.anoPublicacao
     */
    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    /**
     * Método que formata a exibição quando for necessário imprimir uma
     * string representando esta classe
     */
    public String toString() {
        return MessageFormat.format(
            "Livro (titulo={0}, autor={1}, ano de publicação={2})",
            this.getTitulo(),
            this.getAutor(),
            this.getAnoPublicacao()
        );
    }
}
