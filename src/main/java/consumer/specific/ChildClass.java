package consumer.specific;

import lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[Child:optionalMethod] EXTRA Stuff here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    private void mandatoryMethod() {
        System.out.println("[Child:mandatoryMethod]: My own important stuff");
    }
}