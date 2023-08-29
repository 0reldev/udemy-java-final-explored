package lpa.generic;

public class BaseClass {

    public final void recommendedMethod() {
        System.out.println("[BaseClass.recommendedMethod]: Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod]: Customize Optional Method");
    }

    private void mandatoryMethod() {
        System.out.println("[BassClass.mandatoryMethod]: NON-NEGOTIABLE!");
    }

    public static void recommendedStatic() {

        System.out.println("[BaseClass.RecommendedStatic] BEST way to do it");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic() {
        System.out.println("BaseClass.optionalStatic]: Optional");
    }

    private static void mandatoryStatic() {
        System.out.println("[BaseClass.mandatoryStatic]: MANDATORY");
    }
}
