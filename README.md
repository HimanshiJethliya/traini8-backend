Traini8 - Training Center API (Spring Boot)

This is an MVP for a **Government-funded Training Center registry**, built using **Spring Boot**.  
It allows users to **add and retrieve training centers** with validation and database persistence.

---

## Features
- Create a new training center via **POST /api/training-centers**
- Retrieve all stored training centers via **GET /api/training-centers**
- Input validations (email, phone number, center code, etc.)
- Stores data in **H2 Database**
- Exception handling for invalid inputs
- H2 Console enabled for debugging

---

## Setup & Installation

### Clone the repository
```sh
git clone https://github.com/your-username/traini8-backend.git
cd traini8-backend
