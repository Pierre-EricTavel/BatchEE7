/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;

import javax.batch.api.Batchlet;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class PerrinBatchlet implements Batchlet{

    @Override
    public String process() throws Exception {
        System.out.println("dans le process de PerrinBatchlet");
        return "COMPLETED";
    }

    @Override
    public void stop() throws Exception {
        System.out.println("process PerrinBatchlet arreté");
    }
    
}
