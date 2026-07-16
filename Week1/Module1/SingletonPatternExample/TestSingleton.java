package Week1.Module1.SingletonPatternExample;

public class TestSingleton {
        public static void main(String[] args) {
            Logger L1 = Logger.getInstance();
            L1.PrintLog("Application is running");
            Logger L2 = Logger.getInstance();
            L2.PrintLog("Application crashed !");
            System.out.println("L1 = L2 : "+(L1==L2));
        }
}
