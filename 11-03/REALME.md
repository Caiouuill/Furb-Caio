Vector:
O Vector é uma classe legada que implementa a interface List.
  Ele é semelhante ao ArrayList, mas com algumas diferenças importantes.
Características:
  Sincronizado: O Vector é thread-safe, o que significa que pode ser usado em ambientes concorrentes.
  Tamanho dinâmico: Assim como o ArrayList, o Vector também cresce dinamicamente conforme necessário.
  Performance: Devido à sincronização, o Vector pode ser mais lento que o ArrayList.
Exemplo: Imagine uma lista de convidados para uma festa, onde você pode adicionar ou remover pessoas conforme necessário.

ArrayList:
  O ArrayList é uma implementação moderna da interface List.
Características:
  Array dinâmico: Cresce automaticamente quando necessário.
  Acesso direto por índice: Permite acessar elementos diretamente usando índices.
  Não sincronizado: Não é thread-safe, o que pode ser mais eficiente em termos de desempenho.
Exemplo: Uma lista de compras onde você adiciona e remove itens conforme necessário.

LinkedList:
  O LinkedList é uma lista duplamente vinculada.
Características:
  Estrutura de nós: Cada elemento é um nó que aponta para o próximo e o anterior.
  Inserção/remoção eficiente: Ótimo para inserções e remoções frequentes.
  Acesso mais lento: Acesso por índice é mais lento que o ArrayList.
Exemplo: Uma fila de pessoas esperando em um banco.

HashMap:
  O HashMap é uma implementação da interface Map.
Características:
  Chave-valor: Armazena pares de chave e valor.
  Pesquisa eficiente: Acesso rápido aos valores usando chaves.
  Não ordenado: Não mantém a ordem de inserção.
Exemplo: Um dicionário onde você procura palavras e encontra seus significados.
