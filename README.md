# LiveDataBinding
Example showing how to use LiveData with Data Binding by using support introduced in [Android Studio 3.1 Canary 6](https://androidstudio.googleblog.com/2017/12/android-studio-31-canary-6-is-now.html).
You can read more here in my blogpost: [Architecture Components: How to use LiveData with Data Binding?](https://medium.com/@pszklarska/android-architecture-components-livedata-with-data-binding-7bf85871bbd8)

## Gettings Started

To use this project, you need to have proper version of Android Studio and Android Gradle plugin.

### Android Studio

Android Studio in version 3.1 Canary 6 (at least). You can check your version and possible updates by clicking *Help -> Check for Update* (on Mac, *Android Studio -> Check for Updates*). 

### Android Gradle plugin

To use LiveData with Data Binding in your project, you need also upgrade Android Gradle plugin version in your `app/build.gradle` file:

```
buildscript {
    dependencies {
        classpath 'com.android.tools.build:gradle:3.1.0-alpha06'
    }
}
```
If you use Kotlin, you need to change this version also for Data Binding compiler:
```
kapt 'com.android.databinding:compiler:3.1.0-alpha06'
```
## Usage

Project has three layers:
* **Model** - package containing a simply `Kitty` class
* **View** - package containing an activity showing kitty name and age \<wow>
* **ViewModel** - package containing `KittyRepository` class that simulates getting new kitties every minute

## Author
- Paulina Szklarska - [@p_szklarska](https://twitter.com/p_szklarska) - [@pszklarska](https://medium.com/@pszklarska)

## Contributing
All pull requests are welcome! 

## License
[MIT](https://github.com/pszklarska/LiveDataBinding/blob/master/LICENSE)
