package rest;

import org.springframework.stereotype.Component;

/**
 * Created by hua on 15/10/9.
 */
@Component
public class AaImpl implements Aa {

    @Override
    public void getAa() {
        System.out.println("exec");
    }
}
