# 🚀 Rokomari.com Automation Testing

![Java](https://img.shields.io/badge/Java-17-blue)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Testing-yellow)
![Maven](https://img.shields.io/badge/Maven-Build-orange)

---

## 📋 Project Overview

This project automates testing for **Rokomari.com**, focusing on author selection from the horizontal slider, modal pop-up handling, category filtering, and verifying navigation and element visibility.

The automation is built using **Selenium WebDriver (Java)** and **TestNG** to ensure the website’s critical features work as expected and provide reliable feedback for regression testing.

---

## 🧩 Testing Flow & Instructions

1. **Open Rokomari.com homepage.**

2. **Click on the "লেখক" (Author) tab** in the main navigation.

3. **Find author "হুমায়ূন আহমেদ" on the horizontal slider:**
   - Scroll the slider right until the author becomes visible.
   - If author is visible, click on the author's name.

4. **Handle any modal pop-ups** that appear after clicking (close or dismiss to proceed).

5. **Apply category filter**: Click on "সমকালীন উপন্যাস" (Contemporary Novels).

6. **Verify page navigation**:
   - Confirm URL has changed to the correct filtered author page.
   - Check that the page title or heading contains "হুমায়ূন আহমেদ".

7. **Ensure all important page elements are visible and clickable.**

---

## ⚙️ Tech Stack

- **Java 17+**  
- **Selenium WebDriver**  
- **TestNG**  
- **Maven**  
- **ChromeDriver / GeckoDriver**  
- **IntelliJ IDEA / Eclipse**  

---

## 📄 Manual Test Cases

This repository also includes **Excel-based manual test cases** covering the same scenarios as the automated tests.

File path:  
`manual-testcases/Rokomari_Manual_TestCases.xlsx`

---

## 🚀 Setup & Running Tests

### Prerequisites

- Java JDK 17 or higher installed  
- Maven installed and configured in your system PATH  
- ChromeDriver or GeckoDriver for your browser installed and available in PATH  

### Steps

```bash
# Clone the repo
git clone https://github.com/yourusername/rokomari-automation-testing.git
cd rokomari-automation-testing

# Build and install dependencies
mvn clean install

# Run all tests
mvn test
