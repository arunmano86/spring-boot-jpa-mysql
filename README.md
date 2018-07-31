# spring-boot-jpa-mysql

# REST API

GET
http://localhost:8080/users

GET
http://localhost:8080/users/{id}



POST

Header
Content-Type : application/json
http://localhost:8080/users

{
  "name": "Arun",
  "doj": "2009-03-02",
  "salary": 6000
}

PUT

Header
Content-Type : application/json

http://localhost:8080/users/{id}

{
  "name": "ArunKumar",
  "doj": "2009-03-02",
  "salary": 6000,
  "id": 1 
}


DELETE

http://localhost:8080/users/{id}
