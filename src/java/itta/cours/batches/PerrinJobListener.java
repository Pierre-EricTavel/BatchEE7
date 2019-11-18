/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;

import javax.batch.api.listener.AbstractJobListener;

/**
 *
 * @author Administrator
 */
public class PerrinJobListener extends AbstractJobListener{

    @Override
    public void afterJob() throws Exception {
        System.out.println("Fin du Job");
    }

    @Override
    public void beforeJob() throws Exception {
        System.out.println("Demarrage du Job");
    }
   
    
}
