import java.util.Scanner;

public class RoverMission {
    public static void main(String[] args) {
        String scenario = "夜巡任務：沙塵暴後狀態檢查";
        String roverName = "赤砂號";
        char zone = 'D';
        Scanner input = new Scanner(System.in);
        System.out.println("情境：" + scenario);
        System.out.println("探測車：" + roverName + "；區域：" + zone);
        runMission(input, 7, 0);
        input.close();
    }

    // 教師提供的方法骨架：本週只補 TODO，不必自行重寫輸入及顯示。
    static void runMission(Scanner input, int energy, int samples) {
        int actionCount = 0;
        boolean running = true;
        showDashboard(energy, samples, actionCount);
        while (running && energy > 0 && samples < 5) {
            System.out.println("1 Explore | 2 Scan | 3 Charge | 0 Return");
            int command = input.nextInt();
            switch (command) {
                case 1:
                    // D1：足夠能源才扣 6、加 2 份樣本並計次；不足只提示。
                    if (energy >= 6) {
                        energy -= 6;
                        samples += 2;
                        actionCount++;
                        System.out.println("EXPLORE_SUCCESS");
                    } else {
                        System.out.println("INSUFFICIENT_ENERGY");
                    }
                    break;
                case 2:
                    // D2：掃描成本 2、樣本加 1；只有成功行動才計次。
                    if (energy >= 2) {
                        energy -= 2;
                        samples += 1;
                        actionCount++;
                        System.out.println("SCAN_SUCCESS");
                    } else {
                        System.out.println("INSUFFICIENT_ENERGY");
                    }
                    break;
                case 3:
                    // D3：未滿電才加 5，封頂 20；滿電不計次。
                    if (energy < 20) {
                        energy += 5;
                        if (energy > 20) {
                            energy = 20;
                        }
                        System.out.println("CHARGE_SUCCESS");
                    } else {
                        System.out.println("FULL_BATTERY");
                    }
                    break;
                case 0:
                    // break 只離開 switch，旗標讓下一次 while 判斷停止。
                    running = false;
                    break;
                default:
                    System.out.println("UNKNOWN_COMMAND");
                    break;
            }
            // 拒絕及返回時也顯示，可觀察到狀態沒有被修改。
            showDashboard(energy, samples, actionCount);
        }
        // 同一行動可能同時耗盡能源與完成任務，依需求優先判斷成功。
        if (samples >= 5) {
            System.out.println("SUCCESS");
        } else if (energy == 0) {
            System.out.println("EXHAUSTED");
        } else {
            System.out.println("RETURNED");
        }
    }

    static double calculateBatteryPercent(int energy) {
        return energy / 20.0 * 100;
    }

    static void showDashboard(int energy, int samples, int actionCount) {
        System.out.println("energy=" + energy + ", samples=" + samples
                + ", actionCount=" + actionCount
                + ", battery=" + calculateBatteryPercent(energy));
    }
}
