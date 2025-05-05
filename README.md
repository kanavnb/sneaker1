
# Sneakers1 – Spring Boot Authentication API

Sneakers1 – это Java Spring Boot проект, реализующий современную аутентификацию с поддержкой JWT, социальной авторизации и регистрацией пользователей.

---

## 🔐 Security Features

- ✅ JWT-аутентификация (access + refresh token)
- ✅ Регистрация пользователей (email + пароль)
- ✅ Авторизация по email и паролю
- ✅ Поддержка входа через Google, Facebook, GitHub (OAuth2)
- ✅ Хранение пользователей в PostgreSQL
- ✅ Шифрование паролей через `PasswordEncoder`
- ✅ Swagger UI для тестирования API

---

## 📦 Стек технологий

- Spring Boot 3.4.5  
- Spring Security  
- JWT (`jjwt`)  
- OAuth2 Client  
- PostgreSQL  
- Swagger (Springdoc OpenAPI)  
- Lombok  

---

## 🚀 Запуск проекта

```bash
./mvnw spring-boot:run
```

_Приложение будет доступно на_ `http://localhost:8080`

---

## 🧪 Тестирование через Postman

### 🔹 Регистрация

**POST** `http://localhost:8080/auth/register`  
```json
{
  "email": "test@example.com",
  "password": "123456",
  "username": "testuser"
}
```

---

### 🔹 Логин

**POST** `http://localhost:8080/auth/login`  
```json
{
  "email": "test@example.com",
  "password": "123456"
}
```

**Ответ:**  
```json
{
  "token": "JWT_TOKEN"
}
```

---

### 🔹 Защищённый эндпоинт

**GET** `http://localhost:8080/profile`  
**Headers:**  
`Authorization: Bearer JWT_TOKEN`

---

### 🔹 Swagger UI

Открой в браузере:  
📎 `http://localhost:8080/swagger-ui.html`  
📎 или `http://localhost:8080/swagger-ui/index.html`

---

## ⚙️ Конфигурация OAuth2

Добавь в `application.yml` или `.properties`:

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: YOUR_CLIENT_ID
            client-secret: YOUR_SECRET
            scope: email, profile
```

---

## 📁 Структура

```
com.sneakers1
├── controller
├── dto
├── entity
├── repository
├── security
├── service
└── config
```

---

## 🛠️ TODO

- [ ] Email верификация
- [ ] 2FA (опционально)
- [ ] Тесты (JUnit + Mockito)

---

## 🧾 License

MIT License
