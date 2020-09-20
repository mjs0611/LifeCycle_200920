package kr.co.tjoeun.lifecycle_200920

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        Log.d("다른화면", "onCreate 실행됨")

        goBackBtn.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("다른화면", "onDestroy 실행됨")
    }
}