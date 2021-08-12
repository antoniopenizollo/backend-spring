# backend-spring - exemplos de boas práticas
Documentação criada para facilitar futuramente :)

## instrução para executar o projeto

1.  criar um banco de dados postgres com o nome: organicdb
2.  executar projeto e verificar se algumas tabelas estão populadas. ex: cliente
3.  executar endpoint localhost:8080/login passando no body:
{
    "email":"antoniopenizollo@gmail.com",
    "senha":"123"
}
4.  buscar o token no headers e adicionar no header no campo Authorization de um endpoint qualquer. ex. localhost:8080/pedidos/1
