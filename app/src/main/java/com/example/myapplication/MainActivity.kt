package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edName: EditText
    private lateinit var tvText: TextView
    private lateinit var tvName: TextView
    private lateinit var tvWinner: TextView
    private lateinit var tvMmora: TextView
    private lateinit var tvCmora: TextView
    private lateinit var btnScissor: RadioButton
    private lateinit var btnStone: RadioButton
    private lateinit var btnPaper: RadioButton
    private lateinit var btnMora: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 綁定 xml 元件
        edName = findViewById(R.id.ed_name)
        tvText = findViewById(R.id.tv_text)
        tvName = findViewById(R.id.tv_name)
        tvWinner = findViewById(R.id.tv_winner)
        tvMmora = findViewById(R.id.tv_mmora)
        tvCmora = findViewById(R.id.tv_cmora)
        btnScissor = findViewById(R.id.btn_scissor)
        btnStone = findViewById(R.id.btn_stone)
        btnPaper = findViewById(R.id.btn_paper)
        btnMora = findViewById(R.id.btn_mora)

        btnMora.setOnClickListener {
            // 姓名空白就提醒，否則開始猜拳
            if (edName.text.isBlank()) {
                tvText.text = "請輸入玩家姓名"
            } else {
                // 玩家出拳：0 剪刀 / 1 石頭 / 2 布
                val playerFist = when {
                    btnScissor.isChecked -> 0
                    btnStone.isChecked -> 1
                    else -> 2
                }

                // 電腦出拳：以亂數產生 0~2
                val computerFist = (0..2).random()

                tvName.text = "名字\n${edName.text}"
                tvMmora.text = "我方出拳\n${fistName(playerFist)}"
                tvCmora.text = "電腦出拳\n${fistName(computerFist)}"

                // 判斷勝負：差值對 3 取餘，1=玩家贏、2=電腦贏、0=平手
                when ((playerFist - computerFist + 3) % 3) {
                    1 -> {
                        tvWinner.text = "勝利者\n${edName.text}"
                        tvText.text = "恭喜您獲勝了！！！"
                    }
                    2 -> {
                        tvWinner.text = "勝利者\n電腦"
                        tvText.text = "可惜，電腦獲勝了！"
                    }
                    else -> {
                        tvWinner.text = "勝利者\n平手"
                        tvText.text = "平局，請再試一次！"
                    }
                }
            }
        }
    }

    // 將出拳代碼轉成文字
    private fun fistName(fist: Int): String = when (fist) {
        0 -> "剪刀"
        1 -> "石頭"
        else -> "布"
    }
}
