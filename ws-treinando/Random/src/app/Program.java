package app;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int option = random.nextInt(101); // Exemplo para testar as opções

		switch (option) {
		// Conceitos Principais
		case 1:
			System.out.println("Estudar: POO Livre");
			break;
		case 2:
			System.out.println("Estudar: Classes e Objetos");
			break;
		case 3:
			System.out.println("Estudar: Atributos e Métodos");
			break;
		case 4:
			System.out.println("Estudar: Encapsulamento");
			break;
		case 5:
			System.out.println("Estudar: Abstração");
			break;
		case 6:
			System.out.println("Estudar: Herança");
			break;
		case 7:
			System.out.println("Estudar: Polimorfismo");
			break;
		case 8:
			System.out.println("Estudar: ");
			break;
		case 9:
			System.out.println("Estudar: Modificadores de Acesso: Public, Private, Protected e Default");
			break;
		case 10:
			System.out.println("Estudar: Construtores padrão e sobrecarregados");
			break;
		case 11:
			System.out.println("Estudar: Palavra-Chave this");
			break;
		case 12:
			System.out.println("Estudar: Overloading (Sobrecarga)");
			break;
		case 13:
			System.out.println("Estudar: Overriding (Sobrescrita)");
			break;

		// Interfaces e Classes Abstratas
		case 14:
			System.out.println("Estudar: Interfaces e Classes Abstratas");
			break;
		case 15:
			System.out.println("Estudar: Diferença entre Interfaces e Classes Abstratas");
			break;
		case 16:
			System.out.println("Estudar: Implementação de Interfaces");
			break;
		case 17:
			System.out.println("Estudar: Composição e Agregação");
			break;
		case 18:
			System.out.println("Estudar: Relações 'tem-um' (Composição)");
			break;
		case 19:
			System.out.println("Estudar: Relações 'usa' (Agregação)");
			break;
		case 20:
			System.out.println("Estudar: Classes Internas (Inner Classes)");
			break;
		case 21:
			System.out.println("Estudar: Classes internas estáticas");
			break;
		case 22:
			System.out.println("Estudar: Classes anônimas");
			break;

		// Gerenciamento de Exceções
		case 23:
			System.out.println("Estudar: Gerenciamento de Exceções");
			break;
		case 24:
			System.out.println("Estudar: Try, Catch, Finally");
			break;
		case 25:
			System.out.println("Estudar: Exceções verificadas e não verificadas");
			break;
		case 26:
			System.out.println("Estudar: Lançamento de exceções (throw, throws)");
			break;

		// Tipos de Dados Primitivos e Não Primitivos
		case 27:
			System.out.println("Estudar: Tipos Primitivos");
			break;
		case 28:
			System.out.println("Estudar: Inteiros: byte, short, int, long");
			break;
		case 29:
			System.out.println("Estudar: Ponto flutuante: float, double");
			break;
		case 30:
			System.out.println("Estudar: Booleano: boolean");
			break;
		case 31:
			System.out.println("Estudar: Caracteres: char");
			break;
		case 32:
			System.out.println("Estudar: Conversão de Tipos");
			break;
		case 33:
			System.out.println("Estudar: Casting implícito e explícito");
			break;
		case 34:
			System.out.println("Estudar: Autoboxing e Unboxing (conversão entre tipos primitivos e wrappers)");
			break;
		case 35:
			System.out.println("Estudar: Tipos Não Primitivos (Referência)");
			break;
		case 36:
			System.out.println("Estudar: Strings");
			break;
		case 37:
			System.out.println("Estudar: Arrays");
			break;
		case 38:
			System.out.println("Estudar: Objetos de Classes (Instâncias)");
			break;
		case 39:
			System.out.println("Estudar: Wrappers para Tipos Primitivos");
			break;
		case 40:
			System.out.println("Estudar: Métodos úteis em classes wrappers (parseInt, valueOf, etc.)");
			break;
		case 41:
			System.out.println("Estudar: Imutabilidade de Strings");
			break;
		case 42:
			System.out.println("Estudar: Classe StringBuilder e StringBuffer (mutabilidade)");
			break;
		case 43:
			System.out.println("Estudar: Métodos comuns de manipulação de Strings (substring, indexOf, length, etc.)");
			break;

		// Estruturas de Dados em Java
		case 44:
			System.out.println("Estudar: Arrays");
			break;
		case 45:
			System.out.println("Estudar: Arrays unidimensionais e multidimensionais");
			break;
		case 46:
			System.out.println("Estudar: Manipulação de Arrays (for, foreach, Arrays.toString(), etc.)");
			break;
		case 47:
			System.out.println("Estudar: Classe java.util.Arrays");
			break;
		case 48:
			System.out.println("Estudar: Linked List (Lista Encadeada)");
			break;
		case 49:
			System.out.println("Estudar: Conceito de Listas Encadeadas");
			break;
		case 50:
			System.out.println("Estudar: Implementação com LinkedList");
			break;
		case 51:
			System.out.println("Estudar: Diferenças entre ArrayList e LinkedList");
			break;
		case 52:
			System.out.println("Estudar: Queue (Fila)");
			break;
		case 53:
			System.out.println("Estudar: Estrutura FIFO (First In, First Out)");
			break;
		case 54:
			System.out.println("Estudar: Implementação com Queue e PriorityQueue");
			break;
		case 55:
			System.out.println("Estudar: Operações comuns: offer(), poll(), peek()");
			break;
		case 56:
			System.out.println("Estudar: Tree (Árvores)");
			break;
		case 57:
			System.out.println("Estudar: Conceito de Árvore Binária");
			break;
		case 58:
			System.out.println("Estudar: Implementação de Árvores Binárias em Java");
			break;
		case 59:
			System.out.println("Estudar: Traversals (Percursos): Inorder, Preorder, Postorder");
			break;
		case 60:
			System.out.println("Estudar: Graph (Grafos)");
			break;
		case 61:
			System.out.println("Estudar: Representação de Grafos: Matriz de Adjacência e Lista de Adjacência");
			break;
		case 62:
			System.out.println("Estudar: Busca em Profundidade (DFS) e Busca em Largura (BFS)");
			break;
		case 63:
			System.out
					.println("Estudar: Aplicações de Grafos em Java (usando bibliotecas ou implementando manualmente)");
			break;

		// Collections
		case 64:
			System.out.println("Estudar: Iterator (Iteradores)");
			break;
		case 65:
			System.out.println("Estudar: Uso de Iteradores (Iterator e ListIterator)");
			break;
		case 66:
			System.out.println("Estudar: Métodos principais: hasNext(), next(), remove()");
			break;
		case 67:
			System.out.println("Estudar: Diferença entre Iterator e ListIterator");
			break;
		case 68:
			System.out.println("Estudar: Set");
			break;
		case 69:
			System.out.println("Estudar: Implementações de Set: HashSet, LinkedHashSet, TreeSet");
			break;
		case 70:
			System.out.println("Estudar: Propriedade de não duplicidade");
			break;
		case 71:
			System.out.println("Estudar: Operações básicas em Sets (add(), contains(), remove(), etc.)");
			break;
		case 72:
			System.out.println("Estudar: List");
			break;
		case 73:
			System.out.println("Estudar: Implementações de List: ArrayList, LinkedList, Vector");
			break;
		case 74:
			System.out.println("Estudar: Diferença entre ArrayList e LinkedList");
			break;
		case 75:
			System.out.println("Estudar: Operações com List (add(), get(), set(), remove(), etc.)");
			break;
		case 76:
			System.out.println("Estudar: Queue");
			break;
		case 77:
			System.out.println("Estudar: Implementações de Queue: LinkedList, PriorityQueue");
			break;
		case 78:
			System.out.println("Estudar: Fila de Prioridade com PriorityQueue");
			break;
		case 79:
			System.out.println("Estudar: Diferença entre Queue e Deque (Fila Dupla)");
			break;
		case 80:
			System.out.println("Estudar: Map");
			break;
		case 81:
			System.out.println("Estudar: Implementações de Map: HashMap, TreeMap, LinkedHashMap");
			break;
		case 82:
			System.out.println("Estudar: Chave-Valor em Maps");
			break;
		case 83:
			System.out.println("Estudar: Operações com Map (put(), get(), containsKey(), remove())");
			break;
		case 84:
			System.out.println("Estudar: HashMap vs. TreeMap (ordenação)");
			break;
		case 85:
			System.out.println("Estudar: Coleções Imutáveis e Genéricas");
			break;
		case 86:
			System.out.println("Estudar: Imutabilidade com Collections.unmodifiableList(), unmodifiableSet(), etc.");
			break;
		case 87:
			System.out
					.println("Estudar: Uso de Generics para tipos parametrizados (List<String>, Map<Integer, String>)");
			break;

		// Tópicos Avançados (Sugestão Extra)
		case 88:
			System.out.println("Estudar: Streams API");
			break;
		case 89:
			System.out.println("Estudar: Processamento de coleções de forma declarativa");
			break;
		case 90:
			System.out.println("Estudar: Filtros, Mapeamento e Redução");
			break;
		case 91:
			System.out.println("Estudar: Operações intermediárias e terminais (filter(), map(), collect(), etc.)");
			break;
		case 92:
			System.out.println("Estudar: Lambda Expressions");
			break;
		case 93:
			System.out.println("Estudar: Expressões lambda em Java 8+");
			break;
		case 94:
			System.out.println("Estudar: Uso com Streams e Collections");
			break;
		case 95:
			System.out.println("Estudar: Interfaces Funcionais (Predicate, Consumer, Function)");
			break;
		case 96:
			System.out.println("Estudar: Multithreading e Concorrência");
			break;
		case 97:
			System.out.println("Estudar: Threads em Java (Thread, Runnable)");
			break;
		case 98:
			System.out.println("Estudar: Sincronização (synchronized, Lock)");
			break;
		case 99:
			System.out.println(
					"Estudar: Executor Framework e Classes de Concorrência (Callable, Future, ExecutorService)");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}

}
