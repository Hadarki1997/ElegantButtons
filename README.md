# ElegantButtonsLibrary

ElegantButtonsLibrary is a custom Android library that provides a set of stylish and customizable buttons inspired by popular video games. These buttons are perfect for game developers looking to add a professional and engaging look to their game interfaces.

## Features

- A variety of button styles inspired by popular computer games.
- Easy customization of button colors, text, and fonts.
- Support for both XML and programmatic customization.
- Includes buttons with gradients, rounded corners, and vector backgrounds.


## Installation

To include the ElegantButtonsLibrary in your project, follow these steps:

##### Step 1: Add the JitPack repository to your build file

Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add the dependency

Add this dependency to your module's build.gradle file:
```groovy
dependencies {
    implementation 'com.github.Hadarki1997:ElegantButtonsLibrary:1.0.6'
}
```
## Usage
Here are examples of how to use the buttons provided by the ElegantButtonsLibrary in your layout XML files.

## Button1
A stylish button with a modern design, inspired by popular video game interfaces.
```xml
<Button
    android:id="@+id/button1"
    style="@style/Button1"
    android:text="ACCEPT" />
```
## Button2
A button with a unique font and background, ideal for action commands.
```xml
<Button
    android:id="@+id/button2"
    style="@style/Button2"
    android:text="START" />
  ```
## Button3
A large, bold button for primary actions.
```xml
<Button
    android:id="@+id/button3"
    style="@style/Button3"
    android:text="PLAY" />
```

## More Buttons
The library includes several more button styles (Button4 to Button10) which you can use similarly by applying their respective styles in your layout XML.

## Implementation
Here is an example of how to implement the button click functionality in your MainActivity:

```java
package com.example.elegantbuttons;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 1 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 2 clicked!", Toast.LENGTH_SHORT).show();
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Button 3 clicked!", Toast.LENGTH_SHORT).show();
        });

        // Add more button click implementations as needed
    }
}
```
## Credits
ElegantButtonsLibrary is developed by Hadarki1997. Special thanks to the open-source community for providing inspiration and resources.



