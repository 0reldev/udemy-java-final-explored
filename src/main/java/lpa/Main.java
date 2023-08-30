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

//[BaseClass.recommendedMethod]: Best way to do it
//[BaseClass.optionalMethod]: Customize Optional Method
//[BassClass.mandatoryMethod]: NON-NEGOTIABLE!
//---
//[BaseClass.recommendedMethod]: Best way to do it
//[Child:optionalMethod] EXTRA Stuff here
//[BaseClass.optionalMethod]: Customize Optional Method
//[BassClass.mandatoryMethod]: NON-NEGOTIABLE!
//---
//[BaseClass.recommendedMethod]: Best way to do it
//[Child:optionalMethod] EXTRA Stuff here
//[BaseClass.optionalMethod]: Customize Optional Method
//[BassClass.mandatoryMethod]: NON-NEGOTIABLE!
//---
//[BaseClass.RecommendedStatic] BEST way to do it
//BaseClass.optionalStatic]: Optional
//[BaseClass.mandatoryStatic]: MANDATORY
//---
//[BaseClass.RecommendedStatic] BEST way to do it
//BaseClass.optionalStatic]: Optional
//[BaseClass.mandatoryStatic]: MANDATORY
//---
//[Child.RecommendedStatic] BEST way to do it
//BaseClass.optionalStatic]: Optional


        System.out.println("----");
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();
//            [BaseClass.RecommendedStatic] BEST way to do it
//            BaseClass.optionalStatic]: Optional
//            [BaseClass.mandatoryStatic]: MANDATORY
//            [Child.RecommendedStatic] BEST way to do it
//            BaseClass.optionalStatic]:Optional

        String xArgument = "This is all I've got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
//        c = This is all I've got to say about Section 16
        System.out.println("After method, xArgument = " + xArgument);
        System.out.println("After method, zArgument = " + zArgument);
//        After method, xArgument = This is all I've got to say about Section
//        After method, zArgument = Only saying this: Section 16
    }

    private static void doXYZ(String x, int y, final StringBuilder z) {

        final String c = x + y;
        System.out.println("c = " + c);
        z.append(y);
//        z = new StringBuilder("This is a new reference");
    }
}
