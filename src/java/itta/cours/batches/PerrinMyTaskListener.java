/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;


import javax.batch.api.listener.AbstractStepListener;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;

/**
 *
 * @author Administrator
 */
public class PerrinMyTaskListener extends AbstractStepListener{

    @Inject
    StepContext stepContext;
    
    @Override
    public void afterStep() throws Exception {
        System.out.println("after Step " + stepContext.getStepName());
    }

    @Override
    public void beforeStep() throws Exception {
        System.out.println("before Step "+  stepContext.getStepName());
    }
    
}
