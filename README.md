# Paging3Caching

## Overview
Paging3Caching is a sample Android application that demonstrates the use of **Paging 3 Library** with **Jetpack Compose**. The project showcases an efficient way to load and cache large datasets while ensuring smooth scrolling and optimized performance.

## Features
- **Jetpack Compose** for building UI components.
- **Paging 3 Library** for efficient pagination.
- **Caching mechanism** to minimize API requests and improve performance.
- **MVVM architecture** following best practices.
- Fetches data from a remote API and stores it in a **Room database**.
- Uses **Retrofit** for API communication.
- Implements **Hilt** for Dependency Injection.

## Tech Stack
- **Kotlin**
- **Jetpack Compose**
- **Paging 3 Library**
- **Room Database**
- **Retrofit**
- **Hilt (Dependency Injection)**

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mshajkarami/Paging3Caching.git
   ```
2. Open the project in Android Studio.
3. Sync Gradle dependencies.
4. Run the app on an emulator or a physical device.

## How It Works
1. **Fetching Data**: The app retrieves data from a remote API using Retrofit.
2. **Paging 3 Implementation**: The Paging 3 Library efficiently loads data in chunks, reducing memory consumption.
3. **Caching**: Data is stored in Room database to enable offline access and minimize redundant network requests.
4. **UI Display**: Jetpack Compose is used to display paginated data with a smooth scrolling experience.

## Contributing
Contributions are welcome! Feel free to open issues and submit pull requests.

## License
This project is licensed under the **MIT License**.

## Contact
For any questions or support, reach out via [your email or GitHub profile].

