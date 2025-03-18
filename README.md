# 🚀 Low Coupling in Java (GRASP Principle)

## 📌 Overview
This project demonstrates **Low Coupling** in Java using **two versions** of an Order Management System:  
1️⃣ **High Coupling (Bad Design)** – Tightly coupled code that is difficult to maintain.  
2️⃣ **Low Coupling (Good Design)** – Uses **interfaces & dependency injection** for better flexibility.  

---

# What is Low Coupling?

🔹 Low Coupling means that one class has minimal dependency on another class.
🔹 It ensures that changes in one class do not heavily affect other classes.
🔹 This improves maintainability, scalability, and flexibility in a software system.
🔹 It improves maintainability, reusability, and flexibility.
🔹 Changes in one class do not heavily impact others.

---

## ❌ **High Coupling Version (Bad Design)**
📂 **Location:** `src/highcoupling/`  
- The `Customer` class **is directly dependent on `OnlineOrder` and `InStoreOrder`**.
- **Adding a new order type requires modifying `Customer`**, violating **OCP (Open-Closed Principle)**.
- **Hard to maintain, scale, and test**.


## Video Explanation
https://drive.google.com/file/d/17m5cclcbNeVF1dsyzf9RlY_UZ7WrtyQG/view?usp=sharing
