/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;

import java.util.List;
import javax.batch.api.chunk.AbstractItemWriter;

/**
 *
 * @author Administrator
 */
public class PerrinWriter extends AbstractItemWriter {

    @Override
    public void writeItems(List<Object> items) throws Exception {
       StringBuilder sb = (StringBuilder)items.get(0);
       System.out.println(sb.toString());
        
    }
    
}
