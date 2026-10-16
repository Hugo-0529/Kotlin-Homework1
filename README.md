# Kotlin Homework1 — 猜拳遊戲

應用軟體實習 Kotlin Homework1。使用 **Kotlin** 實作猜拳（剪刀 / 石頭 / 布）遊戲，對應課本
《輕鬆學會 Android Kotlin 實作開發：精心設計 24 個 Lab》：

- **CHAPTER 02 介面設計與元件佈局** — 版面配置、猜拳遊戲介面設計（`activity_main.xml`）
- **CHAPTER 03 物件控制與事件監聽** — 綁定元件與監聽事件、猜拳遊戲程式設計（`MainActivity.kt`）

參考 Lab 原始碼：<https://github.com/taipeitechmmslab/MMSLAB-Android-Kotlin>

## 遊戲說明

1. 輸入玩家姓名
2. 選擇要出的拳（剪刀 / 石頭 / 布）
3. 按下「猜拳」，電腦以亂數出拳，畫面顯示：名字、勝利者、我方出拳、電腦出拳

## 專案資訊

- 語言：Kotlin
- 最低 SDK：API 24，編譯 SDK：API 37
- 主要檔案：
  - `app/src/main/java/com/example/myapplication/MainActivity.kt`
  - `app/src/main/res/layout/activity_main.xml`

## 建置

```bash
./gradlew assembleDebug
```
