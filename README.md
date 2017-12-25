# LiveDataBinding
Example showing how to use LiveData with Data Binding by using support introduced in [Android Studio 3.1 Canary 6](https://androidstudio.googleblog.com/2017/12/android-studio-31-canary-6-is-now.html).
You can read more here in my blogpost: [Architecture Components: How to use LiveData with Data Binding?](https://medium.com/@pszklarska/android-architecture-components-livedata-with-data-binding-7bf85871bbd8)

Project has three layers:
* **Model** - package containing a simply `Kitty` class
* **View** - package containing an activity showing kitty name and age \<wow>
* **ViewModel** - package containing `KittyRepository` class that simulates getting new kitties every minute
