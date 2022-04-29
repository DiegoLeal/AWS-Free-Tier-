### Efetue o clone do repositório para seu workspace 

```bash
git clone https://github.com/DiegoLeal/aws.git
```



### Em seguinda efetue o build do projeto conforme comando abaixo.



```bash
docker-compose up --buil
```



### Após  efetuado o build do projeto e o mesmo ter iniciado, abra outro terminal, copie o comando abaixo e cole em seu terminal.

```bash
curl --request POST \
  --url http://localhost:8080/api/usuarios \
  --header 'Content-Type: application/json' \
  --data '{
	"id": null,
	"titulo": "AWS",
	"descricao": "AWS Free Tier"
}'
```



### Para verificar os usuarios salvos no banco de dados copie  comando abaixo e cole em seu terminal.

```bash
curl --request GET \
  --url http://localhost:8080/api/usuarios
```



### Se preferir visualizar um seu navegador adicione o link abaixo.

```bash
http://localhost:8080/api/usuarios
```