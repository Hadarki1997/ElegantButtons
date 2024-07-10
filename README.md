# ElegantButtonsLibrary

ElegantButtonsLibrary is a custom Android library that provides a set of stylish and customizable buttons inspired by popular video games. These buttons are perfect for game developers looking to add a professional and engaging look to their game interfaces.

## Installation

To include the ElegantButtonsLibrary in your project, follow these steps:

### Step 1: Add the JitPack repository to your build file

Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

### Step 2: Add the dependency

Add this dependency to your module's build.gradle file:

```groovy
dependencies {
    implementation 'com.github.Hadarki1997:ElegantButtonsLibrary:1.0.4'
}
