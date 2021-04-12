# Aplicação simples em Spring Boot para testes
A aplicação utiliza Spring Boot, Maven, Java 11+ e Hibernate no backend, enquanto no frontend possui Vue.js, Riot.js e Materialize. No entanto, você não está restrito a utilizar essas tecnologias, sinta-se livre para improvisar.

A aplicação está configurada para criar as tabelas no banco automaticamente, mas é necessário criar uma base PostgreSQL com os dados de conexão presentes no application.properties. Também não é necessário manter a configuração padrão em PostgreSQL, sinta-se livre para utilizar o SGBD que tiver mais experiência.

Para resolução do teste, apenas faça um fork deste projeto e dê commit/push normalmente no que for modificado. 

Quanto mais itens corretos, melhor a pontuação.

## TODO
## <strike>0. configuração</strike>
- a) <strike>criar uma propriedade custom no arquivo application.properties, com o nome linkedin.name e valor igual ao seu nome de usuário (da forma como aparece na URL do LinkedIn). Por exemplo: considerando a URL de perfil https://www.linkedin.com/in/joaozinho123/, a variável teria o valor de "joaozinho123".</strike>
- b) <strike>modificar a aplicação para subir na porta HTTP considerando o valor ASCII do primeiro caractere da variável acima, concatenado com "80". Por exemplo: utilizando o exemplo acima, a aplicação subiria na porta 10680.</strike>
- c) <strike>modificar a variável de prefixo REST (já existente) para ser igual aos três primeiros caracteres da variável definida no item a).</strike>

## <strike>1. server - GET /skills</strike>
- <strike>modificar GET /skills para retornar ordenado por nome</strike>
	
## <strike>2. server - GET /stats</strike>
- <strike>modificar GET /stats para retornar ordenado por total (decrescente) e avg (decrescente)</strike>

## <strike>3. server - GET /skills/like</strike>
- <strike>corrigir GET /skills/like para filtrar por nome</strike>

## <strike>4. CRUD REST para a classe JobBean</strike>
- <strike>mapear para /jobs</strike>
- <strike>suporte para GET, POST, DELETE</strike>

### <strike>4.1. Criar card no index.html para visualização ou inclusão de Jobs</strike>
- <strike>seguindo o padrão dos outros cards já existentes</strike>

### <strike>4.2. CRUD View para o JobBean</strike>
- <strike>com página de listagem</strike>
- <strike>inserção/edição/remoção</strike>
- <strike>acessível pela página inicial</strike>

### <strike>4.3. Criar constraint para impedir inclusão de mais um job com o mesmo nome</strike>

## <strike>5. Corrigir a classe RestAspect</strike> 
- <strike>para que seus métodos sejam chamados a cada requisição HTTP</strike>

### <strike>5.1. Corrigir a tela /stats/list.htm</strike> 
- <strike>para exibir o tempo médio de execução de cada evento logado</strike>

### <strike>5.1.1. Modificar para que o valor médio seja exibido com no máximo duas casas decimais</strike>

## <strike>6. REST - modificar serviço /skills</strike>
- <strike>implementar método GET com o mapeamento /skills/name/{name} ou /skills?name={name} para trazer um item com um nome específico</strike>

### <strike>6.1. REST - modificar serviço /skills</strike>
- <strike>implementar método GET com o mapeamento /skills/exists/name/{name} ou /skills/exists?name={name} para trazer um booleano indicando se um item com um nome específico existe na base de dados</strike>

## <strike>7. Rodapé</strike>
- <strike>incluir seu nome completo no rodapé da página.</strike>
