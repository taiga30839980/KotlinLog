package jp.techacademy.taiga.ogura.kotlinlog

import android.util.Log

class Human:Animal,Thinkable {
    var hobby=""

    constructor(name: String, age: Int,hobby:String): super(name, age){
        this.hobby=hobby
    }


    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "(" + this.age + "歳)" + "です。")
    }

    override fun think() {
        Log.d("kotlintest","「私は"+this.hobby+"について考える。」")
    }


}