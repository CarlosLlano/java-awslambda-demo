package interfacehandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class AWSLambdaRequestHandler implements RequestHandler<String, String> {

  public String handleRequest(String input, Context context) {
    return String.format("RequestHandler %s received: %s", context.getFunctionName(), input);
  }
}
