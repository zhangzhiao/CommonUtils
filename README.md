# CommonUtils

Android Kotlin CommonUtils

## These tools depend on ViewBinding!

### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
} 
```

### Step 2. Add the dependency

```groovy
dependencies {
    implementation 'com.github.zhangzhiao:CommonUtils:Tag'
}
```

See the tag of the latest release

[![](https://jitpack.io/v/zhangzhiao/CommonUtils.svg)](https://jitpack.io/#zhangzhiao/CommonUtils)

---

## USE

```kotlin
    /**
 * ext Check Thread
 */
fun sampleThreadCheck() {
//        1. Run in mainThread
    onUI {
        //do some thing
    }
//        2. Run in backgroundThread
    doAsync {
        //do some thing
    }
//        3. run delay on mainThread  (ms)
    delay(1000) {

    }
//        4. run a task to poll on mainThread interval(ms) loopKey used to cancel the poll
    doPoll(300, 1) {
        // Stop the poll at block
        it.removePoll()
    }
    // Stop the poll at another
    removePoll(1)
}

/**
 * view ..
 */
fun viewExt(view: View) {
    view.toGone()
    view.toVisible()
    view.toInvisible()
}

/**
 * global
 */
fun global() {
//        Warning cannot bind to lifecycle
    appGlobalScope.launch {

    }
}
/**
 *Get frame rate
 */
getFps {
    Log.e("FPS", it)
}
```

Please check the code ~ for other content
    
