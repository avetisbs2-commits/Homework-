package enumeration_homework;

public class SubscriptionTest {
    public static void main(String[] args) {
        System.out.println("--- Plan Benefits ---");
        for (SubscriptionPlan plan : SubscriptionPlan.values()) {
            SubscriptionPlan.printBenefits(plan);
        }

        System.out.println("\n--- Plan Comparisons ---");
        SubscriptionPlan.comparePlans(SubscriptionPlan.BASIC, SubscriptionPlan.PREMIUM);
        SubscriptionPlan.comparePlans(SubscriptionPlan.ENTERPRISE, SubscriptionPlan.FREE);
        SubscriptionPlan.comparePlans(SubscriptionPlan.FREE, SubscriptionPlan.FREE);
    }
}