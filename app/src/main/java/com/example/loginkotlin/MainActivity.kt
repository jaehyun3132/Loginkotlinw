package com.example.loginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LoginBtn.setOnClickListener {

            val inputId = idEtn.text.toString()
            val inputPassword = passEtn.text.toString()
            //두개의 변수에 들어있는 값 검사 (맞는 id/pass)
            //맞을 때 => 틀릴때 분기처리 (if 활용문)
            //id도 맞고 비번도 맞아야한다 그래야 관리자

            if (inputId =="wogus3132@naver.com" && inputPassword == "dhtmdgml12@")
                //id  && pw 같다면 관리자입니다 toast
            {Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()}


            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}