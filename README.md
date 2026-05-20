# Exchange Rates Project

Fullstack application for displaying and storing exchange rates.

The application fetches currency exchange rates from an external API, stores them into a database and displays them in a React frontend application.

## Technologies

### Backend
- Java
- Spring Boot
- Maven
- H2 Database

### Frontend
- React
- Vite
- React Router

---

## Features

- Fetch exchange rates from external API
- Store rates into database
- Load rates from database
- Display exchange rates table
- Detail page for each currency

---

## Backend

Runs on:

```bash
http://localhost:8080
```

API endpoint:

```bash
GET /api/rates?usedb=false
```

- Fetches current exchange rates from the external API
- Saves the data into the database
- Returns the fetched data

```bash
GET /api/rates?usedb=true
```

- Loads exchange rates directly from the database
- Returns stored data

---

## Frontend

- Displays exchange rates in a styled table
- Clickable rows
- Currency detail page
- Dynamic routing using React Router

Frontend runs on:

```bash
http://localhost:5173
```

---

## Database

The application uses an in-memory H2 database.

H2 Console:

```bash
http://localhost:8080/h2-console
```

JDBC URL:

```bash
jdbc:h2:mem:testdb
```

---

## Screenshots


