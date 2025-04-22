import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎲 歡迎來到骰子遊戲！");
        System.out.print("請輸入你的名字：");
        String playerName = scanner.nextLine();

        System.out.println("\n按下 Enter 鍵來擲骰子...");
        scanner.nextLine();

        int playerRoll = random.nextInt(6) + 1;   // 玩家骰子點數 (1~6)
        int computerRoll = random.nextInt(6) + 1; // 電腦骰子點數 (1~6)

        System.out.println(playerName + " 擲出了 " + playerRoll + " 點！");
        System.out.println("電腦 擲出了 " + computerRoll + " 點！");

        // 判斷勝負
        if (playerRoll > computerRoll) {
            System.out.println("🎉 " + playerName + " 勝利！");
        } else if (playerRoll < computerRoll) {
            System.out.println("電腦勝利！");
        } else {
            System.out.println("雙方平手！");
        }

        scanner.close();
    }
}
