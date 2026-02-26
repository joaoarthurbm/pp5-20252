# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Prova Prática 5

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão no arquivo Asserts.java no diretório **/src/main/java/**.

> Executando os testes: `javac AssertsAVL.java ; java -ea AssertsAVL`
> Executando os testes: `javac AssertsPV.java ; java -ea AssertsPV`

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.


## A Prova

### isAVL (5.0)

Você deve implementar o método isAVL, que verifica se uma BST é AVL, dada a definição que vimos em sala de aula. Para isso, você vai precisar implementar alguns métodos auxiliares, que também estão na classe BST.

## PV check (5.0)

Implementar o método `check` da class PVTree que retorna em qual caso cairia se fosse adicionado o número passado como parâmetro em uma PV.

A implementação base já contem o esquema de cores do nó. O atributo `isRed` do nó determina se ele é vermelho ou não. Se não for vermelho (isRed == false), ele é preto.

Seu código recebe o valor que iria ser adicionado em uma PV válida. Você só precisa checar qual caso seria o da adição e retornar o número que identifica o caso (1, 2, 3, 4 ou 5).
 
Veja os asserts em Asserts.java para ter clareza da definição. Pode considerar que não há elementos repetidos. Lembre-se que `null` é preto.


## Entregando a prova

> ⚠️ **Importante:** Todos os comandos abaixo devem ser executados no **diretório pai** do projeto, ou seja, no diretório que **contém** o diretótio `pp5-20252/`. 

---

### Passo 1: Gerar o arquivo compactado da sua solução

Execute o comando abaixo **no diretório pai** do projeto (o diretório que contém `pp5-20252/`):

```bash
tar zcvf nome-sobrenome-matricula.tar.gz pp5-20252/
```
---

### Passo 2: Submeter sua solução

Execute o comando abaixo **no mesmo diretório do Passo 1**:

```bash
bash pp5-20252/submit-answer.sh pp5 nome-sobrenome-matricula.tar.gz
```

Importante: a senha é `leda`

## Importante

* A correção da prova não é automática. Os testes que são executados quando você faz push são apenas testes de sanidade.

* Vou considerar sempre a última submissão antes do deadline final. 

* A nota será dada pelos testes no servidor e depois da correção que eu efetuar. Sempre tento corrigir o mais rápido possível. Portanto, tenha paciência.

* A nota será calculada a partir dos testes e análise manual do código. Essa análise manual vai considerar se a solução é eficiente, se não tem loops desnecessários etc.

* Só serão corrigidas as provas dos alunos que assinaram a lista de presença física no laboratório.
