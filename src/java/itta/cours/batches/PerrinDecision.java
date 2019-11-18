/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;

import java.util.Random;
import javax.batch.api.Decider;
import javax.batch.runtime.StepExecution;

/**
 *
 * @author Administrator
 */
public class PerrinDecision implements Decider{

    Random r = new Random();
    @Override
    public String decide(StepExecution[] executions) throws Exception {
        System.out.println("Decision made by "+executions[executions.length-1].getStepName());
        if(r.nextBoolean())
            return "value1";
        return "value2";
        
    }
    
}
