public class RoverDashboard {
    public static void main(String[] args) {
        // 情境：夜間沙塵暴後，探測車需先確認狀態再決定是否探索。
        String scenario = "夜巡任務：沙塵暴後狀態檢查";
        String roverName = "赤砂號";
        char zone = 'D';
        int energy = 7;
        boolean locked = true;

        double batteryPercent = calculateBatteryPercent(energy);
        int explorationCount = energy / 6;
        int remainingEnergy = energy % 6;
        boolean validEnergy = energy >= 0 && energy <= 20;
        boolean canExplore = energy >= 6 && !locked;
        String suggestedAction = !validEnergy ? "檢查電池感測值"
            : (locked ? "先解除安全鎖再探索" : (canExplore ? "可執行 Explore" : "先執行 Charge"));

        System.out.println("情境：" + scenario);
        System.out.println("探測車：" + roverName + "；區域：" + zone);
        System.out.println("能源：" + energy + "；電量百分比：" + batteryPercent);
        System.out.println("完整探索次數：" + explorationCount + "；剩餘能源：" + remainingEnergy);
        System.out.println("有效能源：" + validEnergy + "；能否探索：" + canExplore);
        System.out.println("建議下一步：" + suggestedAction);
    }

    static double calculateBatteryPercent(int energy) {
        return energy / 20.0 * 100;
    }
}
