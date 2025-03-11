public class Main { 
    public static void main(String[] args) {  
        // Criando um produto usando o construtor
        Produto p1 = new Produto("Pão Francês", 5.50, 'P');
        System.out.println("Produto: " + p1.getNome()); 
        System.out.println("Preço: R$" + p1.getPreco());
        System.out.println("Setor: " + p1.getSetor());

        System.out.println("\n--- Criando um produto com valores inválidos ---");

        // Criando um produto com valores inválidos
        Produto p2 = new Produto();
        p2.setNome("Refrigerante");
        p2.setPreco(-3.00); // Exibe o erro porque o preço não pode ser negativo
        p2.setSetor('X'); // Exibe o erro porque o setor não é válido

        // Exibir valores após a tentativa de definir valores inválidos
        System.out.println("Produto: " + p2.getNome());
        System.out.println("Preço corrigido: R$" + p2.getPreco()); // Deve ser 0.0, pois não foi alterado
        System.out.println("Setor corrigido: " + p2.getSetor()); // Deve ser 'M', pois é o padrão
    }
}
