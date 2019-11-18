/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itta.cours.batches;

import java.util.Random;
import javax.batch.api.chunk.AbstractItemReader;

/**
 *
 * @author Administrator
 */
public class PerrinReader extends AbstractItemReader {
    Random r = new Random();
    
    @Override
    public Object readItem() throws Exception {
        if(r.nextBoolean())
            return new StringBuilder("Ce que j'ai lu en brut") ;
        return null;
    }
    
}
