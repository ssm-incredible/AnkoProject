package com.bibimcode.ankoproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        
        verticalLayout {
            padding = dip(30)
            editText {
                hint = "아이디"
                textSize = 24f
            }
            editText {
                hint = "비밀번호"
                textSize = 24f
            }
            button("Login") {
                textSize = 26f
            }
        }
    }
}
