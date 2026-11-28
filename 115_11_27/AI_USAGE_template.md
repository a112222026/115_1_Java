# 第八週AI使用與驗證紀錄

學生姓名／學號：謝智璿 A112222026。一次主要活動填一列即可；沒有真實AI也能用課堂模擬完成。不要上傳帳密、個資或未授權內容。

| 使用目的與來源 | Prompt／建議摘要 | 採納或拒絕及理由 | 人工驗證方式與結果 | 最終修改 |
|用Copilot，目的解決Todo|---|採納，因使用很順利|驗證可行|修改Todo部分|
| 待填，區分教師模擬與真實工具 | 待填 | 待填 | 待填，附預期／實際或證據位置 | 待填 |

## 虛構填寫示範（非學生本人紀錄，非真實AI對話）

| 使用目的與來源 | Prompt／建議摘要 | 採納或拒絕及理由 | 人工驗證方式與結果 | 最終修改 |
|---|---|---|---|---|
| 課堂Code Review，教師設計的模擬AI | 讓重型車探索得3份；建議在子類別新增同名private explore | 拒絕此做法；父類別private方法不被覆寫，execute仍走父類別流程 | 先預測可編譯但不改產量；HeavyRoverTry的「探索後」與「完成後狀態維持」顯示「不符」；加@Override編譯失敗；修正後同入口十五行都顯示「相符」 | 移除無效private方法，改覆寫protected int exploreYield()，保留drill與execute |

本人E1預測：待填。
修正前commit／證據：待填。
修正後commit／相同案例重測：待填。
三至五句補強Prompt：待填。

若另用真實AI，新增一列，記工具及日期，分開說明哪些建議採納、哪些由本人修改。AI宣稱通過不算人工驗證。
Todo1:https://picgocloud.com/m/x8dq0dj4/a35d5905-467e-4186-805d-27593f921491.png
Todo2:老師上課講解過
Todo3:https://picgocloud.com/m/x8dq0dj4/b2dfd401-b53c-4dcf-b230-725c801dc5e5.png
Todo4:https://picgocloud.com/m/x8dq0dj4/14062c96-9d5f-4434-a764-65fd96dc4381.png