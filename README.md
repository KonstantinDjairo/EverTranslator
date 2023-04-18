
# EverDict 
[![GitHub version](https://badge.fury.io/gh/firemaples%2FEverTranslator.svg)](https://badge.fury.io/gh/firemaples%2FEverTranslator) 
[![CI](https://github.com/firemaples/EverTranslator/actions/workflows/ci.yml/badge.svg)](https://github.com/firemaples/EverTranslator/actions/workflows/ci.yml)



<img src="materials/mipmap-xxhdpi/icon.png" width="10%" height="10%" alt="app icon" align="center" />

Look up any text on screen, even in games!

<a href="https://www.youtube.com/watch?v=Y0OjF-luuDE">Watch usage guide on Youtube</a>

<p>
  <img src="materials/PlayStore/device-2016-12-08-204259.jpg" width="200px" />
  <img src="materials/PlayStore/device-2016-12-08-205120.jpg" width="200px" />
  <img src="materials/PlayStore/device-2016-12-08-205741.jpg" width="200px" />
</p>

## Features

 - **Recognize** any text on the screen.
 - **Translate** the recognized text.
 - **Copy** the recognized text or translated text.
 - **Read out** the text. (temporarily removed)

## Requirement

- Android 5.0 (API level 21) or above.
- Permission of display over other apps. (not suitable for Android Go)



### Build from source

#### Environment requirements

- Android SDK
- Android Studio (optional)

#### Produce APK by command line

1. Create a local file `./local.properties` and put your Android SDK path to it as `sdk.dir=path to SDK`, or simplily <a href='#open-project-in-android-stuido'>open the project with Android Studio</a>, it will automatically create the required file for you.
1. Assemble APK file by ```./gradlew clean assembleDevDebug```
1. You can find the APK file on `main/build/outputs/apk/dev/debug/main-dev-debug.apk`
1. Install debug APK to your phone by ```adb install -r -t main/build/outputs/apk/dev/debug/main-dev-debug.apk```

#### Open project in Android Stuido

1. Open the project's root folder by Android Studio, the application module is the `main` folder.
1. You can simplily build and run application by the built-in buttons in Android Studio.

#### Flavors

- **Dev** for development
- **Prod** for releasing to Google Play

## Contact

If you encounter a bug, please open an issue.  

