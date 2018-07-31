# spring-boot-jpa-mysql

# REST API

GET

http://localhost:8080/users

get All users details.

GET

http://localhost:8080/users/{id}

get single user detail by "id".



POST

Header
Content-Type : application/json

http://localhost:8080/users

{
  "name": "Arun",
  "doj": "2009-03-02",
  "salary": 6000
}

add new user



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

update user by {id}


DELETE

http://localhost:8080/users/{id}

delete user by {id}
