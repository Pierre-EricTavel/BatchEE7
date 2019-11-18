/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;

import javax.batch.api.chunk.ItemProcessor;

/**
 *
 * @author Administrator
 */
public class PerrinProcessor implements ItemProcessor{

    @Override
    public Object processItem(Object item) throws Exception {
       StringBuilder sb = (StringBuilder)item;
       sb.delete(14, sb.length());
       return sb;
    }
    
}
