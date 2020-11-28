package jp.techacademy.takuya.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("拓也", 32,"仕事")      // 名前を拓也、年齢32歳で、仕事を考えるのHumanのインスタンスを作る
        val human2 = Human("絢", 31, "食事")      // 名前を拓也、年齢32歳で、仕事を考えるのHumanのインスタンスを作る
        human.say()
        human.think()
        human2.say()
        human2.think()
    }
}