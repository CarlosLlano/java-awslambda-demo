package integrations.s3;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.event.S3EventNotification;

public class AWSLambdaS3Handler implements RequestHandler<S3EventNotification, String> {

  public String handleRequest(S3EventNotification s3EventNotification, Context context) {
    context.getLogger().log("Triggered by the following data: " + s3EventNotification.toJson());
    return null;
  }
}
