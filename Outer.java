// public class Outer {
//   int outerField;
//   static int outerStaticField;
// //   static class Inner {
// //     void innerMethod() {
// //       outerStaticField = 10;
// //     }
// //   }
//   class Inner {
//     void innerMethod() {
//       outerStaticField = 10;
//     }
//   }
//   void outerMethod() {
//     Inner ic = new Inner();
//   }
// }
public class Outer {
  int outerMember = 2;
  void OuterMethod() {
    int a = 10;
    class Inner {
      public void InnerMethod() {
        System.out.println("Innerめっそど");
        System.out.println(outerMember + a);
      }
    }
    Inner ic = new Inner();
    ic.InnerMethod();
  }
}