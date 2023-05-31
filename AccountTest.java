// public class AccountTest {
//     public static void main(String[] args) {
//         testInstantiate();
//         // testTransfer();
//     }
//     private static void testInstantiate() {
//         System.out.println("Accountがnewできるかテスト");
//         Account a = new Account("ミナト", -200);
//         if (!"ミナト".equals(a.owner)) {
//             System.out.println("失敗：名義がおかしい");
//         }
//         if (30000 != a.zandaka) {
//           System.out.println("失敗：残高がおかしい");
//         }
//         System.out.println("test終了");
//     }
//     // private static void testTransfer() {
//     //   Account a1 = new Account("ミナト", 30000);
//     //   transfer(a1, 10000);
//     //   if (20000 != a1.zandaka) {
//     //     System.out.println("失敗：残高がおかしい");
//     //   }
//     //   System.out.println("test終了");
//     // }
    
// }

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
  @Test public void instantiate() {
    Account a = new Account("南", 30000);
    assertEquals("南", a.owner);
    assertEquals(30000, a.zandaka);
  }
}