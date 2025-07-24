Rokomari.com End-to-End Automation Testing
This project demonstrates end-to-end automation testing for Rokomari.com, an online bookstore. It validates the complete purchase flow — from login to checkout and sign-out — using Selenium WebDriver with Java and TestNG.

Table of Contents
Project Overview
Automation Flow
Tech Stack
Test Coverage


Project Overview
The aim of this project is to automate major user actions on Rokomari.com, ensuring smooth author selection, book filtering, cart management, checkout process, and sign-out functionality.

Automation Flow
This suite automates the entire customer journey:

i.Sign Up/Login using Google or mobile number

ii.Navigate to লেখক (Authors) menu

iii.Select author হুমায়ুন আহমেদ

iv.Apply category filters:

 ~সমকালীন উপন্যাস (Contemporary Novel)

~রচনা সংকলন ও সমগ্র (Essay Collection)

v.Scroll down and navigate to Next Page (if available)

vi.Select any book and Add to Cart

vii.Click the Cart icon

viii.Proceed to Checkout

ix.Provide Shipping Information (Name, Phone, Address, etc.)

x.Log Out successfully

Tech Stack
Language: Java
Framework: Selenium WebDriver, TestNG
Build Tool: Maven
IDE: IntelliJ IDEA
Test Design Pattern: Page Object Model (POM)
Version Control: Git, GitHub

Test Coverage
The project includes modular test cases for:
Login Page: Validating page load, login via mobile number, profile verification
Home Page: Checking welcome text, navigation to book sections
Book Page: Selecting author tab and scrolling through authors
Author Page: Applying category filters and handling pagination
Selected Book Page: Validating author details and selecting book
Cart & Checkout Page: Adding book to cart, filling shipping details, and sign-out

Project Structure
bash
Copy
Edit
Rokomari.com-Automation/
│
├── src/test/java/testCases/       # Test classes (TestNG)
│   ├── TestLogin.java
│   ├── TestHomePage.java
│   ├── TestBookPage.java
│   ├── TestAuthorPage.java
│   ├── TestSelectedBook.java
│   └── TestCartAndSignOutPage.java
│
├── src/main/java/pages/           # Page Object Models
│   ├── LoginPage.java
│   ├── HomePage.java
│   ├── BookPage.java
│   ├── AuthorPage.java
│   ├── SelectBookFromPage.java
│   └── CartAndSignOutPage.java
│
├── pom.xml                        # Maven dependencies
├── testng.xml                     # TestNG suite configuration
└── README.md                      # Project documentation



