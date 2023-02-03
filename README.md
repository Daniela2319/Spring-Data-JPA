# Spring-Data-JPA

## O que é ORM?

Object-Relational Mapping, em que português(Mapeamento objeto-relacional), é um recurso para aproximar o paradigma da orientação a objetos
ao contexto de banco de dados relacional.

O uso do ORM é realizado através do mapeamento de objetos para uma tabela por um biblioteca ou framework.

## JPA

É uma especificação baseada em interfaces, que através de um framework realiza operações de persistência do objetos em Java.


## Entidades JPA utilizado neste projeto

**@Entity**: É um anotação na classe, com essa anotação representa uma tabela do banco de dados.

**@Table()**: Utilizado quando o nome da tabela do banco de dados difere do nome da classe.

**@Id** : Chave única são identificadores únicos.

**@GeneratedValue**: Para deixar JPA ciente da qual implementação é utilizada.

**@Column**: Utilizado essa anotação para especificar o nome da coluna, se ela aceitas valores nulos e também qual o seu tamanho máximo.


## Conclusão

Neste projeto foi utilizado uma classe que representa uma tabela no banco de dados e que mais utilizadas da especificação JPA.


![image](https://user-images.githubusercontent.com/106537496/216715455-b52ebe31-0b99-4760-9cf7-06f6f47c6412.png)


