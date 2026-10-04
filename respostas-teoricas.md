# Lista de Exercícios - POO

## Questão 1

Usar getters e setters em vez de deixar os atributos públicos é uma boa prática por causa do **encapsulamento**. Quando o atributo é público, qualquer parte do código pode alterar seu valor diretamente, sem nenhuma verificação. Isso pode deixar o objeto em um estado inválido, como uma idade negativa ou um preço incorreto.

Com os atributos privados e o acesso feito por métodos, a classe passa a ter controle sobre seus próprios dados. É possível validar o valor antes de alterá-lo, deixar um atributo somente para leitura (apenas com `get`, sem `set`) e até mudar a forma como o dado é armazenado internamente sem afetar o restante do código que utiliza a classe.

**Exemplo:** em uma classe `Aluno`, a nota precisa estar entre 0 e 10. Se o atributo fosse público, alguém poderia fazer `aluno.nota = 15` sem nenhuma validação. Com o setter, é possível impedir isso:

```java
public class Aluno {
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
        }
    }
}
```

Assim, a nota do objeto sempre será um valor válido.

## Questão 2

### a) Informações relevantes para representar um livro

- Código ou ISBN
- Título
- Autor
- Editora
- Ano de publicação
- Gênero/categoria
- Quantidade de exemplares disponíveis
- Disponibilidade para empréstimo

### b) Por que a classe Livro é uma abstração

A classe representa apenas as características de um livro que são importantes para o sistema da biblioteca, ignorando os demais detalhes. Um livro possui várias outras características, como cor da capa, peso, tipo de papel e número de páginas de cada capítulo, mas essas informações não são necessárias para o sistema de empréstimos. Dessa forma, o objeto do mundo real é simplificado, mantendo apenas o que é útil para o problema. Essa é a ideia de abstração.

### c) Métodos que fariam sentido na classe

- `emprestar()` – marca o livro como emprestado ou diminui a quantidade disponível
- `devolver()` – marca o livro como disponível novamente
- `estaDisponivel()` – informa se o livro pode ser emprestado
- `exibirInfo()` – mostra os dados do livro
