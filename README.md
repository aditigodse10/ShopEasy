# 🛍️ ShopEasy - All-in-One Local Store App

**ShopEasy** is a modern Android application that allows users to shop from **local stores** across various categories — food, clothes, electronics, and more. The app is built using **Jetpack Compose** and follows a clean **MVVM architecture**. The **Food** section is fully functional and more categories are in development.

---

## 🚀 Features

- 🥘 **Food Section** – Live and functional
- 🧱 Built with **Jetpack Compose** for fast, declarative UI
- 📐 **MVVM architecture** for scalable and testable code
- 🔥 **Firebase** integration (Authentication, Database, Analytics)
- 🗺️ Store locator with map integration
- 📊 Repository pattern for clean data management

---

## 📂 Project Structure

```

app/
├── manifests/
│   └── AndroidManifest.xml
├── java/com.example.shopeasy/
│   ├── Activities/
│   │   ├── Dashboard
│   │   ├── Map
│   │   └── Results
│   ├── Domain/
│   │   ├── BannerModel.kt
│   │   ├── CategoryModel.kt
│   │   └── StoreModel.kt
│   ├── Repository/
│   │   ├── DashboardRepository.kt
│   │   └── ResultsRepository.kt
│   ├── Theme/
│   │   ├── Color.kt
│   │   ├── Theme.kt
│   │   └── Type.kt
│   └── ViewModel/
│       ├── DashboardViewModel.kt
│       └── ResultsViewModel.kt
├── res/
│   ├── drawable/
│   ├── mipmap/
│   ├── values/
│   │   ├── colors.xml
│   │   ├── strings.xml
│   │   └── themes.xml
│   └── xml/

```

---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **Architecture**: MVVM (Model-View-ViewModel)
- **Backend**: Firebase (Auth, Realtime DB / Firestore)
- **Tools**: Android Studio, Gradle, Git

---

## ⚙️ Firebase Setup

To run this app:

1. Clone the repo
2. Create a Firebase project at [firebase.google.com](https://firebase.google.com)
3. Download `google-services.json` and place it in `/app`
4. Sync project with Gradle

---

## 📱 Screenshots

*(Insert your Compose UI previews or emulator screenshots here)*

---

## 🧪 Testing

- Instrumentation tests: `androidTest`
- Unit tests: `test`

---

## 📌 Upcoming Modules

- 👗 Clothes Store UI
- 📱 Electronics Marketplace
- 🛍️ Cart & Order Management
- 🔔 Push Notifications
- 🌐 Multi-language Support

---

## 🧑‍💻 Developer

Made with ❤️ by **Shreyash Bhor**

---

## 📝 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.
```

---

