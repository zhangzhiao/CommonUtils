package com.zh.zza.utils.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import appGlobalScope
import delay
import doAsync
import doPoll
import kotlinx.coroutines.launch
import onUI
import removePoll
import toGone
import toInvisible
import toVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * 本方法演示使用DSL样式进行ext的切换线程
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
    fun viewExt(view:View){
        view.toGone()
        view.toVisible()
        view.toInvisible()
    }
    /**
     * global
     */
    fun global(){
//        Warning cannot bind to lifecycle
        appGlobalScope.launch {

        }
    }
}