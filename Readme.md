
##  System Overview

The **Music Store Management System** is an in-memory application (meaning data isn't saved permanently yet) that handles the core aspects of a music store:

*   **Inventory:** Managing various products, especially musical instruments.
*   **People:** Keeping track of both customers and employees.
*   **Sales:** Recording transactions and generating invoices.
*   **Reporting:** Providing basic insights into inventory value and customer spending.

It's designed with modularity in mind, using distinct classes for each major entity and a central class to orchestrate all operations.

---

## Core Concepts & Entities

The system is built around these fundamental building blocks:

*   **`Person`**: The base for anyone involved with the store.
*   **`Product`**: The base for anything sold by the store.
*   **`Invoice`**: A record of a completed sale.
*   **`MusicStore`**: The central brain that manages everything.

---

##  Class Structure & Relationships

Here's how the classes are organized, demonstrating Java's Object-Oriented Programming (OOP) principles like inheritance and composition.

### 1. The `Person` Hierarchy (Who's involved?)

*   **`Person.java` (Abstract Class)**
    *   **Purpose:** The blueprint for all people (customers, employees). It defines common traits like `id`, `firstName`, `lastName`, `email`, `address`, `phoneNumber`.
    *   **Relationship:** `Customer` and `Employee` inherit from `Person`.

*   **`Customer.java`**
    *   **Purpose:** Represents a store customer.
    *   **Extends:** `Person`.
    *   **Unique Feature:** Keeps a `productHistory` (a list of `Product`s they've bought).

*   **`Employee.java`**
    *   **Purpose:** Represents a store employee.
    *   **Extends:** `Person`.
    *   **Unique Feature:** Has `yearsOfExperience`.

### 2. The `Product` Hierarchy (What's for sale?)

*   **`Product.java` (Abstract Class)**
    *   **Purpose:** The blueprint for all items sold. Defines common traits like `id`, `productName`, `productPrice`, `quantityInStock`, etc.
    *   **Relationship:** `Instrument` extends `Product`.

*   **`Instrument.java` (Abstract Class)**
    *   **Purpose:** A specialized type of `Product` for musical instruments.
    *   **Extends:** `Product`.
    *   **Unique Feature:** Has an `instrumentBrand`.
    *   **Relationship:** Specific instrument types (Guitar, Piano, Banjo) extend `Instrument`.

*   **Concrete Instrument Classes (e.g., `Guitar.java`, `Piano.java`, `Banjo.java`)**
    *   **Purpose:** Represent actual instruments with their own unique characteristics (e.g., `guitarType` for `Guitar`, `numberOfKeys` for `Piano`).
    *   **Extends:** `Instrument`.
    *   ** How to Extend:** To add a new instrument (like a `DrumSet`), you would create a new class, extend `Instrument`, and add any unique attributes it might have!

### 3. The `Invoice` Class (Recording Sales)

*   **`Invoice.java`**
    *   **Purpose:** A detailed record of a single sales transaction.
    *   **Key Data:** `invoiceId`, the `Customer`, the `Employee` who made the sale, the `productsBought` (list of `Product`s), `totalPrice`, and `invoiceDate`.
    *   **Relationship:** It *composes* (`has-a` relationship) `Customer`, `Employee`, and `Product` objects.

### 4. The `MusicStore` Class (The Brains of the Operation)

*   **`MusicStore.java`**
    *   **Purpose:** This is the central control hub. It holds lists of all `Product`s, `Customer`s, `Employee`s, and `Invoice`s. It contains all the core business logic.
    *   **Key Methods:** `addProduct()`, `sellProduct()`, `addCustomer()`, `printInventory()`, `getTotalStoreInventoryValue()`, and many more!
    *   **Relationship:** It *composes* (`has-a` relationship) collections of all other main entity classes.

### 5. The `MusicStoreMenu` Class (Where it all Starts)

*   **`MusicStoreMenu.java`**
    *   **Purpose:** Contains the `main` method where the application begins. It's used to set up initial data, create a `MusicStore` instance, and demonstrate various operations by calling methods on the `MusicStore` object.
    *   ** Your Playground:** This is the file you'll primarily modify to test different scenarios and add new interactions.

---

##  Key Features Implemented

The current system supports these core functionalities:

*   **Product Management:** Add, remove, search, and display products in the store's inventory.
*   **Customer Management:** Add customers, track their purchase history, and calculate their total spending.
*   **Employee Management:** Add and remove employee records.
*   **Sales Processing:** Simulate sales, update stock, and generate invoices.
*   **Basic Reporting:** Calculate total inventory value and individual customer spending.

---

## 📏 Naming Conventions

We follow standard Java naming conventions to keep the code clean and understandable:

*   **Classes:** `PascalCase` (e.g., `MusicStore`, `Customer`)
*   **Methods & Variables:** `camelCase` (e.g., `getProductName`, `totalPrice`)
*   **Packages:** `lowercase.separated.by.dots` (e.g., `com.keyin.musicstore`)

