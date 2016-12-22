package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 10/24/16.
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloWorld extends AbstractHandler
{
    @Override
    public void handle( String target,
                        Request baseRequest,
                        HttpServletRequest request,
                        HttpServletResponse response ) throws IOException,
            ServletException
    {
        // Declare response encoding and types
        response.setContentType("text/html; charset=utf-8");

        // Declare response status code
        response.setStatus(HttpServletResponse.SC_OK);


        // Write back response
        response.getWriter().println("{\n" +
                "     \"icon_url\" : \"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\n" +
                "     \"id\" : \"3WPtXegnSseGH8AHKtzzoA\",\n" +
                "     \"url\" : \"http://api.chucknorris.io/jokes/3WPtXegnSseGH8AHKtzzoA\"\n" +
                "     \"value\" : \"Chuck Norris invented the female orgasm.\"\n" +
                " }");

        // Inform jetty that this request has now been handled
        baseRequest.setHandled(true);
    }

    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new HelloWorld());

        server.start();
        server.join();
    }
}
