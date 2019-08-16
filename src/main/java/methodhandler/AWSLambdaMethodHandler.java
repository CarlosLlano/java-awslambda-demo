package methodhandler;

public class AWSLambdaMethodHandler {

  public String handleRequest(String input) {
    return "MethodHandler received: " + input;
  }

}
