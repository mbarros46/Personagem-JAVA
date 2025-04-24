Projeto Mercado Medieval
API REST feita em Spring Boot simulando um mercado medieval com personagens e itens mágicos.
Como rodar o projeto:
1. Clone o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
2. Acesse a pasta e rode:
./mvnw spring-boot:run
3. Acesse no navegador:
• http://localhost:8080/personagens
• http://localhost:8080/itens
• http://localhost:8080/h2-console
(JDBC URL: jdbc:h2:mem:testdb | Usuário: sa | Senha: em branco)
Como testar no Postman:
Criar personagem (POST):
URL: http://localhost:8080/personagens
Body (raw JSON):
{
“nome”: “Arthas”,
“classe”: “GUERREIRO”,
“nivel”: 45,
“moedas”: 150.0
}
Criar item (POST):
URL: http://localhost:8080/itens
Body (raw JSON):
{
“nome”: “Espada do Rei”,
“tipo”: “ARMA”,
“raridade”: “EPICO”,
“preco”: 90.0,
“dono”: { “id”: 1 }
}
Buscar todos (GET):
• http://localhost:8080/personagens
• http://localhost:8080/itens
Buscar com filtros (GET):
• http://localhost:8080/personagens/buscar/nome?nome=Arthas
• http://localhost:8080/personagens/buscar/classe?classe=GUERREIRO
• http://localhost:8080/itens/buscar/nome?nome=espada
• http://localhost:8080/itens/buscar/tipo?tipo=ARMA
• http://localhost:8080/itens/buscar/raridade?raridade=EPICO
• http://localhost:8080/itens/buscar/preco?min=50&max=200
