builder.md
100%
# Atividade: Builder

## Contexto
Uma empresa deseja criar um sistema para montar **computadores personalizados**.

Cada computador pode possuir diferentes componentes, como:
- Processador
- Memória RAM
- Armazenamento
- Placa de vídeo
- Sistema operacional

Nem todos os computadores possuem todos os componentes. Para facilitar a construção desses objetos, utilizaremos o **padrão Builder**.

## Instruções

### Parte 1: Criar a Classe do Produto
1. Crie a classe `Computador` com os atributos:
   - Processador
   - Memória RAM
   - Armazenamento
   - Placa de vídeo (opcional)
   - Sistema operacional (opcional)

### Parte 2: Implementar o Builder
1. Crie a classe `ComputadorBuilder` com:
   - Métodos de configuração para cada componente
   - Método `build()` que retorna um objeto `Computador`

### Parte 3: Utilizar o Pattern
1. Crie dois computadores diferentes usando o Builder:

   **Computador básico:**
   - Processador
   - 8GB RAM
   - 256GB SSD

   **Computador gamer:**
   - Processador
   - 32GB RAM
   - 1TB SSD
   - Placa de vídeo

2. Exiba os dados de ambos os computadores

## Requisitos
- Implementar a classe `Computador` como produto final
- Implementar a classe `ComputadorBuilder` para construção
- Implementar métodos de configuração para cada componente
- Implementar o método `build()`
- Criar e exibir os dois computadores de teste

## Exemplo de Saída Esperada
```
=== Computador Básico ===
Processador: Intel Core i5
RAM: 8GB
Armazenamento: 256GB SSD
Placa de vídeo: N/A
Sistema operacional: N/A

=== Computador Gamer ===
Processador: Intel Core i9
RAM: 32GB
Armazenamento: 1TB SSD
Placa de vídeo: NVIDIA RTX 4070
Sistema operacional: N/A
```
Exibindo builder.md…