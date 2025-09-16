# Mealz App 🍲

A sample Android application that displays meal categories from [TheMealDB API](https://www.themealdb.com/api.php). This project serves as a practical demonstration of modern Android development architecture.

The primary goal was to implement a **Clean Architecture** pattern and practice **Dependency Injection** using **Koin**.

---

## ✨ Key Features & Concepts Demonstrated

* **Clean Architecture:** The codebase is separated into three distinct layers (Presentation, Domain, Data) to ensure a clean separation of concerns, making the app scalable and maintainable.
* **Dependency Injection:** Used **Koin** to manage and provide dependencies throughout the app, which helps in decoupling components and improving testability.
* **MVVM Architecture:** Followed the Model-View-ViewModel pattern in the presentation layer for a clear separation of UI and business logic.
* **Jetpack Compose:** The entire UI is built using modern declarative UI with Jetpack Compose.
* **Kotlin Coroutines & Flow:** Handled all asynchronous operations for networking and data handling in a non-blocking way.
* **Retrofit:** Used for making network requests to the REST API.

---

## 🏛️ Architecture

This project follows the principles of Clean Architecture, separating the project into three main modules/layers:<br>
+--------------------------------------------------+<br>
|               Presentation Layer                 |<br>
|       (UI - Jetpack Compose, ViewModel)          |<br>
+--------------------------------------------------+<br>
|<br>
+--------------------------------------------------+<br>
|                  Domain Layer                    |<br>
|    (Use Cases, Models, Repository Interface)     |<br>
+--------------------------------------------------+<br>
|<br>
+--------------------------------------------------+<br>
|                   Data Layer                     |<br>
| (Repository Implementation, API Service, DTOs)   |<br>
+--------------------------------------------------+<br>

---

## 🛠️ Tech Stack & Libraries

* [Kotlin](https://kotlinlang.org/) - First-class and official programming language for Android development.
* [Jetpack Compose](https://developer.android.com/jetpack/compose) - Android’s modern toolkit for building native UI.
* [Coroutines & Flow](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous programming.
* [MVVM](https://developer.android.com/jetpack/guide) - Model-View-ViewModel architecture pattern.
* [Koin](https://insert-koin.io/) - A pragmatic lightweight dependency injection framework.
* [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
* [Coil](https://coil-kt.github.io/coil/) - An image loading library for Android backed by Kotlin Coroutines.

---

## 🚀 Setup & Installation

To run this project, you'll need Android Studio Arctic Fox or later.

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/yasminhosam/MealzApp.git](https://github.com/yasminhosam/MealzApp.git)
    ```

2.  **Open in Android Studio:**
    Open the cloned directory in Android Studio.

3.  **Build the project:**
    Let Android Studio sync the Gradle files and build the project.

4.  **Run the app:**
    Select the `app` configuration and run it on an emulator or a physical device.
