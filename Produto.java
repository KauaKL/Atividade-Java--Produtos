public class Produto { 
    private String nome;
    private double preco;
    private char setor; // M-Mercearia, P-Padaria, B-Bebidas, U-Utensílios

    // Construtor padrão
    public Produto() {
    }

    // Construtor com todos os atributos
    public Produto(String nome, double preco, char setor) {
        this.nome = nome;
        this.preco = preco;
        setSetor(setor); // Usa o setter para validar o setor
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para preço
    public double getPreco() {
        return preco;
    }

    // Setter para preço
    public void setPreco(double preco) {
        if (preco >= 0) { // Preço não pode ser negativo
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    // Getter para setor
    public char getSetor() {
        return setor;
    }

    // Setter para setor (valida os valores permitidos)
    public void setSetor(char setor) {
        if (setor == 'M' || setor == 'P' || setor == 'B' || setor == 'U') {
            this.setor = setor;
        } else {
            System.out.println("Setor inválido! Use M, P, B ou U.");
            this.setor = 'M'; // Define um valor padrão caso o setor seja inválido
        }
    }
}
