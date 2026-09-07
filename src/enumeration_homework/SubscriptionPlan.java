package enumeration_homework;

public enum SubscriptionPlan {
    FREE(0.0),
    BASIC(9.99),
    PREMIUM(19.99),
    ENTERPRISE(49.99);

    private final double monthlyCost;

    SubscriptionPlan(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Method using a switch statement to print benefits
    public static void printBenefits(SubscriptionPlan plan) {
        switch (plan) {
            case FREE:
                System.out.println(plan + ": Basic access with ads. Cost: $"
                        + plan.getMonthlyCost());
                break;
            case BASIC:
                System.out.println(plan + ": Ad-free streaming in 720p. Cost: $"
                        + plan.getMonthlyCost());
                break;
            case PREMIUM:
                System.out.println(plan + ": 4K streaming, offline downloads, multiple screens. Cost: $"
                        + plan.getMonthlyCost());
                break;
            case ENTERPRISE:
                System.out.println(plan + ": Dedicated support, custom integrations, unlimited seats. Cost: $"
                        + plan.getMonthlyCost());
                break;
        }
    }

    // Method to compare two plans
    public static void comparePlans(SubscriptionPlan plan1, SubscriptionPlan plan2) {

        int comparison = plan1.compareTo(plan2);

        if (comparison > 0) {
            System.out.println(plan1 + " is a higher tier than " + plan2);
        } else if (comparison < 0) {
            System.out.println(plan2 + " is a higher tier than " + plan1);
        } else {
            System.out.println("Both are the same plan (" + plan1 + ")");
        }
    }
}
