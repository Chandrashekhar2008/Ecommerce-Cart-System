# 🛒 E-Commerce Shopping Cart System

## 📌 Project Overview
This project implements a simple **E-Commerce Shopping Cart System** using **Object-Oriented Programming (OOP)** concepts.  
Users can add/remove products, view their cart, apply discounts and taxes, and generate a final bill summary.

---

## 🚀 Features
- Add products to cart
- Remove products from cart
- View cart items dynamically
- Automatic total calculation
- Apply discounts and taxes
- Checkout with final bill summary

---

## 🎯 Objectives
- Practice **OOP concepts** (classes, objects, encapsulation)
- Implement real-world shopping logic
- Handle data and perform calculations
- Generate bill summaries with discounts and taxes

---

## ⚙️ System Design

### Product Class
- Attributes: `productId`, `productName`, `price`, `quantity`
- Methods: Constructor, Getters/Setters, `displayProduct()`

### Cart Class
- Attributes: `products[]`, `totalAmount`
- Methods: `addProduct()`, `removeProduct()`, `calculateTotal()`, `displayCart()`

---

## 🧮 Billing Logic
```java
// Example Calculation
double total = sum(price * quantity);
double discount = total * 0.10;   // 10% discount
double tax = (total - discount) * 0.05; // 5% tax
double finalAmount = total - discount + tax;
