package ast;

import java.util.logging.Logger;

/**
 * Created by willi on 24/03/2017.
 */
public class ExceptionType {

    Logger LOG = Logger.getGlobal();

    public ExceptionType(final String message){
        afficheError(message);
    }

    private void afficheError(final String message){
        LOG.severe(message);
    }

}
