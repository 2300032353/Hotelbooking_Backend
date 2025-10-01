# Hotel Booking Backend (Spring Boot + MySQL)

## Prerequisites
- Java 17+
- Maven 3.9+
- MySQL running locally

## MySQL Credentials
- username: root
- password: Lohi@353
- db name: hotelbooking (auto-created)

## Run App
```bash
mvn spring-boot:run
```
The API will be available at `http://localhost:8080`.

## Endpoints
- GET `/api/hotels`
- GET `/api/hotels/{id}`
- POST `/api/hotels`
- PUT `/api/hotels/{id}`
- DELETE `/api/hotels/{id}`

CORS is enabled for `http://localhost:5173`.

## Postman
Import `postman_collection.json` and hit the endpoints.

## Notes
- Schema is generated automatically (`spring.jpa.hibernate.ddl-auto=update`).
- Seed data is inserted on first run if table is empty.
"# Hotelbooking_Backend" 
