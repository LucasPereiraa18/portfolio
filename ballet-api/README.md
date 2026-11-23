# Ballet API (Spring Boot)

API REST para uma escola de ballet.

## Modelo
- **Herança:** `Pessoa` (abstrata) -> `Aluna`, `Professora` (JOINED)
- **1:N:** `Professora` 1—N `Turma` e `Turma` 1—N `Aluna`
- **N:N:** `Espetaculo` N—N `Aluna` (tabela `espetaculo_aluna`)
- **CRUD:** POST, GET, GET/{id}, PUT/{id}, DELETE/{id} em `/professoras`, `/turmas`, `/alunas`, `/espetaculos`
  (`Pessoa` é abstrata, então seu CRUD é feito pelas subclasses)

## Executar
```
mvn spring-boot:run
```
Console do banco: http://localhost:8080/h2-console  (JDBC URL: `jdbc:h2:file:./data/ballet`, user `sa`, senha vazia)

## Exemplos (ordem sugerida)
POST /professoras
```json
{"nome":"Ana Souza","email":"ana@ballet.com","dataNascimento":"1985-04-10","especialidade":"Clássico"}
```
POST /turmas
```json
{"nome":"Baby Class","modalidade":"Clássico","diaSemana":"Quarta","horario":"15:00","professora":{"id":1}}
```
POST /alunas
```json
{"nome":"Maria Clara","email":"maria@email.com","dataNascimento":"2016-08-20","nivel":"Iniciante","turma":{"id":1}}
```
POST /espetaculos
```json
{"titulo":"O Quebra-Nozes","data":"2026-12-12","local":"Teatro Municipal","alunas":[{"id":1}]}
```
PUT /alunas/1 (mesmo corpo do POST, com os dados alterados)  
DELETE /alunas/1
