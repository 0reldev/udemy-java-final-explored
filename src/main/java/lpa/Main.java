package lpa;

import consumer.specific.ChildClass;
import lpa.generic.BaseClass;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("---");
        childReferredToAsBase.recommendedMethod();
        System.out.println("---");
        child.recommendedMethod();

        System.out.println("---");

        parent.recommendedStatic();
        System.out.println("---");
        childReferredToAsBase.recommendedStatic();
        System.out.println("---");
        child.recommendedStatic();

//            [BaseClass.recommendedMethod]: Best way to do it
//            [BaseClass.optionalMethod]: Customize Optional Method
//            [BassClass.mandatoryMethod]: NON-NEGOTIABLE!
//            ---
//            [BaseClass.recommendedMethod]: Best way to do it
//            [Child:optionalMethod] EXTRA Stuff here
//            [BaseClass.optionalMethod]: Customize Optional Method
//            [BassClass.mandatoryMethod]: NON-NEGOTIABLE!
//            ---
//            [BaseClass.recommendedMethod]: Best way to do it
//            [Child:optionalMethod] EXTRA Stuff here
//            [BaseClass.optionalMethod]: Customize Optional Method
//            [BassClass.mandatoryMethod]: NON-NEGOTIABLE!
//            ---
//            [BaseClass.RecommendedStatic] BEST way to do it
//            BaseClass.optionalStatic]: Optional
//            [BaseClass.mandatoryStatic]: MANDATORY
//            ---
//            [BaseClass.RecommendedStatic] BEST way to do it
//            BaseClass.optionalStatic]: Optional
//            [BaseClass.mandatoryStatic]: MANDATORY
//            ---
//            [BaseClass.RecommendedStatic] BEST way to do it
//            BaseClass.optionalStatic]: Optional
//            [BaseClass.mandatoryStatic]: MANDATORY
    }
}
